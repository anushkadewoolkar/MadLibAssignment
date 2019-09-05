package com.example.madlibassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibHappyMethod extends AppCompatActivity {
    public static final String OBJECT = "object";
    public static final String FOOD = "food";
    public static final String VERB2 = "verb2";
    public static final String FEELING = "feeling";
    public static final String NAME = "name";
    public static final String ANIMAL = "animal";
    public static final String VERB = "verb";
    public static final String ADJECTIVE1 = "adjective1";
    public static final String ADJECTIVE2 = "adjective2";
    public static final String NOUN = "noun";
    public static final String NUMBER = "number";
    public static final String NAME2 = "name2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib_info);

        Intent intent = getIntent();
        String object = intent.getStringExtra(OBJECT);
        String food = intent.getStringExtra(FOOD);
        String verb2 = intent.getStringExtra(VERB2);
        String feeling = intent.getStringExtra(FEELING);
        String name2 = intent.getStringExtra(NAME2);
        String name = intent.getStringExtra(NAME);
        String animal = intent.getStringExtra(ANIMAL);
        String verb = intent.getStringExtra(VERB);
        String adjective1 = intent.getStringExtra(ADJECTIVE1);
        String adjective2 = intent.getStringExtra(ADJECTIVE2);
        String noun = intent.getStringExtra(NOUN);
        String number = intent.getStringExtra(NUMBER);

        String strToDisplay = "There once lived a " + animal + " named " + name + ". The " + animal + " was " + adjective2 + " because it wanted " + food
                + ", As it went to the grocery store, " + name + " saw " + name2 + " who asked why she was buying " + food +  ". When " + name + " told "
                + name2 + " that it was because there was a party at her house, " + name2 + " was " + feeling + " because " + name2 + " thought he wasn't invited. The party was " + adjective1 +
                " and more than " + number + " people came. " + name + " thought she looked " + adjective2 + ". When " + name + " " + verb + "ed downstairs, she didn't see " + name2 + ". " + name + " got sad because " + name2 + " was nowhere to be found so "
                + name + " thought he didn't come. After playing with " + object + "s with some of her friends, " + name + " " + verb2 + "ed outside and saw a " + noun + " which inspired the " + animal + " to call "
                + name2 + ". After talking for a bit, they realized there was a misunderstanding and " + name2 + " just never recieved an invitation because it was delivered to the wrong address. They made up " +
                "and lived happily ever after.";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }


}
