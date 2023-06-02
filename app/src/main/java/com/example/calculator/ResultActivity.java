package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView answer = findViewById(R.id.result);
        try {
            String first = getIntent().getExtras().getString("first");
            String second = getIntent().getExtras().getString("second");
            int stY = Integer.parseInt(second);
            int result = (Integer.parseInt(first) + (Integer.parseInt(second)));
            if (stY > 0) {
                answer.setText(first + " + " + second + " = " + result);
            } else {
                answer.setText(first + " + " + "(" + second + ")" + " = " + result);
            }
        } catch (NumberFormatException e) {
            answer.setText("Неправильный формат");
        }
    }
}
