package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView teksti;
    BottleDispenser bottledispenser1 = BottleDispenser.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teksti = (TextView) findViewById(R.id.textView);
    }

    public void addMoney(View view){
        teksti.setText(bottledispenser1.addMoney());
    }

    public  void buyBottle(View view) {
        teksti.setText(bottledispenser1.buyBottle());
    }

    public void getMoney(View view) {
        teksti.setText(bottledispenser1.returnMoney());
    }
}
