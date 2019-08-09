package com.example.dynamic_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import static com.example.dynamic_quiz.terms_user.s1;
import static com.example.dynamic_quiz.user_test.count;
import static com.example.dynamic_quiz.user_test.count1;
import static com.example.dynamic_quiz.user_test.count2;
import static com.example.dynamic_quiz.user_test.p;
import static com.example.dynamic_quiz.user_test.x;
import static com.example.dynamic_quiz.user_test.y;

public class result extends AppCompatActivity {

        TextView t1,t2,t3,t4,t5,t6,t7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t1=(TextView)findViewById(R.id.textView14);
        t2=(TextView)findViewById(R.id.textView15);
        t3=(TextView)findViewById(R.id.textView16);
        t4=(TextView)findViewById(R.id.textView7);
        t5=(TextView)findViewById(R.id.textView8);
        t6=(TextView)findViewById(R.id.textView9);
        t7=(TextView)findViewById(R.id.textView12);

        if(s1.equals("Java")){
            String f = String.valueOf(p-1);
            t1.setText(f);
            String n = String.valueOf(count);
            t2.setText(n);
            float h=(float) count;
            float j= (float) (p-1);
            float g = (h/j)*100;
            String b = String.valueOf(g);
            t3.setText(b);
            g=0;
            p=1;
            count=0;
        }
        else if(s1.equals("C")){
            String f = String.valueOf(x-1);
            t1.setText(f);
            String n = String.valueOf(count1);
            t2.setText(n);
            double h=(double)count1;
            double j= (double)(x-1);
            double g = (h/j)*100;
            String b=String.valueOf(g);
            t3.setText(b);
            g=0.0;
            x=1;
            count1=0;
        }
        else
            {
                String f = String.valueOf(y-1);
                t1.setText(f);
                String n = String.valueOf(count2);
                t2.setText(n);
                double h=(double)count2;
                double j= (double)(y-1);
                double g = (h/j)*100;
                String b= String.valueOf(g);
                t3.setText(b);
                g=0.0;
                y=1;
                count2=0;
        }
    }
}
