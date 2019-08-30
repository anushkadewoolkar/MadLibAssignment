package com.example.madlibassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View v) {

        EditText object = (EditText) findViewById(R.id.object);
        EditText food = (EditText) findViewById(R.id.food);
        EditText feeling = (EditText) findViewById(R.id.feeling);
        EditText noun2 = (EditText) findViewById(R.id.noun2);
        EditText verb2 = (EditText) findViewById(R.id.verb2);
        EditText name = (EditText) findViewById(R.id.name);
        EditText animal = (EditText) findViewById(R.id.animal);
        EditText number = (EditText) findViewById(R.id.number);
        EditText noun = (EditText) findViewById(R.id.noun);
        EditText verb = (EditText) findViewById(R.id.verb);
        EditText adjective1 = (EditText) findViewById(R.id.adjective1);
        EditText adjective2 = (EditText) findViewById(R.id.adjective2);

        String objectStr = object.getText().toString();
        String foodStr = food.getText().toString();
        String feelingStr = feeling.getText().toString();
        String noun2Str = noun2.getText().toString();
        String verb2Str = verb2.getText().toString();
        String nameStr = name.getText().toString();
        String animalStr = animal.getText().toString();
        String numberStr = number.getText().toString();
        String nounStr = noun.getText().toString();
        String verbStr = verb.getText().toString();
        String adj1Str = adjective1.getText().toString();
        String adj2Str = adjective2.getText().toString();

        Intent intent = new Intent(this, MadLibInfoActivity.class);

        intent.putExtra(MadLibInfoActivity.OBJECT, animalStr);
        intent.putExtra(MadLibInfoActivity.FOOD, animalStr);
        intent.putExtra(MadLibInfoActivity.FEELING, numberStr);
        intent.putExtra(MadLibInfoActivity.NOUN2, nounStr);
        intent.putExtra(MadLibInfoActivity.VERB2, verbStr);
        intent.putExtra(MadLibInfoActivity.NAME, animalStr);
        intent.putExtra(MadLibInfoActivity.ANIMAL, animalStr);
        intent.putExtra(MadLibInfoActivity.NUMBER, numberStr);
        intent.putExtra(MadLibInfoActivity.NOUN, nounStr);
        intent.putExtra(MadLibInfoActivity.VERB, verbStr);
        intent.putExtra(MadLibInfoActivity.ADJECTIVE1, adj1Str);
        intent.putExtra(MadLibInfoActivity.ADJECTIVE2, adj2Str);

        startActivity(intent);
    }
}
