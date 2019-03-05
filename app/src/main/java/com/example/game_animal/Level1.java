package com.example.game_animal;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Level1 extends AppCompatActivity {

    private ImageView im_Cat;
    private ImageView im_Wolf;
    private ImageView im_Lion;
    private ImageView im_Rhino;
    public int Score = 60;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        im_Wolf = (ImageView)findViewById(R.id.IM_wolf);
        im_Wolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Level1.this, "Fault! Score -10", Toast.LENGTH_SHORT).show();
                im_Wolf.setImageResource(R.mipmap.wolfartnoboard_1xhdpi);
            }
        });
        im_Lion = (ImageView)findViewById(R.id.IM_lion);
        im_Lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Level1.this, "Fault! Score -10", Toast.LENGTH_SHORT).show();
                im_Lion.setImageResource(R.mipmap.lionartnoboard_1xhdpi);
            }
        });
        im_Rhino = (ImageView)findViewById(R.id.IM_rhino);
        im_Rhino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Level1.this, "Fault! Score -10", Toast.LENGTH_SHORT).show();
                im_Rhino.setImageResource(R.mipmap.rhinoartnoboard_1xhdpi);
            }
        });
        im_Cat = (ImageView)findViewById(R.id.IM_cat);
        im_Cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score += 20;
                Toast.makeText(Level1.this, "Correct! Score +20", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(Level1.this, Level2.class);
                intent.putExtra("score",Score);
                im_Cat.setImageResource(R.mipmap.cat_okartboard_1xhdpi);
                startActivity(intent);
                finish();
            }
        });
    }
}
