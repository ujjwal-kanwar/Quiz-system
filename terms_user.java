package com.example.dynamic_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class terms_user extends AppCompatActivity {
    Spinner spp;
    static String s1="";
    String name[]={"Select subject","Java","C","DSA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_user);

        spp=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String> obj;
        obj=new ArrayAdapter<String>(terms_user.this,R.layout.support_simple_spinner_dropdown_item,name);
        spp.setAdapter(obj);

        spp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                 s1 = String.valueOf(adapterView.getItemAtPosition(i));

                if (s1.equals("Java") || s1.equals("C") || s1.equals("DSA"))
                {

                    Intent ikk = new Intent(terms_user.this, user_test.class);
                    startActivity(ikk);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
