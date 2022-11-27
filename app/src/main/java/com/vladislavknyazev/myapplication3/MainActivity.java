package com.vladislavknyazev.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.vladislavknyazev.myapplication2.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final int MENU_RESET_ID = 1;
    final int MENU_QUIT_ID = 2;

    EditText etNum1;
    EditText etNum2;

    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;
    Button btnRad;
    Button btnFract;
    Button btnBack;

    TextView tvResult;

    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnRad = (Button) findViewById(R.id.btnRad);
        btnFract = (Button) findViewById(R.id.btnFract);
        btnBack = (Button) findViewById(R.id.btnBack);

        tvResult = (TextView) findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnRad.setOnClickListener(this);
        btnFract.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        double num1 = 0;
        double num2 = 0;
        double result = 0;

        switch (view.getId()) {
            case R.id.btnBack:
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent);
                finish();
                break;
            default:
                break;
        }

        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }

        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        switch (view.getId()) {
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
                break;
            case R.id.btnMul:
                oper = "*";
                result = num1 * num2;
                tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
                break;
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;
                tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
                break;
            case R.id.btnRad:
                oper = "√";
                result = Math.sqrt(num1);
                tvResult.setText(oper + " = " + result);
                break;
            case R.id.btnFract:
                oper = "1/x";
                result = 1 / num1;
                tvResult.setText( oper + " = " + result);
                break;
            default:
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_RESET_ID, 0, "Reset");
        menu.add(0, MENU_QUIT_ID, 0, "Quit");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_RESET_ID:
                etNum1.setText("");
                etNum2.setText("");
                tvResult.setText("");
                break;
            case MENU_QUIT_ID:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}