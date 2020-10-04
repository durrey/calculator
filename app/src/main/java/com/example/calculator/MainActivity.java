package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText txt1;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btneq,btnpt,btnc,btnadd,btnsub,btnmul,btndiv;
    float r1;
    float r2;
    int count = 0;
    boolean a,s,d,m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnmul = (Button) findViewById(R.id.btnmul);
        btneq = (Button) findViewById(R.id.btneq);
        btnc = (Button) findViewById(R.id.btnc);
        btnpt = (Button) findViewById(R.id.btnpt);
        txt1 = (EditText) findViewById(R.id.ed1);
        //btnm = (Button) findViewById(R.id.button13);

        //onclik listeners
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "9");
            }
        });
        btnpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + ".");
                count++;
                if(count>1)
                    txt1.setText("");
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("");
            }
        });



        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txt1.setText(txt1.getText()+"/");
                if(txt1==null){
                    txt1.setText("");
                }
                else{
                    r1=Float.parseFloat(txt1.getText()+" ");
                    d=true;
                    txt1.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txt1.setText(txt1.getText()+"/");
                if(txt1==null){
                    txt1.setText("");
                }
                else{
                    r1=Float.parseFloat(txt1.getText()+" ");
                    m=true;
                    txt1.setText(null);
                }
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txt1.setText(txt1.getText()+"/");
                if(txt1==null){
                    txt1.setText("");
                }
                else{
                    r1=Float.parseFloat(txt1.getText()+" ");
                    a=true;
                    txt1.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txt1.setText(txt1.getText()+"/");
                if(txt1==null){
                    txt1.setText("");
                }
                else{
                    r1=Float.parseFloat(txt1.getText()+" ");
                    s=true;
                    txt1.setText(null);
                }
            }
        });


        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r2=Float.parseFloat(txt1.getText()+" ");
                if(a==true)
                {
                    txt1.setText(r1+r2+" ");
                    a=false;
                }
                if(d==true)
                {
                    txt1.setText(r1/r2+" ");
                    d=false;
                }
                if(s==true)
                {
                    txt1.setText(r1-r2+" ");
                    s=false;
                }
                if(m==true)
                {
                    txt1.setText(r1*r2+" ");
                    m=false;
                }
            }
        });





    }
}