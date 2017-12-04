package com.example.android.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int answer1() {
        EditText answer1 = (EditText) findViewById(R.id.answer1);
        String answerAmadeus = answer1.getText().toString();
        int score1;
        if (answerAmadeus.equalsIgnoreCase("amadeus")) {
            score1 = 20;
        } else {
            score1 = 0;
        }
        return score1;
    }

    private int answer2() {
        RadioButton answer2 = (RadioButton) findViewById(R.id.answer2_2);
        Boolean answeredBeethoven = answer2.isChecked();
        int score2;
        if (answeredBeethoven == true) {
            score2 = 20;
        } else {
            score2 = 0;
        }
        return score2;
    }

    private int answer3() {
        CheckBox major = (CheckBox) findViewById(R.id.answer3_1);
        Boolean answeredMajor = major.isChecked();

        CheckBox minor = (CheckBox) findViewById(R.id.answer3_2);
        Boolean answeredMinor = minor.isChecked();

        CheckBox dSnyder = (CheckBox) findViewById(R.id.answer3_3);
        Boolean answeredDSnyder = dSnyder.isChecked();

        CheckBox noneOfTheAbove = (CheckBox) findViewById(R.id.answer3_4);
        Boolean answeredNone = noneOfTheAbove.isChecked();

        int score3;
        if (answeredDSnyder || answeredNone == true){
            score3 = 0;
        } else if (answeredMinor && answeredMajor == true) {
            score3 = 20;
        } else {
            score3 = 0;
        }
        return score3;
    }

    private int answer4() {
        CheckBox dizzieGillespie = (CheckBox) findViewById(R.id.answer4_1);
        Boolean answeredDG = dizzieGillespie.isChecked();

        CheckBox dukeEllington = (CheckBox) findViewById(R.id.answer4_2);
        Boolean answeredDukeE = dukeEllington.isChecked();

        CheckBox countBasie = (CheckBox) findViewById(R.id.answer4_3);
        Boolean answeredCountBasie = countBasie.isChecked();

        CheckBox noneOfTheAbove = (CheckBox) findViewById(R.id.answer4_4);
        Boolean answeredNone = noneOfTheAbove.isChecked();

        int score4;
        if (answeredNone == true) {
            score4 = 0;
        } else if (answeredDG && answeredDukeE && answeredCountBasie == true) {
            score4 = 20;
        } else {
            score4 = 0;
        }
        return score4;
    }

    private int answer5() {
        CheckBox trumpet = (CheckBox) findViewById(R.id.answer5_1);
        Boolean answeredTrumpet = trumpet.isChecked();

        CheckBox englishHorn = (CheckBox) findViewById(R.id.answer5_2);
        Boolean answeredEnglishHorn = englishHorn.isChecked();

        CheckBox frenchHorn = (CheckBox) findViewById(R.id.answer5_3);
        Boolean answeredFrenchHorn = frenchHorn.isChecked();

        CheckBox saxophone = (CheckBox) findViewById(R.id.answer5_4);
        Boolean answeredSaxophone = saxophone.isChecked();

        int score5;
        if(answeredEnglishHorn || answeredSaxophone == true) {
            score5 = 0;
        } else if (answeredTrumpet && answeredFrenchHorn == true) {
            score5 = 20;
        } else {
            score5 = 0;
        }
        return score5;
    }

    private int calculateScore() {
        int score = answer1() + answer2() + answer3() + answer4() + answer5();
        return score;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void displayScore(View view) {
        int score = calculateScore();

        Context context = getApplicationContext();
        CharSequence text = "Your Score: " + score;
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
