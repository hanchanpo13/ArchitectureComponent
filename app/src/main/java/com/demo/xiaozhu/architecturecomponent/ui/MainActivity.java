package com.demo.xiaozhu.architecturecomponent.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demo.xiaozhu.architecturecomponent.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add product list fragment if this is first creation
        if (savedInstanceState == null) {
            DemoFragment fragment = new DemoFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.layout_content, fragment, DemoFragment.TAG).commit();
        }
    }
}
