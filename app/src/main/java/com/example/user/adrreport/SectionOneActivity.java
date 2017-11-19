package com.example.user.adrreport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SectionOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_one);
    }

    public void gotoSectionTwo(View view) {
        Intent intent = new Intent(this,SectionTwoActivity.class);
        startActivity(intent);
    }
}
