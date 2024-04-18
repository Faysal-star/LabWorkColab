package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public Button button , button2;
    public int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        textView.setText("Button clicked 0 times");

        button.setOnClickListener(v -> {
            i++;
            textView.setText("Button clicked " + i + " times");
        });

        button2.setOnClickListener(v -> {
            i--;
            textView.setText("Button clicked " + i + " times");
        });
    }
}