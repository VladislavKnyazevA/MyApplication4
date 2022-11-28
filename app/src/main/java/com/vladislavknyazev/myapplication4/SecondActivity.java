package com.vladislavknyazev.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.vladislavknyazev.myapplication2.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container_view, ContentFragment.class, null)
                    .commit();
        }
    }
}