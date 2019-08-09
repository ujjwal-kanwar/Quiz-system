package com.example.dynamic_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.dynamic_quiz.condition_admin.s;

public class enter_ques extends AppCompatActivity {

    EditText que,op1,op2,op3,op4,ans;
    Button subb;
    quesdatabse obj1;
    static String g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_ques);
        subb=(Button)findViewById(R.id.button5);
        que =(EditText)findViewById(R.id.editText8);
        op1 =(EditText)findViewById(R.id.editText9);
        op2 =(EditText)findViewById(R.id.editText10);
        op3 =(EditText)findViewById(R.id.editText11);
        op4 =(EditText)findViewById(R.id.editText12);
        ans =(EditText)findViewById(R.id.editText13);
        obj1= new quesdatabse(this);
          g =s;


        if(s.equals("Java")) {
            subb.setOnClickListener(
                    new View.OnClickListener() {


                        public void onClick(View v) {
                            String q = que.getText().toString();
                            String o1 = op1.getText().toString();
                            String o2 = op2.getText().toString();
                            String o3 = op3.getText().toString();
                            String o4 = op4.getText().toString();
                            String A = ans.getText().toString();

                            try {

                                obj1.ad_quiz(q, o1, o2, o3, o4, A);
                                Toast.makeText(enter_ques.this, "Data inserted..", Toast.LENGTH_SHORT).show();
                                cln();

                            } catch (Exception t) {
                                Toast.makeText(enter_ques.this, "not inserted...", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
            );
        }

        else if(s.equals("C")) {
            subb.setOnClickListener(
                    new View.OnClickListener() {


                        public void onClick(View v) {
                            String q = que.getText().toString();
                            String o1 = op1.getText().toString();
                            String o2 = op2.getText().toString();
                            String o3 = op3.getText().toString();
                            String o4 = op4.getText().toString();
                            String A = ans.getText().toString();

                            try {

                                obj1.ad_quiz1(q, o1, o2, o3, o4, A);
                                Toast.makeText(enter_ques.this, "Data inserted..", Toast.LENGTH_SHORT).show();
                                cln();

                            } catch (Exception t) {
                                Toast.makeText(enter_ques.this, "not inserted...", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
            );
        }
        else if(s.equals("DSA")) {
            subb.setOnClickListener(
                    new View.OnClickListener() {


                        public void onClick(View v) {
                            String q = que.getText().toString();
                            String o1 = op1.getText().toString();
                            String o2 = op2.getText().toString();
                            String o3 = op3.getText().toString();
                            String o4 = op4.getText().toString();
                            String A = ans.getText().toString();

                            try {

                                obj1.ad_quiz2(q, o1, o2, o3, o4, A);
                                Toast.makeText(enter_ques.this, "Data inserted..", Toast.LENGTH_SHORT).show();
                                cln();

                            } catch (Exception t) {
                                Toast.makeText(enter_ques.this, "not inserted...", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
            );
        }



    }
    public  void cln()
    {
        que.setText(null);
        que.requestFocus();
        op1.setText(null);
        op2.setText(null);
        op3.setText(null);
        op4.setText(null);
        ans.setText(null);

    }
}
