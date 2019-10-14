package com.example.algorithm4_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm4_6.six.sixActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
            fourBtn=findViewById(R.id.fourBtn);
            fiveBtn=findViewById(R.id.sixBtn);
            sixBtn=findViewById(R.id.sixBtn);
            fourBtn.setOnClickListener(this);
            fiveBtn.setOnClickListener(this);
            sixBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fourBtn:
                Intent intent = new Intent(MainActivity.this,FourActivity.class);
                startActivity(intent);
                break;
            case R.id.fiveBtn:
                Intent intent1 = new Intent(MainActivity.this, FiveActivity.class);
                startActivity(intent1);
                break;
            case R.id.sixBtn:
                Intent intent2 = new Intent(MainActivity.this, sixActivity.class);
                startActivity(intent2);
                break;

        }
    }
}
