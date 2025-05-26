package com.example.smt_fan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainControlActivity extends AppCompatActivity {
    private boolean powerOn = false;
    private int airflow = 50;
    private boolean rotation = false;
    private boolean automation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_control);

        Switch powerSwitch = findViewById(R.id.powerSwitch);
        SeekBar airflowSeekBar = findViewById(R.id.airflowSeekBar);
        TextView airflowValue = findViewById(R.id.airflowValue);
        Switch rotationSwitch = findViewById(R.id.rotationSwitch);
        Switch automationSwitch = findViewById(R.id.automationSwitch);
        Button timerButton = findViewById(R.id.timerButton);

        powerSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> powerOn = isChecked);

        airflowSeekBar.setMax(100);
        airflowSeekBar.setProgress(airflow);
        airflowValue.setText(String.valueOf(airflow));
        airflowSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                airflow = progress;
                airflowValue.setText(String.valueOf(airflow));
            }
            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        rotationSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> rotation = isChecked);
        automationSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> automation = isChecked);

        timerButton.setOnClickListener(v -> {
            startActivity(new Intent(MainControlActivity.this, TimerActivity.class));
        });
    }
}
