package com.example.madlibassignment;

import android.graphics.drawable.AnimationDrawable;
import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity
    {

    @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ConstraintLayout constraintLayout = findViewById(R.id.layout);
            AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
            animationDrawable.setEnterFadeDuration(2000);
            animationDrawable.setExitFadeDuration(4000);
            animationDrawable.start();
        }

        public void happy(View v)
        {

        EditText object = (EditText) findViewById(R.id.object);
        EditText food = (EditText) findViewById(R.id.food);
        EditText feeling = (EditText) findViewById(R.id.feeling);
        EditText name2 = (EditText) findViewById(R.id.name2);
        EditText verb2 = (EditText) findViewById(R.id.verb2);
        EditText name = (EditText) findViewById(R.id.name);
        EditText animal = (EditText) findViewById(R.id.animal);
        EditText number = (EditText) findViewById(R.id.number);
        EditText noun = (EditText) findViewById(R.id.noun);
        EditText verb = (EditText) findViewById(R.id.verb);
        EditText adjective1 = (EditText) findViewById(R.id.adjective1);
        EditText adjective2 = (EditText) findViewById(R.id.adjective2);

        if (object.length() == 0 || food.length() == 0 || feeling.length() == 0 || name2.length() == 0 || verb2.length() == 0 ||
                name.length() == 0 || animal.length() == 0 || number.length() == 0 || noun.length() == 0 || verb.length() == 0 || adjective1.length() == 0
                || adjective2.length() == 0)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please fill in all inputs";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

                else
                {

                String objectStr = object.getText().toString();
                String foodStr = food.getText().toString();
                String feelingStr = feeling.getText().toString();
                String name2Str = name2.getText().toString();
                String verb2Str = verb2.getText().toString();
                String nameStr = name.getText().toString();
                String animalStr = animal.getText().toString();
                String numberStr = number.getText().toString();
                String nounStr = noun.getText().toString();
                String verbStr = verb.getText().toString();
                String adj1Str = adjective1.getText().toString();
                String adj2Str = adjective2.getText().toString();

                Intent intent = new Intent(this, MadLibHappyMethod.class);

                intent.putExtra(MadLibHappyMethod.OBJECT, objectStr);
                intent.putExtra(MadLibHappyMethod.FOOD, foodStr);
                intent.putExtra(MadLibHappyMethod.FEELING, feelingStr);
                intent.putExtra(MadLibHappyMethod.NAME2, name2Str);
                intent.putExtra(MadLibHappyMethod.VERB2, verb2Str);
                intent.putExtra(MadLibHappyMethod.NAME, nameStr);
                intent.putExtra(MadLibHappyMethod.ANIMAL, animalStr);
                intent.putExtra(MadLibHappyMethod.NUMBER, numberStr);
                intent.putExtra(MadLibHappyMethod.NOUN, nounStr);
                intent.putExtra(MadLibHappyMethod.VERB, verbStr);
                intent.putExtra(MadLibHappyMethod.ADJECTIVE1, adj1Str);
                intent.putExtra(MadLibHappyMethod.ADJECTIVE2, adj2Str);

                startActivity(intent);
            }
        }

        public void sad(View v)
        {

        EditText object = (EditText) findViewById(R.id.object);
        EditText food = (EditText) findViewById(R.id.food);
        EditText feeling = (EditText) findViewById(R.id.feeling);
        EditText name2 = (EditText) findViewById(R.id.name2);
        EditText verb2 = (EditText) findViewById(R.id.verb2);
        EditText name = (EditText) findViewById(R.id.name);
        EditText animal = (EditText) findViewById(R.id.animal);
        EditText number = (EditText) findViewById(R.id.number);
        EditText noun = (EditText) findViewById(R.id.noun);
        EditText verb = (EditText) findViewById(R.id.verb);
        EditText adjective1 = (EditText) findViewById(R.id.adjective1);
        EditText adjective2 = (EditText) findViewById(R.id.adjective2);

        if (object.length() == 0 || food.length() == 0 || feeling.length() == 0 || name2.length() == 0 || verb2.length() == 0 ||
                name.length() == 0 || animal.length() == 0 || number.length() == 0 || noun.length() == 0 || verb.length() == 0 || adjective1.length() == 0
                || adjective2.length() == 0)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please fill in all inputs";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

            else
            {


            String objectStr = object.getText().toString();
            String foodStr = food.getText().toString();
            String feelingStr = feeling.getText().toString();
            String name2Str = name2.getText().toString();
            String verb2Str = verb2.getText().toString();
            String nameStr = name.getText().toString();
            String animalStr = animal.getText().toString();
            String numberStr = number.getText().toString();
            String nounStr = noun.getText().toString();
            String verbStr = verb.getText().toString();
            String adj1Str = adjective1.getText().toString();
            String adj2Str = adjective2.getText().toString();

            Intent intent = new Intent(this, MadLibSadMethod.class);

            intent.putExtra(MadLibSadMethod.OBJECT, objectStr);
            intent.putExtra(MadLibSadMethod.FOOD, foodStr);
            intent.putExtra(MadLibSadMethod.FEELING, feelingStr);
            intent.putExtra(MadLibSadMethod.NAME2, name2Str);
            intent.putExtra(MadLibSadMethod.VERB2, verb2Str);
            intent.putExtra(MadLibSadMethod.NAME, nameStr);
            intent.putExtra(MadLibSadMethod.ANIMAL, animalStr);
            intent.putExtra(MadLibSadMethod.NUMBER, numberStr);
            intent.putExtra(MadLibSadMethod.NOUN, nounStr);
            intent.putExtra(MadLibSadMethod.VERB, verbStr);
            intent.putExtra(MadLibSadMethod.ADJECTIVE1, adj1Str);
            intent.putExtra(MadLibSadMethod.ADJECTIVE2, adj2Str);

            startActivity(intent);
            }
        }


        public void scary (View v)
        {

            EditText object = (EditText) findViewById(R.id.object);
            EditText food = (EditText) findViewById(R.id.food);
            EditText feeling = (EditText) findViewById(R.id.feeling);
            EditText name2 = (EditText) findViewById(R.id.name2);
            EditText verb2 = (EditText) findViewById(R.id.verb2);
            EditText name = (EditText) findViewById(R.id.name);
            EditText animal = (EditText) findViewById(R.id.animal);
            EditText number = (EditText) findViewById(R.id.number);
            EditText noun = (EditText) findViewById(R.id.noun);
            EditText verb = (EditText) findViewById(R.id.verb);
            EditText adjective1 = (EditText) findViewById(R.id.adjective1);
            EditText adjective2 = (EditText) findViewById(R.id.adjective2);

            if (object.length() == 0 || food.length() == 0 || feeling.length() == 0 || name2.length() == 0 || verb2.length() == 0 ||
                    name.length() == 0 || animal.length() == 0 || number.length() == 0 || noun.length() == 0 || verb.length() == 0 || adjective1.length() == 0
                    || adjective2.length() == 0)
            {
                Context context = getApplicationContext();
                CharSequence text = "Please fill in all inputs";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

                else
                {


                String objectStr = object.getText().toString();
                String foodStr = food.getText().toString();
                String feelingStr = feeling.getText().toString();
                String name2Str = name2.getText().toString();
                String verb2Str = verb2.getText().toString();
                String nameStr = name.getText().toString();
                String animalStr = animal.getText().toString();
                String numberStr = number.getText().toString();
                String nounStr = noun.getText().toString();
                String verbStr = verb.getText().toString();
                String adj1Str = adjective1.getText().toString();
                String adj2Str = adjective2.getText().toString();

                Intent intent = new Intent(this, MadLibScaryMethod.class);

                intent.putExtra(MadLibScaryMethod.OBJECT, objectStr);
                intent.putExtra(MadLibScaryMethod.FOOD, foodStr);
                intent.putExtra(MadLibScaryMethod.FEELING, feelingStr);
                intent.putExtra(MadLibScaryMethod.NAME2, name2Str);
                intent.putExtra(MadLibScaryMethod.VERB2, verb2Str);
                intent.putExtra(MadLibScaryMethod.NAME, nameStr);
                intent.putExtra(MadLibScaryMethod.ANIMAL, animalStr);
                intent.putExtra(MadLibScaryMethod.NUMBER, numberStr);
                intent.putExtra(MadLibScaryMethod.NOUN, nounStr);
                intent.putExtra(MadLibScaryMethod.VERB, verbStr);
                intent.putExtra(MadLibScaryMethod.ADJECTIVE1, adj1Str);
                intent.putExtra(MadLibScaryMethod.ADJECTIVE2, adj2Str);


                startActivity(intent);
            }
        }
    }
