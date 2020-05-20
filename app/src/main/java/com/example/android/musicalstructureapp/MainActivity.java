package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView discoverWeekly = findViewById(R.id.discover_weekly_activity);
        discoverWeekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent discoverWINtent = new Intent(MainActivity.this, DiscoverWeeklyActivity.class);
                startActivity(discoverWINtent);
            }
        });

        TextView favouriteSongs = findViewById(R.id.favourite_songs_activity);
        favouriteSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favouriteSongsIntent = new Intent(MainActivity.this, FavouriteSongs.class);
                startActivity(favouriteSongsIntent);
            }
        });
    }
}
