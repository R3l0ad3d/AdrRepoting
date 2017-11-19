package com.example.user.adrreport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void gotoSingUpActivity(View view) {
        Intent intent = new Intent(this,SignUpAcivity.class);
        startActivity(intent);
    }

    public void gotoMainActivity(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
