package com.example.sampleprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity4 extends AppCompatActivity {

    private int CurrentProgress=80;
    private ProgressBar progressBar;
    private Button startProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        progressBar=findViewById(R.id.progressBar);
        startProgress=findViewById(R.id.start_progress);

        startProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CurrentProgress=CurrentProgress+20;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);

                Intent in = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(in);
            }
        });


    }
}