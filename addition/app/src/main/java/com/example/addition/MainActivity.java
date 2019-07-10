package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView res1;
    private Button addb;
    private double val1= Double.NaN;
    private double val2;
    private double r=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1= (EditText)findViewById(R.id.num1);
        num2= (EditText)findViewById(R.id.num2);
        res1=(TextView)findViewById(R.id.res);


        addb=(Button)findViewById(R.id.addb);

        //val1=Double.parseDouble(num1.getText().toString());

        //res1=Double.parseDouble(res1.getText().toString());


        addb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(num1.getText().toString());
                if(!Double.isNaN(val1))
                {
                    val2=Double.parseDouble(num2.getText().toString());
                    r=val1+val2;

                }
                else
                {
                    val1=Double.parseDouble(num1.getText().toString());
                }


                res1.setText(String.valueOf(r));


            }
        });


    }



}
