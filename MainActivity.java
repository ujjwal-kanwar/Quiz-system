package com.example.dynamic_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread obj = new Thread()
        {

            public  void  run()
            {
                try{
                    sleep(3000);
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "error"+e, Toast.LENGTH_SHORT).show();
                }
                finally {
                    Intent i = new Intent(MainActivity.this, welcome_page.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        obj.start();
    }
}
