package com.example.pedometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private TextView progressText;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.progress_bar);
        progressText=findViewById(R.id.progress_text);
        final Handler handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                AtomicReference<Runnable> r;
                if(i<=100) {
                    progressText.setText("" + i);
                    progressBar.setProgress(i);
                    i++;
                    handler.postDelayed(r:this, delayMillis: 200)

                }
                else{
                    handler.removeCallbacks(r:this);
                }

                }, delayMillis:200);


    }
}