package com.example.algorithm4_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm4_6.faction.Circle;
import com.example.algorithm4_6.faction.Triangle;

public class FiveT3Activity extends AppCompatActivity {
    private TextView fiveTask3TV;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_t3);
        initView();
        Triangle triangle = new Triangle(5, 6);
        fiveTask3TV.append("三角形面积:" + triangle.calArea() + "\n");
//        Rectangle rectangle = new Rectangle(5, 12);
//        fiveTask3TV.append("矩形面积:" + rectangle.calArea() + "\n");
        Circle circle = new Circle(5);
        fiveTask3TV.append("园的面积:" + circle.calArea() + "\n");
    }

    private void initView() {
        fiveTask3TV=findViewById(R.id.fiveTask3TV);
        returnBtn=findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FiveT3Activity.this, FiveActivity.class);
                startActivity(intent);
            }
        });
    }
}
