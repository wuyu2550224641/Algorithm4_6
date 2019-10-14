package com.example.algorithm4_6;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FourT2Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputET;
    private Button determineBtn;
    private Button returnBTN;
    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_t2);
        initView();

    }

    private void initView() {
        inputET=findViewById(R.id.inputET);
        resultTV=findViewById(R.id.resultTV);
        determineBtn=findViewById(R.id.datermineBtn);
        returnBTN=findViewById(R.id.returnBtn);
        determineBtn.setOnClickListener(this);
        returnBTN.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.datermineBtn:
                submit();
            case R.id.returnBtn:
                Intent intent = new Intent(FourT2Activity.this, FourActivity.class);
                startActivity(intent);
                }
        }
    private void submit() {
        // validate
        String input = inputET.getText().toString().trim();
        if (TextUtils.isEmpty(input)) {
            Toast.makeText(this, "输入学生成绩,输入-1结束", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
