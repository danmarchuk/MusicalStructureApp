package com.example.android.musicalstructureapp;

public class Song {

    private String mSongName;
    private String mAuthor;


    public Song (String songName, String author) {
        mSongName = songName;
        mAuthor = author;
    }

    public String getSongName(){return mSongName;}
    public String getAuthorsName(){return mAuthor;}

}
