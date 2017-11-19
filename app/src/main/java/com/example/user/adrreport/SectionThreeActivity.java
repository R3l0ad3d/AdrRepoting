package com.example.user.adrreport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SectionThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_three);
    }

    public void nextPageClick(View view) {

        Intent intent = new Intent(this,SectionFourActivity.class);
        startActivity(intent);
    }

    public void addItemClick(View view) {
    }
}
