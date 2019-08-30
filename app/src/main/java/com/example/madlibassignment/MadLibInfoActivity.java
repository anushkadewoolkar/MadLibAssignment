package com.example.madlibassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibInfoActivity extends AppCompatActivity {
    public static final String OBJECT = "object";
    public static final String FOOD = "food";
    public static final String VERB2 = "verb";
    public static final String FEELING = "feeling";
    public static final String NOUN2 = "noun";
    public static final String NAME = "name";
    public static final String ANIMAL = "animal";
    public static final String VERB = "verb";
    public static final String ADJECTIVE1 = "adjective";
    public static final String ADJECTIVE2 = "adjective";
    public static final String NOUN = "noun";
    public static final String NUMBER = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib_info);

        Intent intent = getIntent();
        String object = intent.getStringExtra(OBJECT);
        String food = intent.getStringExtra(FOOD);
        String verb2 = intent.getStringExtra(VERB2);
        String feeling = intent.getStringExtra(FEELING);
        String noun2 = intent.getStringExtra(NOUN2);
        String name = intent.getStringExtra(NAME);
        String animal = intent.getStringExtra(ANIMAL);
        String verb = intent.getStringExtra(VERB);
        String adjective1 = intent.getStringExtra(ADJECTIVE1);
        String adjective2 = intent.getStringExtra(ADJECTIVE2);
        String noun = intent.getStringExtra(NOUN);
        String number = intent.getStringExtra(NUMBER);

        String strToDisplay = "There once lived a/an " + animal + "named " + name + ". One day, as it was " + verb + "ing outside, it saw " + number + " " + noun + "(s). The " + animal + " was " + adjective2 + " because it wanted " + food
                + ", As it went to the grocery store, " + name + " saw a " + feeling + " " + noun2;
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }
}
