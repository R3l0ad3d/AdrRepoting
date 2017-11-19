package com.example.user.adrreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void surveyClick(View view) {
        Intent intent = new Intent(this,Questions.class);
        startActivity(intent);
    }

    public void ADRRepotingClick(View view) {
        Intent  intent = new Intent(this,SectionOneActivity.class);
        startActivity(intent);
    }

    public void BannedMedicineClick(View view) {
        Intent  intent = new Intent(this,BannedMedicineActivity.class);
        startActivity(intent);
    }
}
