package com.example.labs;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button BtnLogin = (Button) findViewById(R.id.BtnLogin);
        Button BtnReg = (Button) findViewById(R.id.BtnRegister);
        TextView TVOutput = (TextView) findViewById(R.id.TVOutput);
        EditText ETLogin = (EditText) findViewById(R.id.ETLogin);
        EditText ETPassword = (EditText) findViewById(R.id.ETPassword);

        View.OnClickListener oclBtnLogin = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ETLogin.getText().toString().equals("admin") && ETPassword.getText().toString().equals("admin")) {
                    TVOutput.setText("Вы вошли в систему");
                    TVOutput.setTextColor(Color.parseColor("#00FF00"));
                }
                else {
                    TVOutput.setText("Неправильный логин или пароль");
                    TVOutput.setTextColor(Color.parseColor("#FF0000"));
                }

            }
        };

        View.OnClickListener oclBtnRegister = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TVOutput.setText("Такого еще нет");
                TVOutput.setTextColor(Color.parseColor("#FF0000"));
            }
        };

        BtnReg.setOnClickListener(oclBtnRegister);
        BtnLogin.setOnClickListener(oclBtnLogin);
    }
}