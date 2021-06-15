package com.example.a6_4;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class FirstActivity extends AppCompatActivity {

    TextInputLayout userInputLayout;
    Button login_in;
    EditText name;
    EditText password;
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frist);
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        login_in = findViewById(R.id.login_in);

        login_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().equals("1759435099")&&password.getText().toString().equals("mayanting")){
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(FirstActivity.this, "用户名或密码错误，请重新输入！", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
//    public int getLayoutResID() {
//        return R.layout.frist;
//    }
}
