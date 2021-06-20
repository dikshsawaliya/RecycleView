package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Car Brand App";
    Button btn_addOne;

    List<CarBrand> carBrandList = new ArrayList<CarBrand>();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillCarBrandList();
        Log.d(TAG, "onCreate: " + carBrandList.toString());
        Toast.makeText(this, "Car Brand count = " + carBrandList.size(), Toast.LENGTH_SHORT).show();


        btn_addOne = findViewById(R.id.btn_addOne);

        btn_addOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , AddEditOne.class );
                startActivity(intent);

            }
        });

        recyclerView = findViewById(R.id.lv_carbrandlist);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new RecycleViewAdapter(carBrandList);
        recyclerView.setAdapter(mAdapter);
    }

    private void fillCarBrandList() {

        CarBrand p0 = new CarBrand(1,"Cadillac",1901, "https://www.oldest.org/wp-content/uploads/2017/10/cadilac.png" );
        CarBrand p1 = new CarBrand(2, "Fiat", 1899, "https://www.oldest.org/wp-content/uploads/2017/10/fiat.png");
        CarBrand p2 = new CarBrand(3,"Renault",1899, "https://www.oldest.org/wp-content/uploads/2017/10/renault.png" );
        CarBrand p3 = new CarBrand(4,"Land Rover",1896, "https://www.oldest.org/wp-content/uploads/2017/10/land_rover.png" );
        CarBrand p4 = new CarBrand(5,"Skoda",1895, "https://www.oldest.org/wp-content/uploads/2017/10/%C5%A1koda.png" );
        CarBrand p5 = new CarBrand(6,"Mercedes-Benz",1883, "https://www.oldest.org/wp-content/uploads/2017/10/Mercedes-Benz.png" );
        CarBrand p6 = new CarBrand(7,"Opel",1862, "https://www.oldest.org/wp-content/uploads/2017/10/opel.png" );
        CarBrand p7 = new CarBrand(8,"Peugeot",1810, "https://www.oldest.org/wp-content/uploads/2017/10/Peugeot.png" );
        CarBrand p8 = new CarBrand(9,"Audi",1909, "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Audi-Logo_2016.svg/220px-Audi-Logo_2016.svg.png" );
        CarBrand p9 = new CarBrand(10,"BMW",1916, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/BMW.svg/180px-BMW.svg.png" );

        carBrandList.addAll(Arrays.asList(new CarBrand[]{p0,p1,p2,p3,p4,p5,p6,p7,p8,p9}));
    }

}