package com.example.smt_fan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PairingResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pairing_result);

        boolean success = getIntent().getBooleanExtra("success", false);
        TextView resultText = findViewById(R.id.resultText);
        Button nextButton = findViewById(R.id.nextButton);

        if (success) {
            resultText.setText("Pairing Success!!\nYEPPI!!");
        } else {
            resultText.setText("Pairing Fail!!");
        }

        nextButton.setOnClickListener(v -> {
            startActivity(new Intent(PairingResultActivity.this, MainControlActivity.class));
        });
    }
}
