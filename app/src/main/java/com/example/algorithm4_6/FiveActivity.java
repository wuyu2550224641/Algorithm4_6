package com.example.algorithm4_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FiveActivity extends AppCompatActivity implements View.OnClickListener {
    private Button task1Btn;
    private Button task2Btn;
    private Button task3Btn;
    private Button returnBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        initView();
    }
    private void initView() {
        task1Btn=findViewById(R.id.task1Btn);
        task2Btn=findViewById(R.id.task2Btn);
        task3Btn=findViewById(R.id.task3Btn);
        returnBtn=findViewById(R.id.returnBtn);
        task1Btn.setOnClickListener(this);
        task2Btn.setOnClickListener(this);
        task3Btn.setOnClickListener(this);
        returnBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.task1Btn:
                Intent intent = new Intent(FiveActivity.this,FourT1Activity.class);
                startActivity(intent);
                break;
            case R.id.task2Btn:
                Intent intent1 = new Intent(FiveActivity.this,FourT2Activity.class);
                startActivity(intent1);
                break;
            case R.id.task3Btn:
                Intent intent2 = new Intent(FiveActivity.this,FourT3Activity.class);
                startActivity(intent2);
                break;
            case R.id.returnBtn:
                Intent intent3 = new Intent(FiveActivity.this,MainActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
