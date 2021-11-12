package com.situ.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // logt
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Alt+Enter
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logd
                Log.d(TAG, "onClick: ");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                // System.out.println("add_item");
                Log.v(TAG, "verbose add_item");
                Log.d(TAG, "debug add_item");
                Log.i(TAG, "info add_item");
                Log.w(TAG, "warn add_item");
                Log.e(TAG, "error add_item");
            break;
            case R.id.remove_item:
                //System.out.println("remove_item");
                Log.d(TAG, "remove_item");
                break;
        }
        return true;
    }
}
