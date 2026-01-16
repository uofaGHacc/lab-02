package com.example.listycity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;



public class MainActivity extends AppCompatActivity {

    ListView cityList;
    ArrayAdapter<String> cityAdapter;
    ArrayList<String> dataList;

    // Lab02 Participation
    Button addbutton;
    Button deletebutton;
    Button confirmbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cityList = findViewById(R.id.city_list);
        String[] cities = {"Edmonton", "Vancouver", "Moscow", "Sydney", "Berlin", "Vienna", "Tokyo", "Beijing", "Osaka", "New Delhi"};

        dataList = new ArrayList<>();
        dataList.addAll(Arrays.asList(cities));

        cityAdapter = new ArrayAdapter<>(this, R.layout.content, dataList);
        cityList.setAdapter(cityAdapter);



        // Lab02 Participation

        View.OnClickListener addListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // add city
            }
        };

        View.OnClickListener deleteListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // delete city
            }
        };

        AdapterView.OnItemClickListener citySelect;

        View.OnClickListener addCityInput = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Input City to add
            }
        };;

        addbutton = findViewById(R.id.add);
        deletebutton = findViewById(R.id.delete);
        EditText editText = findViewById(R.id.search);
        confirmbutton = findViewById(R.id.confirm);
        
        addbutton.setOnClickListener(addListener);
        deletebutton.setOnClickListener(deleteListener);
        editText.setOnClickListener(addCityInput);
    }
}
