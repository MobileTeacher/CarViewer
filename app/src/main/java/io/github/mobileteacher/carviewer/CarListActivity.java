package io.github.mobileteacher.carviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class CarListActivity extends AppCompatActivity {


    private RecyclerView carRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);

        carRecyclerView = findViewById(R.id.recyclerview);

        Car[] carNames = {
                new Car("Ford","Fiesta", 1996, 10000.00),
                new Car("Toyota", "Corolla", 2009, 21000.76),
                new Car("Volkswagen", "Gol", 2012, 18543.98),
                new Car("Fiat", "Uno", 2018, 42000.42)};


        //Criar um Adapter para a RecyclerView
        CarAdapter adapter = new CarAdapter(carNames);
        //associar RecyclerView a um Adapter
        carRecyclerView.setAdapter(adapter);
        //Dizer a "forma" da RecyclerView
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        carRecyclerView.setLayoutManager(lm);

        carRecyclerView.addItemDecoration(
                            new DividerItemDecoration(this,
                                        DividerItemDecoration.VERTICAL));

    }

    public void addCar(View view){
        startActivity(new Intent());
    }

}
