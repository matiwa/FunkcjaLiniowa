package com.example.funkcjaliniowa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ey,ea,ex,eb;
    TextView tv;
    Button btn0,btny,btna,btnx,btnb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ey=findViewById(R.id.ey);
        ea=findViewById(R.id.ea);
        ex=findViewById(R.id.ex);
        eb=findViewById(R.id.eb);
        tv=findViewById(R.id.tv);
        btn0=findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double y,a,x,b;
                String bufor="";
                try{
                    y=0;
                    a=Double.parseDouble(ea.getText().toString());
                    b=Double.parseDouble(eb.getText().toString());
                    if(a!=0) {
                        x=(y-b)/a;
                        bufor="Miejsce zerowe ("+y+"-"+b+")/"+a+"="+x;
                    }
                    else if(a==0) bufor="Brak miejsc zerowych dla ("+y+"-"+b+")/"+a;
                    if(a>0) bufor+="\r\n\r\na>0 funkcja rosnąca";
                    else if(a==0) bufor+="\r\n\r\na>0 funkcja stała";
                    else if(a<0) bufor+="\r\n\r\na>0 funkcja malejąca";
                }catch (Exception blad){
                    Toast.makeText(MainActivity.this,blad.getMessage(),Toast.LENGTH_LONG).show();
                }finally {
                    tv.setText(bufor);
                    ey.setText("");
                    ea.setText("");
                    ex.setText("");
                    eb.setText("");
                }
            }
        });
        btny=findViewById(R.id.btny);
        btny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double y,a,x,b;
                String bufor="";
                try{
                    a=Double.parseDouble(ea.getText().toString());
                    x=Double.parseDouble(ex.getText().toString());
                    b=Double.parseDouble(eb.getText().toString());
                    y=a*x+b;
                    bufor=a+"*"+x+"+"+b+"="+y;
                    if(a>0) bufor+="\r\n\r\na>0 funkcja rosnąca";
                    else if(a==0) bufor+="\r\n\r\na>0 funkcja stała";
                    else if(a<0) bufor+="\r\n\r\na>0 funkcja malejąca";
                }catch (Exception blad){
                    Toast.makeText(MainActivity.this,blad.getMessage(),Toast.LENGTH_LONG).show();
                }finally {
                    tv.setText(bufor);
                    ey.setText("");
                    ea.setText("");
                    ex.setText("");
                    eb.setText("");
                }
            }
        });
        btna=findViewById(R.id.btna);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double y,a,x,b;
                String bufor="";
                try{
                    y=Double.parseDouble(ey.getText().toString());
                    x=Double.parseDouble(ex.getText().toString());
                    b=Double.parseDouble(eb.getText().toString());
                    a=(y-b)/x;
                    bufor="("+y+"-"+b+")/"+x+"="+a;
                    if(a>0) bufor+="\r\n\r\na>0 funkcja rosnąca";
                    else if(a==0) bufor+="\r\n\r\na>0 funkcja stała";
                    else if(a<0) bufor+="\r\n\r\na>0 funkcja malejąca";
                }catch (Exception blad){
                    Toast.makeText(MainActivity.this,blad.getMessage(),Toast.LENGTH_LONG).show();
                }finally {
                    tv.setText(bufor);
                    ey.setText("");
                    ea.setText("");
                    ex.setText("");
                    eb.setText("");
                }
            }
        });
        btnx=findViewById(R.id.btnx);
        btnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double y,a,x,b;
                String bufor="";
                try{
                    y=Double.parseDouble(ey.getText().toString());
                    a=Double.parseDouble(ea.getText().toString());
                    b=Double.parseDouble(eb.getText().toString());
                    x=(y-b)/a;
                    bufor="("+y+"-"+b+")/"+a+"="+x;
                    if(a>0) bufor+="\r\n\r\na>0 funkcja rosnąca";
                    else if(a==0) bufor+="\r\n\r\na>0 funkcja stała";
                    else if(a<0) bufor+="\r\n\r\na>0 funkcja malejąca";
                }catch (Exception blad){
                    Toast.makeText(MainActivity.this,blad.getMessage(),Toast.LENGTH_LONG).show();
                }finally {
                    tv.setText(bufor);
                    ey.setText("");
                    ea.setText("");
                    ex.setText("");
                    eb.setText("");
                }
            }
        });
        btnb=findViewById(R.id.btnb);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double y,a,x,b;
                String bufor="";
                try{
                    y=Double.parseDouble(ey.getText().toString());
                    a=Double.parseDouble(ea.getText().toString());
                    x=Double.parseDouble(ex.getText().toString());
                    b=y-(a*x);
                    bufor=y+"-("+a+"*"+x+")="+b;
                    if(a>0) bufor+="\r\n\r\na>0 funkcja rosnąca";
                    else if(a==0) bufor+="\r\n\r\na>0 funkcja stała";
                    else if(a<0) bufor+="\r\n\r\na>0 funkcja malejąca";
                }catch (Exception blad){
                    Toast.makeText(MainActivity.this,blad.getMessage(),Toast.LENGTH_LONG).show();
                }finally {
                    tv.setText(bufor);
                    ey.setText("");
                    ea.setText("");
                    ex.setText("");
                    eb.setText("");
                }
            }
        });
    }
}