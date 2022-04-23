package com.example.sp18_bse_024_assin_02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,BB,BE;
    //private EditText disp;
    private TextView disp;
    int p=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B0=findViewById(R.id.b0);
        B1=findViewById(R.id.b1);
        B2=findViewById(R.id.b2);
        B3=findViewById(R.id.b3);
        B4=findViewById(R.id.b4);
        B5=findViewById(R.id.b5);
        B6=findViewById(R.id.b6);
        B7=findViewById(R.id.b7);
        B8=findViewById(R.id.b8);
        B9=findViewById(R.id.b9);
        BB=findViewById(R.id.bb);
        BE=findViewById(R.id.be);
        disp=findViewById(R.id.Display);
        disp.setText("");
        disp.setFilters(new InputFilter[] { new InputFilter.LengthFilter(4) });




        B0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String s= (String) disp.getText();
                disp.setText(s+"0");
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= (String) disp.getText();
                disp.setText(s+"1");
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= (String) disp.getText();
                //if()

                disp.setText(s+"2");
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= (String) disp.getText();
                disp.setText(s+"3");
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= (String) disp.getText();
                disp.setText(s+"4");
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= (String) disp.getText();
                disp.setText(s+"5");
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= (String) disp.getText();
                disp.setText(s+"6");
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= (String) disp.getText();
                disp.setText(s+"7");
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= (String) disp.getText();
                disp.setText(s+"8");
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= (String) disp.getText();
                disp.setText(s+"9");
            }
        });
        BB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=disp.getText().toString();
                if(s.isEmpty()){

                }else {
                    disp.setText(s.substring(0, s.length() - 1));
                }

            }
        });
        BE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="0340";
                if((p==3)&&("".equalsIgnoreCase(disp.getText().toString()))){
                    Toast.makeText(MainActivity.this, "Invalid Password \n attempts remaining "+ --p, Toast.LENGTH_SHORT).show();


                } else if(p>0){
                        if(s.equalsIgnoreCase(disp.getText().toString())){
                            open();

                         }
                        else{
                            Toast.makeText(MainActivity.this, "Invalid Password \n attempts remaining "+ --p, Toast.LENGTH_SHORT).show();
                            disp.setText("");
                             }
                }else{

                    finish();
                }
            }
        });

    }
    public void open() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}