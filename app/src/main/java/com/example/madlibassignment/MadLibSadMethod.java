package com.example.madlibassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibSadMethod extends AppCompatActivity {
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
        setContentView(R.layout.activity_mad_lib_sad_method);

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

        String strToDisplay = "There once lived a girl named " + name + " who was walking back from school when she found a lucky " + object + ". When she came home, her mom had prepared " + food + ", her favorite food! She ate " +
                number + " plates of it and thanked her mom. She took a shower and changed into her favorite shirt that had " + noun + "s on it. After finishing her homework, " + name + " was " + feeling + " and decided to " + verb + " with her friends at the park. " +
                "When she got there, she saw her crush, " + name2 + ", shooting hoops. After some time " + verb + "ing with her friends, " + name2 + " walked up to her and asked her if she’d like to hang out with him and " + verb2 + " together. " +
                name + " obviously said yes!!! She thought he was the most " + adjective1 + " and " + adjective2 + " person she’d ever met. She came home and put the " + object + " on her nightstand, deciding it gave her good luck. " +
                "When she went to sleep, she was quickly awakened by her pet " + animal + " who began licking her face." +
                " Her mom was yelling at her to go to school and the " + object + " was missing. She sighed, realizing it was just a dream.";
        TextView str = (TextView) findViewById(R.id.sad);
        str.setText(strToDisplay);
    }
}
