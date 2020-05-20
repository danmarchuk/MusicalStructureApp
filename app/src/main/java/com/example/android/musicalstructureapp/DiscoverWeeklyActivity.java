package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DiscoverWeeklyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Stuck With U", "Ariana Grande & Justin Bieber"));
        songs.add(new Song("Savage", "Megan Thee Stallion feat. Beyoncé"));
        songs.add(new Song("Rockstar", "DaBaby feat. Roddy Ricch"));
        songs.add(new Song("Say So", "Doja Cat feat. Nicki Minaj"));
        songs.add(new Song("Blinding Lights", "The Weeknd"));
        songs.add(new Song("Toosie Slide", "Drake"));
        songs.add(new Song("The Scotts", "Travis Scott, The Scotts"));
        songs.add(new Song("The Box", "Roddy Ricch"));
        songs.add(new Song("Life is Good", "Drake and Future"));
        songs.add(new Song("Blueberry Faygo", "Lil Mosey"));
        songs.add(new Song("3 Headed Goat", "Lil Durk"));
        songs.add(new Song("Don't Start Now", "Dua Lipa"));
        songs.add(new Song("Chicago Freestyle", "Drake feat. Giveon"));
        songs.add(new Song("I Hope", "Gabby Barrett"));
        songs.add(new Song("Can I", "Kehlani"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
