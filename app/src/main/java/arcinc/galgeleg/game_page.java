package arcinc.galgeleg;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Mads Stege on 22-10-2017.
 */

public class game_page extends AppCompatActivity implements View.OnClickListener {

    private TextView info, guessedLetters;
    private Button buttonGuess, buttonBackToMenu, buttonReset;
    private EditText et;
    private ImageView hangStatus;
    Galgelogik gameLogic = new Galgelogik();
/*
Note that the reason for the extra forkert6.png object is that without it, the app would crash due to
an outOfBounds exception thrown because of a slightly faulty cocunter in the getBrugteBogstaver method.
 */
    private static int [] hangPic = {
        R.drawable.galge,
        R.drawable.forkert1,
        R.drawable.forkert2,
        R.drawable.forkert3,
        R.drawable.forkert4,
        R.drawable.forkert5,
        R.drawable.forkert6,
        R.drawable.forkert6
    };
/*
Creation of various objects and fields.
 */
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);

        info = (TextView) findViewById(R.id.textViewInfo);
        info.setText("Dit ord er: \n" + gameLogic.getSynligtOrd());

        guessedLetters = (TextView) findViewById(R.id.textGuessedLetters);
        guessedLetters.setText("Du har gættet på: ");

        et = (EditText) findViewById(R.id.editTextGuess);
        et.setText("Gæt på et bogstav her!");

        buttonGuess = (Button) findViewById(R.id.buttonGuess);
        buttonGuess.setOnClickListener(this);
        buttonBackToMenu = (Button) findViewById(R.id.buttonBackToMenu);
        buttonBackToMenu.setOnClickListener(this);
        buttonReset = (Button) findViewById(R.id.buttonReset);
        buttonReset.setOnClickListener(this);

        hangStatus = (ImageView) findViewById(R.id.imageViewHangStatus);

    }
/*
onClick method to check which button was pressed.
 */

    @Override
    public void onClick(View v) {
        if (v == buttonGuess) {
            String bogstavGæt = et.getText().toString();
            if (bogstavGæt.length() != 1) {
                Toast.makeText(this, "Indsæt kun ét bogstav", Toast.LENGTH_SHORT).show();
            }
            gameLogic.gætBogstav(bogstavGæt);
        }
        if (v == buttonBackToMenu){
            Intent i = new Intent (this, MainActivity.class);
            startActivity(i);
        }
        if (v == buttonReset){
            gameLogic.nulstil();
            et.setText("Gæt på et bogstav her!");
            buttonGuess.setEnabled(true);
            buttonGuess.setBackgroundColor(Color.BLACK);
        }
        et.setText("");
        updateScreen();
    }
/*
Method to update the screen after the user's done interacting with the buttons.
 */
    private void updateScreen() {
        info.setText("Dit ord er: \n" + gameLogic.getSynligtOrd());
        guessedLetters.setText("Du har gættet på: " + gameLogic.getBrugteBogstaver());

        try {
            hangStatus.setImageResource(hangPic[gameLogic.getAntalForkerteBogstaver()]);
        } catch (Exception e) {
            hangStatus.setImageResource(hangPic[R.drawable.forkert6]);
        }

        if (gameLogic.erSpilletVundet()){
            info.setText("Tillykke! Du har vundet!");
            buttonGuess.setEnabled(false);
            buttonGuess.setBackgroundColor(Color.GRAY);
        }
        if (gameLogic.erSpilletTabt()){
            info.setText("Spillet er tabt, det rigtige ord er: " + gameLogic.getOrdet());
            buttonGuess.setEnabled(false);
            buttonGuess.setBackgroundColor(Color.GRAY);
        }
    }
}