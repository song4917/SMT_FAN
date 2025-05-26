package com.example.smt_fan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class DeviceSelectActivity extends AppCompatActivity {
    String[] devices = {"Smart Fan 1", "Smart Fan 2", "Smart Fan 3", "Smart Fan 4", "Smart Fan 5", "Smart Fan 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_select);

        ListView listView = findViewById(R.id.deviceListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, devices);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            // 실제 페어링 로직 필요
            Intent intent = new Intent(DeviceSelectActivity.this, PairingResultActivity.class);
            intent.putExtra("success", true); // 성공/실패 구분
            startActivity(intent);
        });
    }
}
