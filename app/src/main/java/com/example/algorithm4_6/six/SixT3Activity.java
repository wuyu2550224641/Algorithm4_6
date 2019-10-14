package com.example.algorithm4_6.six;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm4_6.Myfaction;
import com.example.algorithm4_6.R;

public class SixT3Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputMoneyET;
    private Button getTaxBtn;
    private TextView sixTask3TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_t3);
        initView();

    }

    private void initView() {
        inputMoneyET = (EditText) findViewById(R.id.inputMoneyET);
        getTaxBtn = (Button) findViewById(R.id.getTaxBtn);
        getTaxBtn.setOnClickListener(this);
        sixTask3TV = (TextView) findViewById(R.id.sixTask3TV);
        sixTask3TV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.getTaxBtn:
                submit();
                break;
        }
    }

    private void submit() {
        String inputMoneyETString = inputMoneyET.getText().toString().trim();
        if (TextUtils.isEmpty(inputMoneyETString)) {
            Toast.makeText(this, "请输入月工资", Toast.LENGTH_SHORT).show();
            return;
        }
        Double aDouble = Double.valueOf(inputMoneyETString);
        double tax = Myfaction.getTax(aDouble>3000?aDouble-3000:aDouble);
        sixTask3TV.setText("你需要交" + tax);
    }
}
