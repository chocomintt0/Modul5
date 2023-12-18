package com.example.percobaan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.farhan.tugas2.R;

import java.util.ArrayList;

public class HeroActivity extends AppCompatActivity {
    private ArrayList<Hero> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);

        Intent intent = getIntent();
        String heroName = intent.getStringExtra("hero_name");
        String heroDescription = intent.getStringExtra("hero_description");
        int heroPhoto = intent.getIntExtra("hero_photo", 0);

        ImageView imageView = findViewById(R.id.img_item_photo);
        TextView nameTextView = findViewById(R.id.tv_item_name);
        TextView descTextView = findViewById(R.id.tv_item_description);

        imageView.setImageResource(heroPhoto);
        nameTextView.setText(heroName);
        descTextView.setText(heroDescription);
    }
}