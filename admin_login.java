package com.example.dynamic_quiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class admin_login extends AppCompatActivity {

    EditText us, ps;
    Button sb;
    SharedPreferences s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        us = (EditText) findViewById(R.id.editText);
        ps = (EditText) findViewById(R.id.editText2);
        sb = (Button) findViewById(R.id.button);

        s = getSharedPreferences("sp", 0);
        final SharedPreferences.Editor edit = s.edit();

        sb.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {

                                      String user = us.getText().toString();
                                      String pass = ps.getText().toString();

                                      if (user.equals("admin") && pass.equals("1234")) {

                                          edit.putString("k1", user);
                                          edit.putString("k2", pass);
                                          edit.commit();

                                          us.setText(null);
                                          ps.setText(null);
                                          us.requestFocus();

                                          Intent i = new Intent(admin_login.this, condition_admin.class);
                                          startActivity(i);

                                      }
                                      else {
                                          Toast.makeText(admin_login.this, "invalid user_name or password..", Toast.LENGTH_SHORT).show();
                                      }

                                  }
                              }
        );


    }
}
