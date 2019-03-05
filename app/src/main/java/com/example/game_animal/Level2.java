package com.example.game_animal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Level2 extends AppCompatActivity {

    private ImageView im_House;
    private ImageView im_Honey;
    private ImageView im_Pig;
    private ImageView im_Sun;
    public int Score;
    boolean ischanged = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
        Intent intentscore = getIntent();
        Score = intentscore.getIntExtra("score",Score);
        im_Honey = (ImageView)findViewById(R.id.IM_honey);
        im_Honey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Level2.this, "Fault! Score -10", Toast.LENGTH_SHORT).show();
                im_Honey.setImageResource(R.mipmap.honey_no2rtboard_1xhdpi);
            }
        });
        im_House = (ImageView)findViewById(R.id.IM_house);
        im_House.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Level2.this, "Fault! Score -10", Toast.LENGTH_SHORT).show();
                im_House.setImageResource(R.mipmap.house_noartboard_1xhdpi);
            }
        });
        im_Sun = (ImageView)findViewById(R.id.IM_sun);
        im_Sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Level2.this, "Fault! Score -10", Toast.LENGTH_SHORT).show();
                im_Sun.setImageResource(R.mipmap.sun_noartboard_1xhdpi);
            }
        });
        im_Pig = (ImageView)findViewById(R.id.IM_pig);
        im_Pig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score += 20;
                Toast.makeText(Level2.this, "Fault! Score +20", Toast.LENGTH_SHORT).show();
                im_Pig.setImageResource(R.mipmap.pig_okartboard_1xhdpi);
                Intent intent = new Intent();
                if(Score == 100)
                {
                    intent.setClass(Level2.this, Great.class);
                    intent.putExtra("score",Score);
                    startActivity(intent);
                    finish();
                }
                else{
                    intent.setClass(Level2.this, Fail.class);
                    intent.putExtra("score",Score);
                    startActivity(intent);
                    finish();
                }

            }
        });

    }
}
