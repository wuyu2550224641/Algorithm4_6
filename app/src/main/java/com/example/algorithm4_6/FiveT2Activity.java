package com.example.algorithm4_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FiveT2Activity extends AppCompatActivity {
    private TextView fiveTask2TV;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_t2);
        initView();
        int f2 = Myfaction.getFactor(2);
        int f4 = Myfaction.getFactor(4);
        int f5 = Myfaction.getFactor(5);
        fiveTask2TV.setText(String.valueOf(f2+f4+f5));
    }

    private void initView() {
        fiveTask2TV=findViewById(R.id.fiveTask2TV);
        returnBtn=findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FiveT2Activity.this, FiveActivity.class);
                startActivity(intent);
            }
        });

    }
}
