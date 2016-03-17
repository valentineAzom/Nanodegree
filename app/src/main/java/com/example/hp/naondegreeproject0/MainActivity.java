package com.example.hp.naondegreeproject0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button mediaBtn = (Button)findViewById(R.id.media_streamder);
        Button antBtn = (Button)findViewById(R.id.ant_terminator);
        Button superBtn = (Button)findViewById(R.id.super_duo1);
        Button super1Btn = (Button)findViewById(R.id.super_duo2);
        Button materialBtn = (Button)findViewById(R.id.materialize);
        Button capBtn = (Button)findViewById(R.id.capstone);

        final Context cnt = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;
        mediaBtn.setOnClickListener( new View.OnClickListener () {
            public void onClick(View v){
               Toast ntoast = Toast.makeText(cnt,"This button lauches the media streamer app",duration);
                ntoast.show();
            }
        });
        antBtn.setOnClickListener( new View.OnClickListener () {
            public void onClick(View v){
                Toast ntoast = Toast.makeText(cnt,"This button lauches the ant moderator app",duration);
                ntoast.show();
            }
        });
        superBtn.setOnClickListener( new View.OnClickListener () {
            public void onClick(View v){
                Toast ntoast = Toast.makeText(cnt,"This button lauches the score  app 1",duration);
                ntoast.show();
            }
        });
        super1Btn.setOnClickListener( new View.OnClickListener () {
            public void onClick(View v){
                Toast ntoast = Toast.makeText(cnt,"This button lauches the score  app 2",duration);
                ntoast.show();
            }
        });
        materialBtn.setOnClickListener( new View.OnClickListener () {
            public void onClick(View v){
                Toast ntoast = Toast.makeText(cnt,"This button lauches beacon reader app",duration);
                ntoast.show();
            }
        });
        capBtn.setOnClickListener( new View.OnClickListener () {
            public void onClick(View v){
                Toast ntoast = Toast.makeText(cnt,"This button lauches my custom app",duration);
                ntoast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
