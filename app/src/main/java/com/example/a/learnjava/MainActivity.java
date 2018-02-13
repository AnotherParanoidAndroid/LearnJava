package com.example.a.learnjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttStart;
    Button buttFinish;
    TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        buttStart = findViewById(R.id.buttStart);
        buttFinish = findViewById(R.id.buttFinish);
        showText = findViewById(R.id.tv);

        View.OnClickListener startListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showText.setText("Goodbye world!");
            }
        };

        buttStart.setOnClickListener(startListener);

    }
}
