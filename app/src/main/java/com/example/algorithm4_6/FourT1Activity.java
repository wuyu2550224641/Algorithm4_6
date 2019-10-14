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

public class FourT1Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText nET;
    private TextView snTV;
    private Button determineBtn;
    private Button returnBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_t1);
        initView();
    }

    private void initView() {
        nET=findViewById(R.id.nET);
        snTV=findViewById(R.id.snTV);
        determineBtn=findViewById(R.id.datermineBtn);
        returnBtn=findViewById(R.id.returnBtn);
        determineBtn.setOnClickListener(this);
        returnBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.datermineBtn:
                String num = nET.getText().toString().trim();
                if (TextUtils.isEmpty(num)) {
                    Toast.makeText(FourT1Activity.this, "请输入n的值", Toast.LENGTH_LONG).show();
                    return;
                }
                int factorial = Myfaction.getResult(Integer.valueOf(num));
                snTV.setText("Sn结果为:" + factorial);
                break;
            case R.id.returnBtn:
                Intent intent = new Intent(FourT1Activity.this,FourActivity.class);
                startActivity(intent);
                break;
        }

    }
}
