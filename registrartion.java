package com.example.dynamic_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registrartion extends AppCompatActivity {

    EditText id,nm,ps;
    Button sbb;
    quesdatabse obj1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrartion);
        obj1=new quesdatabse(this);

        id=(EditText)findViewById(R.id.editText5);
        nm=(EditText)findViewById(R.id.editText6);
        ps=(EditText)findViewById(R.id.editText7);
        sbb=(Button)findViewById(R.id.button4);

        sbb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String id1 = id.getText().toString();
                        String name = nm.getText().toString();
                        String pswd = ps.getText().toString();
                        try{

                            if(nm.length()!=0&&ps.length()!=0&&id.length()!=0) {
                                obj1.user_reg(id1, name, pswd);
                                Toast.makeText(registrartion.this, "registered..", Toast.LENGTH_SHORT).show();
                            }
                        }
                         catch (Exception e)
                         {
                             Toast.makeText(registrartion.this, "try again"+e, Toast.LENGTH_SHORT).show();
                         }

                        Intent ik = new Intent(registrartion.this,user_login.class);
                        startActivity(ik);
                    }
                }
        );

    }
}
