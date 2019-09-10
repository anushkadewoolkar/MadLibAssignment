package com.example.madlibassignment;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MadLibScaryMethod extends AppCompatActivity {
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
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_mad_lib_scary_method);

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


        String strToDisplay =
                "There once lived a lion in the jungle named " + name2 + " who had a crush on his friend, " + animal + ", named " + name + ". " +
                        "The " + animal + " was " + adjective1 + " and the lion was " + adjective2 + ". One day as " + name + " was " + verb + "ing around, she heard the sound of a twig " +
                        "snapping and the bushes rustling behind her. She quickly turned around only to see a " + object + " lying in the grass." +
                        " When she turned back around, a " + noun + " was in front of her. She jumped back in fear and ran away, screaming." +
                        " A couple days later she was out eating " + food + " with her friends and " + verb2 + "ing. " +
                        "As she walked home, which was about " + number + " miles away, she saw the " + object + " again. " +
                        "The " + animal + " was " + feeling + ", but she kept walking. " +
                        "After a few more hours, it was dark outside and she realized she was lost. " +
                        "She decided to sleep where she was for the night and go home in the morning because she was tired and sleepy. " +
                        "As she was sleeping, she felt herself being picked up and screamed! " +
                        "She thought she was being kidnapped and yelled, “AAAAHHHH SOMEONE HELP ME!”, kicking furiously. " +
                        "She was suddenly dropped onto a soft surface and when she opened her eyes, the lion was staring back at her. " +
                        "He quickly explained that he had a crush on her and just wanted to protect her. She saw the " + object + " lying on his bed stand and realized he was the one following her all this time. " +
                        "She was relieved and thanked him for his help. They both lived happily ever after!";
        TextView str = (TextView) findViewById(R.id.scary);
        str.setText(strToDisplay);
    }

    public void shareInfo(View v) {
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

        String myMessage = "There once lived a lion in the jungle named " + name2 + " who had a crush on his friend, " + animal + ", named " + name + ". " +
                "The " + animal + " was " + adjective1 + " and the lion was " + adjective2 + ". One day as " + name + " was " + verb + "ing around, she heard the sound of a twig " +
                "snapping and the bushes rustling behind her. She quickly turned around only to see a " + object + " lying in the grass." +
                " When she turned back around, a " + noun + " was in front of her. She jumped back in fear and ran away, screaming." +
                " A couple days later she was out eating " + food + " with her friends and " + verb2 + "ing. " +
                "As she walked home, which was about " + number + " miles away, she saw the " + object + " again. " +
                "The " + animal + " was " + feeling + ", but she kept walking. " +
                "After a few more hours, it was dark outside and she realized she was lost. " +
                "She decided to sleep where she was for the night and go home in the morning because she was tired and sleepy. " +
                "As she was sleeping, she felt herself being picked up and screamed! " +
                "She thought she was being kidnapped and yelled, “AAAAHHHH SOMEONE HELP ME!”, kicking furiously. " +
                "She was suddenly dropped onto a soft surface and when she opened her eyes, the lion was staring back at her. " +
                "He quickly explained that he had a crush on her and just wanted to protect her. She saw the " + object + " lying on his bed stand and realized he was the one following her all this time. " +
                "She was relieved and thanked him for his help. They both lived happily ever after!";
        intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, myMessage);
        String chooserTitle = getString(R.string.chooser);

        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }
}

