package com.nagdos.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ilkSayi;
    EditText ikinciSayi;
    TextView sonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ilkSayi = findViewById(R.id.ilkSayi);
        ikinciSayi = findViewById(R.id.ikinciSayi);
        sonuc = findViewById(R.id.sonuc);
    }

    public void topla(View view){
        int ilk = Integer.parseInt(ilkSayi.getText().toString());
        int ikinci = Integer.parseInt(ikinciSayi.getText().toString());
        int topla = ilk+ikinci;
        sonuc.setText("Sonuç : "+topla);
    }

    public void cikar(View view){
        int ilk = Integer.parseInt(ilkSayi.getText().toString());
        int ikinci = Integer.parseInt(ikinciSayi.getText().toString());
        int cikar = ilk-ikinci;
        sonuc.setText("Sonuç : "+cikar);
    }

    public void carp(View view){
        int ilk = Integer.parseInt(ilkSayi.getText().toString());
        int ikinci = Integer.parseInt(ikinciSayi.getText().toString());
        int carp = ilk*ikinci;
        sonuc.setText("Sonuç : "+carp);
    }

    public void bol(View view){
        int ilk = Integer.parseInt(ilkSayi.getText().toString());
        int ikinci = Integer.parseInt(ikinciSayi.getText().toString());
        int bol = ilk/ikinci;
        sonuc.setText("Sonuç : "+bol);
    }

    public void temizle(View view){
        ilkSayi.setText("");
        ikinciSayi.setText("");
        sonuc.setText("Sonuç : ");
    }

}
