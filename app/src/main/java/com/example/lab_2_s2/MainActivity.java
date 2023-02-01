package com.example.lab_2_s2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
 EditText txtMin;
 EditText txtMax;
 Button buttonGenerate;
 TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhxaI();
buttonGenerate.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
  String chuoi1 = txtMin.getText().toString();
  String chuoi2 = txtMax.getText().toString();
  // Ép kiểu dữ liệu chuỗi => số
        int min = Integer.parseInt(chuoi1);
        int max = Integer.parseInt(chuoi2);
        Random random = new Random();
        int number = random.nextInt(max - min + 1) + min;
        txtresult.setText(String.valueOf(number));

    }
});
    }
    private  void AnhxaI() {
        txtMin = (EditText) findViewById(R.id.editTextNumberMin);
        txtMax = (EditText) findViewById(R.id.editTextNumberMax);
        buttonGenerate = (Button) findViewById(R.id.buttonRandom);
        txtresult = (TextView) findViewById(R.id.textResultNumber);
    }
}