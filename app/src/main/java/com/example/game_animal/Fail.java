package com.example.game_animal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Fail extends AppCompatActivity {

    private TextView tv_FScore;
    public  int Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail);
        Intent intentscore = getIntent();
        Score = intentscore.getIntExtra("score",Score);
        tv_FScore = (TextView)findViewById(R.id.TV_fscore);
        tv_FScore.setText("Score:"+Score);
    }
}
