package com.example.algorithm4_6.six;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm4_6.Myfaction;
import com.example.algorithm4_6.R;

import java.util.ArrayList;
import java.util.List;

public class SixT1Activity extends AppCompatActivity {
    private TextView sixTask1TV;
    private Button returnBtn;
    private List<Double> doubleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_t1);
        initView();
        doubleList.add(9.8);
        doubleList.add(12D);
        doubleList.add(45D);
        doubleList.add(67D);
        doubleList.add(23D);
        doubleList.add(1.98);
        doubleList.add(2.55);
        doubleList.add(45D);
        Myfaction.Manager Manager = new Myfaction.Manager(doubleList);
        sixTask1TV.append("最大数:" + Manager.getMax()+ "\n");
        sixTask1TV.append("最小数:" + Manager.getMin() + "\n");
        sixTask1TV.append("平均值:" + Manager.getAverage() + "\n");
    }

    private void initView() {
        sixTask1TV = (TextView) findViewById(R.id.sixTask1TV);
        returnBtn = (Button) findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SixT1Activity.this, sixActivity.class);
                startActivity(intent);
            }
        });
    }
}
