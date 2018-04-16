package com.example.maddiemaniaci.lab3_maniaci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] cofcClasses = new String[] {
                "CSCI 380", "CSCI 221", "DANC 490", "CITA 495", "CITA 180"
        };

        ListView listView = findViewById(R.id.list);
        ClassAdapter adapter = new ClassAdapter(this, cofcClasses);
        listView.setAdapter(adapter);
    }
}
