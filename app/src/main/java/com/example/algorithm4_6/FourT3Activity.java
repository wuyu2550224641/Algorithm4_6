package com.example.algorithm4_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FourT3Activity extends AppCompatActivity {
    private TextView resultTV;
    private Button returnBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_t3);
        initView();
        String student=Myfaction.getStudent();
        resultTV.setText(student);

    }
    private void initView() {
        resultTV=findViewById(R.id.resultTV);
        returnBtn=findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourT3Activity.this, FourActivity.class);
                startActivity(intent);

            }
        });
    }
}
