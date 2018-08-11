package com.example.android.musictest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class XXXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_list);


        ArrayList<Music> title = new ArrayList<Music>();

        title.add(new Music(R.drawable.question,"Sad!","?"));
        title.add(new Music(R.drawable.seventeen, "Jocelyn Flores", "17"));
        title.add(new Music(R.drawable.question,"Moonlight", "?"));
        title.add(new Music(R.drawable.question, "changes", "?"));
        title.add(new Music(R.drawable.seventeen,"Everybody Dies in the Nightmare", "17"));
        title.add(new Music(R.drawable.question,"the remedy for a broken heart", "?"));
        title.add(new Music(R.drawable.question,"Hope", "?"));
        title.add(new Music(R.drawable.question,"NUMB", "?"));
        title.add(new Music(R.drawable.seventeen,"Save Me", "17"));
        title.add(new Music(R.drawable.seventeen,"Carry On", "17"));

        MusicAdapter adapter = new MusicAdapter(this, title);

        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
            Intent numbersIntent = new Intent(XXXActivity.this, FullFunction.class);
            startActivity(numbersIntent);
            }

        });

    }

}


