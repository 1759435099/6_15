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

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class FirstActivity extends AppCompatActivity {

    TextInputLayout userInputLayout;
    Button login_in;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frist);

        // 开启错误提示
//        userInputLayout.setErrorEnabled(true);
//        // 开启计数
//        userInputLayout.setCounterEnabled(true);
//        // 设置输入最大长度
//        userInputLayout.setCounterMaxLength(10);
//        // 设置浮动标签字体样式
//        userInputLayout.setHintTextAppearance(R.style.hintAppearence);
//
//        Objects.requireNonNull(userInputLayout.getEditText()).addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                // 文本变化前调用
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                // 文本发生变化时调用
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                // 文本发生变化后调用
//                if (userInputLayout.getEditText().getText().toString().trim().length() > 10) {
//                    userInputLayout.setError("用户名长度超出限制");
//                } else {
//                    userInputLayout.setError(null);
//                }
//            }
//        });

        login_in = findViewById(R.id.login_in);
        login_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
//    public int getLayoutResID() {
//        return R.layout.frist;
//    }
}
