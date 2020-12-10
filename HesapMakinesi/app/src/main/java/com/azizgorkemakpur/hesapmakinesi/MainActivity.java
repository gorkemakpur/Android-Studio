package com.azizgorkemakpur.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        Result=findViewById(R.id.Result);

    }
    public void sum(View view)
    {
        if(number1.getText().toString().matches("")||number2.getText().toString().matches(""))
        {
        Result.setText("Lütfen Sayı Giriniz");
        }
        else {
            int s1 = Integer.parseInt(number1.getText().toString());
            int s2 = Integer.parseInt(number2.getText().toString());

            int result = s1 + s2;
            Result.setText("Result:" + result);
             }
    }
    public void multiply(View view)
    {
        if(number1.getText().toString().matches("") ||number2.getText().toString().matches(""))
        {
            Result.setText("Lütfen Sayı Giriniz");
        }
        else {
        int s1 = Integer.parseInt(number1.getText().toString());
        int s2=Integer.parseInt(number2.getText().toString());
        int result=s1*s2;
        Result.setText("Result:"+result);
    }}
    public void deduct(View view)
    {if(number1.getText().toString().matches("")||number2.getText().toString().matches(""))
    {
        Result.setText("Lütfen Sayı Giriniz");
    }
    else {
        int s1 = Integer.parseInt(number1.getText().toString());
        int s2=Integer.parseInt(number2.getText().toString());
        int result=s1-s2;
        Result.setText("Result:"+result);
    }}
    public void divide(View view)
    {if(number1.getText().toString().matches("")||number2.getText().toString().matches(""))
    {
        Result.setText("Lütfen Sayı Giriniz");
    }
    else {
        int s1 = Integer.parseInt(number1.getText().toString());
        int s2=Integer.parseInt(number2.getText().toString());
        int result=s1/s2;
        Result.setText("Result:"+result);
    }}
}