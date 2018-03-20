package com.example.chanrdrapratap.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public double intInput(String string) {
        EditText dollarInput = (EditText) findViewById(R.id.usdInput);
        double usdInputDouble = Double.parseDouble(dollarInput.getText().toString());
    }

    public void makeToast(String string){
        Toast.makeText(this,string, Toast.LENGTH_LONG).show();
    }
    public void onClickINR(View view){

        Double inrOutputDouble = intInput()*63.58;
        makeToast("INR Rs."+String.format("%.2d",inrOutputDouble));

    }

    public void onClickEURO(View view){

        Double euroOutputDouble = intInput()*0.81;
        makeToast("EURO €"+String.format("%.2d",euroOutputDouble));

    }

    public void onClickPOUND(View view){

        Double poundOutputDouble = intInput()*0.71;
        makeToast("BRITISH POUND £"+String.format("%.2d",poundOutputDouble));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
