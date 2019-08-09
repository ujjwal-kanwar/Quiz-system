package com.example.dynamic_quiz;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.dynamic_quiz.terms_user.s1;

public class user_test extends AppCompatActivity {

    TextView qu;
   RadioGroup rb;
    static int x = 1,y = 1;
   static int count=0,count1=0,count2=0;
    RadioButton r1,r2,r3,r4,ra;
    Button sub;
    quesdatabse obj1;
   static int p=1;
   String c="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_test);

        qu = (TextView) findViewById(R.id.textView4);
         rb=(RadioGroup)findViewById(R.id.rr);
        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);
        r4 = (RadioButton) findViewById(R.id.radioButton4);
        sub = (Button) findViewById(R.id.button6);
        rb=(RadioGroup)findViewById(R.id.rr);
        obj1 = new quesdatabse(this);

        if(s1.equals("Java")) {

            try {

                Cursor cp = obj1.set_quiz(p);

                if (cp.getCount() != 0) {
                    cp.moveToFirst();

                    qu.setText(cp.getString(1));
                    r1.setText(cp.getString(2));
                    r2.setText(cp.getString(3));
                    r3.setText(cp.getString(4));
                    r4.setText(cp.getString(5));
                     c = cp.getString(6);

                } else {

                    Toast.makeText(user_test.this, "Finish", Toast.LENGTH_LONG).show();
                    Intent n = new Intent(user_test.this,result.class);
                    startActivity(n);
                }

            } catch (Exception t) {
                Toast.makeText(this, "error " + t, Toast.LENGTH_SHORT).show();
            }

            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    p++;
                    try {
                        Cursor cp = obj1.set_quiz(p);

                        if (cp.getCount() == 0) {

                            int f =rb.getCheckedRadioButtonId();
                            ra=(RadioButton)findViewById(f);
                            String cc = ra.getText().toString();
                            if(cc.equals(c))
                            {
                                count++;
                            }
                            Toast.makeText(user_test.this, "Finish", Toast.LENGTH_LONG).show();
                            Intent n = new Intent(user_test.this,result.class);
                            startActivity(n);
                        } else {

                            int f =rb.getCheckedRadioButtonId();
                            ra=(RadioButton)findViewById(f);
                            String cc = ra.getText().toString();
                            if(cc.equals(c))
                            {
                                count++;
                            }

                            cp.moveToFirst();

                            qu.setText(cp.getString(1));
                            r1.setText(cp.getString(2));
                            r2.setText(cp.getString(3));
                            r3.setText(cp.getString(4));
                            r4.setText(cp.getString(5));
                             c =cp.getString(6);
                        }

                    } catch (Exception t) {
                        Toast.makeText(user_test.this, "error" + t, Toast.LENGTH_SHORT).show();
                    }


                }
            });
        }
        else if(s1.equals("C")){
            try {

                Cursor cp = obj1.set_quiz1(x);

                if (cp.getCount() != 0) {
                    cp.moveToFirst();

                    qu.setText(cp.getString(1));
                    r1.setText(cp.getString(2));
                    r2.setText(cp.getString(3));
                    r3.setText(cp.getString(4));
                    r4.setText(cp.getString(5));
                    c=cp.getString(6);

                } else {

                    Toast.makeText(user_test.this, "data Not Found", Toast.LENGTH_LONG).show();
                }

            } catch (Exception t) {
                Toast.makeText(this, "error " + t, Toast.LENGTH_SHORT).show();
            }

            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    x++;
                    try {

                        Cursor cp = obj1.set_quiz1(x);

                        if (cp.getCount() == 0) {
                            int f =rb.getCheckedRadioButtonId();
                            ra=(RadioButton)findViewById(f);
                            String cc = ra.getText().toString();
                            if(cc.equals(c))
                            {
                                count1++;
                            }

                            Toast.makeText(user_test.this, "Finish", Toast.LENGTH_LONG).show();
                            Intent n = new Intent(user_test.this,result.class);
                            startActivity(n);
                        } else {
                            int f =rb.getCheckedRadioButtonId();
                            ra=(RadioButton)findViewById(f);
                            String cc = ra.getText().toString();
                            if(cc.equals(c))
                            {
                                count1++;
                            }

                            cp.moveToFirst();

                            qu.setText(cp.getString(1));
                            r1.setText(cp.getString(2));
                            r2.setText(cp.getString(3));
                            r3.setText(cp.getString(4));
                            r4.setText(cp.getString(5));
                            c=cp.getString(6);

                        }

                    } catch (Exception t) {
                        Toast.makeText(user_test.this, "error" + t, Toast.LENGTH_SHORT).show();
                    }


                }
            });

        }
        else {
            try {

                Cursor cp = obj1.set_quiz2(y);

                if (cp.getCount() != 0) {
                    cp.moveToFirst();

                    qu.setText(cp.getString(1));
                    r1.setText(cp.getString(2));
                    r2.setText(cp.getString(3));
                    r3.setText(cp.getString(4));
                    r4.setText(cp.getString(5));
                    c=cp.getString(6);

                } else {

                    Toast.makeText(user_test.this, "data Not Found", Toast.LENGTH_LONG).show();
                }

            } catch (Exception t) {
                Toast.makeText(this, "error " + t, Toast.LENGTH_SHORT).show();
            }

            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    y++;
                    try {

                        Cursor cp = obj1.set_quiz2(y);

                        if (cp.getCount() == 0) {
                            int f =rb.getCheckedRadioButtonId();
                            ra=(RadioButton)findViewById(f);
                            String cc = ra.getText().toString();
                            if(cc.equals(c))
                            {
                                count2++;
                            }

                            Toast.makeText(user_test.this, "Finish", Toast.LENGTH_LONG).show();
                            Intent n = new Intent(user_test.this,result.class);
                            startActivity(n);
                        } else {
                            int f =rb.getCheckedRadioButtonId();
                            ra=(RadioButton)findViewById(f);
                            String cc = ra.getText().toString();
                            if(cc.equals(c))
                            {
                                count2++;
                            }

                            cp.moveToFirst();

                            qu.setText(cp.getString(1));
                            r1.setText(cp.getString(2));
                            r2.setText(cp.getString(3));
                            r3.setText(cp.getString(4));
                            r4.setText(cp.getString(5));
                            c=cp.getString(6);
                        }

                    } catch (Exception t) {
                        Toast.makeText(user_test.this, "error" + t, Toast.LENGTH_SHORT).show();
                    }


                }
            });
        }
        }
    }

