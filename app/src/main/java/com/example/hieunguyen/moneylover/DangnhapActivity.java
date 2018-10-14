package com.example.hieunguyen.moneylover;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DangnhapActivity extends AppCompatActivity {
    EditText edtuser, edtpassword;
    Button btndangnhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhapn);
        Anhxa();
        eventClick();

    }

    private void eventClick() {

        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = edtuser.getText().toString().trim();
                String password = edtpassword.getText().toString().trim();
                if (user.length() <= 0 || password.length() <=0 || isSpecialCharacter(user) == false || isSpecialCharacter(password) == false){
                    Toast.makeText(DangnhapActivity.this, "Tên người dùng chưa hợp lệ! Vui lòng nhập ký tự chữ", Toast.LENGTH_SHORT).show();
                }
                if (user.length() <6 || user.length() >20 || password.length() <6 || password.length()>20){
                    Toast.makeText(DangnhapActivity.this, "Bạn chỉ được phép nhập chuỗi từ 6 => 20 ký tự", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

    private void Anhxa() {
        edtuser = (EditText) findViewById(R.id.edittextuser);
        edtpassword = (EditText) findViewById(R.id.edittextpassword);
        btndangnhap = (Button) findViewById(R.id.buttondangnhap);
    }
    private boolean isSpecialCharacter(String c)
    {
        return c.matches("^[a-zA-Z0-9]*$");

    }


}
