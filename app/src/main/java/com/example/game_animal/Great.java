package com.example.game_animal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Great extends AppCompatActivity {

    private TextView tv_GScore;
    public  int Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_great);
        Intent intentscore = getIntent();
        Score = intentscore.getIntExtra("score",Score);
        tv_GScore = (TextView)findViewById(R.id.TV_gscore);
        tv_GScore.setText("Score:"+Score);
    }
}
