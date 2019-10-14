package com.example.algorithm4_6.six;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm4_6.MainActivity;
import com.example.algorithm4_6.R;

public class sixActivity extends AppCompatActivity implements View.OnClickListener {
    private Button task1Btn;
    private Button task2Btn;
    private Button task3Btn;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six2);
        initView();
    }

    private void initView() {
        task1Btn = findViewById(R.id.task1Btn);
        task2Btn = findViewById(R.id.task2Btn);
        task3Btn = findViewById(R.id.task3Btn);
        returnBtn = findViewById(R.id.returnBtn);
        task1Btn.setOnClickListener(this);
        task2Btn.setOnClickListener(this);
        task3Btn.setOnClickListener(this);
        returnBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.task1Btn:
                Intent intent = new Intent(sixActivity.this, SixT1Activity.class);
                startActivity(intent);
                break;
            case R.id.task2Btn:
                Intent intent1 = new Intent(sixActivity.this, SixT2Activity.class);
                startActivity(intent1);
                break;
            case R.id.task3Btn:
                Intent intent2 = new Intent(sixActivity.this, SixT3Activity.class);
                startActivity(intent2);
                break;
            case R.id.returnBtn:
                Intent intent3 = new Intent(sixActivity.this, MainActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
