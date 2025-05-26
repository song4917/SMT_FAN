package com.example.smt_fan;

import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TimerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        NumberPicker hourPicker = findViewById(R.id.hourPicker);
        NumberPicker minPicker = findViewById(R.id.minPicker);
        NumberPicker secPicker = findViewById(R.id.secPicker);
        Button startButton = findViewById(R.id.startButton);

        hourPicker.setMinValue(0); hourPicker.setMaxValue(23);
        minPicker.setMinValue(0); minPicker.setMaxValue(59);
        secPicker.setMinValue(0); secPicker.setMaxValue(59);

        startButton.setOnClickListener(v -> {
            // 타이머 값 저장 및 동작
            finish();
        });
    }
}
