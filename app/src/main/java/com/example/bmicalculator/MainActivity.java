package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t1=(TextView)findViewById(R.id.textView);
        final TextView t2=(TextView)findViewById(R.id.textView2);
        final TextView t3=(TextView)findViewById(R.id.textView3);
        final TextView t4=(TextView)findViewById(R.id.textView4);
       final  EditText e1=(EditText)findViewById(R.id.editText);
        final ImageView i1=(ImageView)findViewById(R.id.imageView4);
        final  EditText e2=(EditText)findViewById(R.id.editText2);
        Button b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a1=e1.getText().toString();
                String a2=e2.getText().toString();
                Float BMI = Float.parseFloat(a2) / (Float.parseFloat(a1) * Float.parseFloat(a1));
                t3.setText(Float.toString(BMI));
                if(BMI<18.5)
                {
                    t4.setText("You Are Underweight");
                    i1.setImageResource(R.drawable.speedometer1);
                }
                else if(BMI>=18.5 && BMI<=24.9)
                {
                    t4.setText("You Are Healthy");
                    i1.setImageResource(R.drawable.speedometer2);
                }
                else if(BMI>=25 && BMI<=32.9)
                {
                    t4.setText("You Are Overweight");
                    i1.setImageResource(R.drawable.speedometer3);
                }
                else if(BMI>=33)
                {
                    t4.setText("You Are Obese");
                    i1.setImageResource(R.drawable.speedometer4);
                }
            }
        });
    }
}
