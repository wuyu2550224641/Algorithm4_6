package com.example.algorithm4_6.six;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm4_6.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SixT2Activity extends AppCompatActivity {
    private TextView sixTask2TV;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_t2);
        initView();
        String str1 = "FEDCBA";
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String str2 = String.valueOf(chars[i]);
            sixTask2TV.append(str2);
        }
        File file = new File("/storage/emulated/0/123.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(str1);
            outputStreamWriter.flush();
            outputStreamWriter.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initView() {
        sixTask2TV=findViewById(R.id.sixTask2TV);
        returnBtn=findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SixT2Activity.this, sixActivity.class);
                startActivity(intent);
            }
        });
    }
}
