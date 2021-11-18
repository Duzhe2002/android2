package com.situ.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    private static final String TAG = "FirstActivity";
    private Button button = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // soutm
                // System.out.println("FirstActivity.onClick");
                Log.d(TAG, "onClick: ");

                // 显式Intent
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);

                /*隐式Intent*/
                /*Intent intent = new Intent();
                intent.setAction("com.situ.helloword.ACTION_START");
                startActivity(intent);*/

                /*Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);*/

            }
        });
    }
}
