package com.vladislavknyazev.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vladislavknyazev.myapplication2.R;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnOk;
    private Button btnCancel;
    private Button btnStart;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        initViews();
    }

    private void initViews() {
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnStart = (Button) findViewById(R.id.btnStart);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Нажми любую кнопку!");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        btnStart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                textView.setText("Ok! Намжи Cancel!");
                btnOk.setEnabled(false);
                btnCancel.setEnabled(true);
                break;
            case R.id.btnCancel:
                textView.setText("Cancel! Нажми Ok");
                btnCancel.setEnabled(false);
                btnOk.setEnabled(true);
                break;
            case R.id.btnStart:
                Intent intent = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(intent);finish();
                break;
        }
    }
}