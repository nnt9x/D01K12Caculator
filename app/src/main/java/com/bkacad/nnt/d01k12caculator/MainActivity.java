package com.bkacad.nnt.d01k12caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtA, edtB;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtA = findViewById(R.id.edtNumberA);
        edtB = findViewById(R.id.edtNumberB);
        tvResult = findViewById(R.id.tvResult);
    }

    public void congAB(View view) {
        // Bước 1: Lấy dữ liệu ở 2 ô edttext
        String strA = edtA.getText().toString();
        if(strA.isEmpty()){
            edtA.setError("Hãy nhập số A");
            return;
        }
        String strB = edtB.getText().toString();
        if(strA.isEmpty()){
            edtB.setError("Hãy nhập số B");
            return;
        }
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double rs = a + b;

        tvResult.setText("Result: "+rs);

    }

    public void chiaAB(View view) {
        // Bước 1: Lấy dữ liệu ở 2 ô edttext
        String strA = edtA.getText().toString();
        if(strA.isEmpty()){
            edtA.setError("Hãy nhập số A");
            return;
        }
        String strB = edtB.getText().toString();
        if(strA.isEmpty()){
            edtB.setError("Hãy nhập số B");
            return;
        }
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        if(b == 0){
            tvResult.setText("Error");
        }
        else {
            double rs = a / b;
            tvResult.setText("Result: "+rs);
        }
    }
}