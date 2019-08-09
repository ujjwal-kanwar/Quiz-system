package com.example.dynamic_quiz;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class user_login extends AppCompatActivity {
    EditText  id,pswd;
    int i1=1;
    Button lg,rg;
    static String s1,s2;
    quesdatabse obj1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        id=(EditText)findViewById(R.id.editText3);
        pswd=(EditText)findViewById(R.id.editText4);
        lg=(Button)findViewById(R.id.button2);
        rg=(Button)findViewById(R.id.button3);
        obj1=new quesdatabse(this);


        lg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        s1 = id.getText().toString();
                        s2 = pswd.getText().toString();
                        int x = Integer.parseInt(s1);


                        try{
                            Cursor c = obj1.get_quiz(x,s2);

                            if(s1.isEmpty()||s2.isEmpty())
                            {

                                    Toast.makeText(user_login.this, "please fill", Toast.LENGTH_SHORT).show();
                            }

                            else if(c.getCount()==0){

                                Toast.makeText(user_login.this, "data Not Found", Toast.LENGTH_LONG).show();
                            }
                            else {
                                c.moveToFirst();
                                int idd = c.getInt(0);
                                String password = c.getString(2);
                                if (idd==x && password.equals(s2)) {
                                    Toast.makeText(user_login.this, "done", Toast.LENGTH_SHORT).show();
                                    Intent i = new Intent(user_login.this, terms_user.class);
                                    startActivity(i);
                                }
                                else {
                                    Toast.makeText(user_login.this, "try again...", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }catch (Exception p)
                        {
                            Toast.makeText(user_login.this, "error="+p, Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );

        rg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent o = new Intent(user_login.this,registrartion.class);
                        startActivity(o);

                    }
                }
        );

    }
}
