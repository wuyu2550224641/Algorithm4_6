package com.example.algorithm4_6;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class FiveT1Activity extends AppCompatActivity {
    private TextView resultTV;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_t1);
        initView();
        List<String> rangePrime = Myfaction.Sister.getSister();
        resultTV.setText(TextUtils.join("\n", rangePrime));
    }

    private void initView() {
        resultTV=findViewById(R.id.resultTV);
        returnBtn=findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FiveT1Activity.this, FiveActivity.class);
                startActivity(intent);
            }
        });
    }
}
