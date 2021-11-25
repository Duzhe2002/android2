package com.situ.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "MainActivity";
    private Button downloadBtn;
    private Button downloadBtn1;
    private Button downloadBtn2;
    private ProgressBar progressBar;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        downloadBtn = (Button) findViewById(R.id.downloadBtn);
        downloadBtn1 = (Button) findViewById(R.id.downloadBtn1);
        downloadBtn2 = (Button) findViewById(R.id.downloadBtn2);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        editText = (EditText) findViewById(R.id.editText);

        downloadBtn.setOnClickListener(this);
        downloadBtn1.setOnClickListener(this);
        downloadBtn2.setOnClickListener(this);

        /*downloadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        downloadBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        downloadBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }

    /// Button extends View
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.downloadBtn:
                Log.d(TAG, "onClick: ");
                int progress = progressBar.getProgress();
                Log.d(TAG, "onClick: progress: " + progress);
                progress += 10;
                progressBar.setProgress(progress);
                break;
            case R.id.downloadBtn1:
                Log.d(TAG, "onClick1: ");
                String inputText = editText.getText().toString();
                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.downloadBtn2:
                Log.d(TAG, "onClick2: ");
                break;
        }
    }
}
