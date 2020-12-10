package com.azizgorkemakpur.evdekaluygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText=(EditText) findViewById(R.id.edtyas);
        Button durumbtn =(Button) findViewById(R.id.buttondurum);
        final TextView sonuc= (TextView) findViewById(R.id.sonuctxt);

        Log.v("TAG",CurrentHour()+"");

        durumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(MainActivity.this,editText.getText().toString(),Toast.LENGTH_SHORT).show();
                    int yas =yashesapla(Integer.parseInt(editText.getText().toString()));
                    int saat=CurrentHour();
                    boolean haftasonumu=HaftaSonu();

                    if(yas<20)
                    {
                        if(saat>=13 && saat<16)
                        {
                            sonuc.setText("Serbestsiniz");
                        }
                        else
                            {
                                sonuc.setText("yasak");
                            }
                    }
                    else if(yas>20 && yas<65)
                    {
                        if(haftasonumu)
                        {
                            sonuc.setText("yasak");
                        }
                        else
                        {
                            sonuc.setText("serbest");
                        }
                    }
                    else if(yas>65)
                    {
                        if(saat>=10 && saat<13)
                        {
                            sonuc.setText("serbest");
                        }
                        else
                            {
                                sonuc.setText("yasak");
                            }

                    }
                }

        });

    }
public int CurrentYear()
{
    Date date = Calendar.getInstance().getTime();
    DateFormat dateFormat=new SimpleDateFormat("yyyy");
    String tarih=dateFormat.format(date);
    int tarihint=Integer.parseInt(tarih);
    return tarihint;
}
public int CurrentDay()
{
    Date date=Calendar.getInstance().getTime();
    DateFormat dateFormat=new SimpleDateFormat("u");
    String tarih=dateFormat.format(date);
    int currentday=Integer.parseInt(tarih);
    return currentday;
}
public int CurrentHour()
{
    Date date=Calendar.getInstance().getTime();
    DateFormat dateFormat=new SimpleDateFormat("k");
    String tarih=dateFormat.format(date);
    int currentday=Integer.parseInt(tarih);
    return currentday;
}
public boolean HaftaSonu()
{
if(CurrentDay()==6 || CurrentDay()==7)
{
    return true;
}
else
    {
        return false;
    }

}
public int yashesapla(int yil)
{
    return CurrentYear()-yil;
}









}