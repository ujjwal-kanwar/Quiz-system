package com.example.dynamic_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class condition_admin extends AppCompatActivity {

    Spinner spp;
    String name[]={"Select subject","Java","C","DSA"};
    static String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condition_admin);
        spp=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String>obj;
        obj=new ArrayAdapter<String>(condition_admin.this,R.layout.support_simple_spinner_dropdown_item,name);
        spp.setAdapter(obj);

        spp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                s = (String) adapterView.getItemAtPosition(i);

                if (s.equals("Java") || s.equals("C") || s.equals("DSA")) {

                    Intent ikk = new Intent(condition_admin.this, enter_ques.class);
                    startActivity(ikk);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
