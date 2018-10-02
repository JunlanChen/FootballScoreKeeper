package com.pattersonhs.jchen.newfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView team1;
    TextView team2;
    TextView score1;
    TextView score2;
    Button addSix;
    Button addSix2;
    Button addTwo;
    Button addTwo2;
    Button addOne;
    Button addOne2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1 = (TextView) findViewById(R.id.team1);
        team2 = (TextView) findViewById(R.id.team2);
        score1 = (TextView) findViewById(R.id.score1);
        score2 = (TextView) findViewById(R.id.score2);
        addSix = (Button) findViewById(R.id.addSix);
        addSix2 = (Button) findViewById(R.id.addSix2);
        addTwo = (Button) findViewById(R.id.addTwo);
        addTwo2 = (Button) findViewById(R.id.addTwo2);
        addOne = (Button) findViewById(R.id.addOne);
        addOne2 = (Button) findViewById(R.id.addOne2);
    }

    public void addScore6 (View view) {

        score1.setText("6");
    }
    public void addScore6v2 (View view) {

        score2.setText("6");
    }

    public void addScore2 (View view) {

        score1.setText("2");
    }
    public void addScore2v2 (View view) {

        score2.setText("2");
    }
    public void addScore1 (View view) {

        score1.setText("1");
    }
    public void addScore1v2 (View view) {

        score2.setText("1");
}
}

