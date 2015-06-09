package com.benjaminearley.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void launchSpotifyStreamer(View view) {
        Toast.makeText(this, "This button will launch my Spotify Streamer App!", Toast.LENGTH_LONG).show();
    }
    public void launchScoresApp(View view) {
        Toast.makeText(this, "This button will launch my Scores App!", Toast.LENGTH_LONG).show();
    }
    public void launchLibraryApp(View view) {
        Toast.makeText(this, "This button will launch my Library App!", Toast.LENGTH_LONG).show();
    }
    public void launchBuildItBigger(View view) {
        Toast.makeText(this, "This button will launch my Build It Bigger App!", Toast.LENGTH_LONG).show();
    }
    public void launchXYZReader(View view) {
        Toast.makeText(this, "This button will launch my XYZ Reader App!", Toast.LENGTH_LONG).show();
    }
    public void launchCapstone(View view) {
        Toast.makeText(this, "This button will launch my Capstone App!", Toast.LENGTH_LONG).show();
    }
}
