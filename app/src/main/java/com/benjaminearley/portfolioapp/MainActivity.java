package com.benjaminearley.portfolioapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private PackageManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        manager = this.getPackageManager();
    }

    public void launchSpotifyStreamer(View view) {

        Intent i = manager.getLaunchIntentForPackage("com.benjaminearley.spotifystreamer");

        if (i != null) {
            i.addCategory(Intent.CATEGORY_LAUNCHER);
        } else {
            Toast.makeText(this, "This button should launch my Spotify Streamer App!", Toast.LENGTH_LONG).show();
        }
        try {
            this.startActivity(i);
        } catch (NullPointerException e) {
            Toast.makeText(this, "This button should launch my Spotify Streamer App!", Toast.LENGTH_LONG).show();
        }

    }
    public void launchScoresApp(View view) {
        Intent i = manager.getLaunchIntentForPackage("barqsoft.footballscores");

        if (i != null) {
            i.addCategory(Intent.CATEGORY_LAUNCHER);
        } else {
            Toast.makeText(this, "This button should launch my Football Scores App!", Toast.LENGTH_LONG).show();
        }
        try {
            this.startActivity(i);
        } catch (NullPointerException e) {
            Toast.makeText(this, "This button should launch my Football Scores App!", Toast.LENGTH_LONG).show();
        }
    }
    public void launchLibraryApp(View view) {
        Intent i = manager.getLaunchIntentForPackage("it.jaschke.alexandria");

        if (i != null) {
            i.addCategory(Intent.CATEGORY_LAUNCHER);
        } else {
            Toast.makeText(this, "This button should launch my Alexandria App!", Toast.LENGTH_LONG).show();
        }
        try {
            this.startActivity(i);
        } catch (NullPointerException e) {
            Toast.makeText(this, "This button should launch my Alexandria App!", Toast.LENGTH_LONG).show();
        }
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
