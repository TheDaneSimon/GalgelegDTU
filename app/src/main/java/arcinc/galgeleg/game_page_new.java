package arcinc.galgeleg;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Mads Stege on 22-10-2017.
 */

public class game_page_new extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewInfo;
    private Button buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG,
            buttonH, buttonI, buttonJ, buttonK, buttonL, buttonM, buttonN, buttonO,
            buttonP, buttonQ, buttonR, buttonS, buttonT, buttonU, buttonV, buttonW,
            buttonX, buttonY, buttonZ, buttonÆ, buttonØ, buttonÅ, buttonExit, buttonNewWord,
            buttonDRGet;

    private ImageView hangStatus;

    private GridLayout gridLayoutButtons;

    private String gættetOrd;

    private int antalForkerte;

    Galgelogik gameLogic = new Galgelogik();

    private static int[] hangPic = {
            R.drawable.galge,
            R.drawable.forkert1,
            R.drawable.forkert2,
            R.drawable.forkert3,
            R.drawable.forkert4,
            R.drawable.forkert5,
            R.drawable.forkert6
    };

    /*
    Creation of various objects and fields.
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page_new);

        textViewInfo = (TextView) findViewById(R.id.textViewInfo);
        textViewInfo.setText("Dit ord er: \n" + gameLogic.getSynligtOrd());

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonD = (Button) findViewById(R.id.buttonD);
        buttonE = (Button) findViewById(R.id.buttonE);
        buttonF = (Button) findViewById(R.id.buttonF);
        buttonG = (Button) findViewById(R.id.buttonG);
        buttonH = (Button) findViewById(R.id.buttonH);
        buttonI = (Button) findViewById(R.id.buttonI);
        buttonJ = (Button) findViewById(R.id.buttonJ);
        buttonK = (Button) findViewById(R.id.buttonK);
        buttonL = (Button) findViewById(R.id.buttonL);
        buttonM = (Button) findViewById(R.id.buttonM);
        buttonN = (Button) findViewById(R.id.buttonN);
        buttonO = (Button) findViewById(R.id.buttonO);
        buttonP = (Button) findViewById(R.id.buttonP);
        buttonQ = (Button) findViewById(R.id.buttonQ);
        buttonR = (Button) findViewById(R.id.buttonR);
        buttonS = (Button) findViewById(R.id.buttonS);
        buttonT = (Button) findViewById(R.id.buttonT);
        buttonU = (Button) findViewById(R.id.buttonU);
        buttonV = (Button) findViewById(R.id.buttonV);
        buttonW = (Button) findViewById(R.id.buttonW);
        buttonX = (Button) findViewById(R.id.buttonX);
        buttonY = (Button) findViewById(R.id.buttonY);
        buttonZ = (Button) findViewById(R.id.buttonZ);
        buttonÆ = (Button) findViewById(R.id.buttonÆ);
        buttonØ = (Button) findViewById(R.id.buttonØ);
        buttonÅ = (Button) findViewById(R.id.buttonÅ);

        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonF.setOnClickListener(this);
        buttonG.setOnClickListener(this);
        buttonH.setOnClickListener(this);
        buttonI.setOnClickListener(this);
        buttonJ.setOnClickListener(this);
        buttonK.setOnClickListener(this);
        buttonL.setOnClickListener(this);
        buttonM.setOnClickListener(this);
        buttonN.setOnClickListener(this);
        buttonO.setOnClickListener(this);
        buttonP.setOnClickListener(this);
        buttonQ.setOnClickListener(this);
        buttonR.setOnClickListener(this);
        buttonS.setOnClickListener(this);
        buttonT.setOnClickListener(this);
        buttonU.setOnClickListener(this);
        buttonV.setOnClickListener(this);
        buttonW.setOnClickListener(this);
        buttonX.setOnClickListener(this);
        buttonY.setOnClickListener(this);
        buttonZ.setOnClickListener(this);
        buttonÆ.setOnClickListener(this);
        buttonØ.setOnClickListener(this);
        buttonÅ.setOnClickListener(this);

        buttonExit = (Button) findViewById(R.id.buttonExit);
        buttonExit.setOnClickListener(this);
        buttonExit.setText("Afslut spil");

        buttonNewWord = (Button) findViewById(R.id.buttonResetUI);
        buttonNewWord.setOnClickListener(this);
        buttonNewWord.setText("Nyt ord");

        buttonDRGet = (Button) findViewById(R.id.buttonDrNewWords);
        buttonDRGet.setOnClickListener(this);
        buttonDRGet.setText("DR");

        hangStatus = (ImageView) findViewById(R.id.imageViewHangStatus);
        hangStatus.setImageResource(R.drawable.galge);

        gridLayoutButtons = (GridLayout) findViewById(R.id.gridLayout);

    }

    /*
    onClick method to check which button was pressed.
     */
    @Override
    public void onClick(View v) {

        if (v == buttonExit) {
            finish();
        } else if (v == buttonDRGet) {
            buttonDRGet.setEnabled(false);
            buttonDRGet.setBackgroundColor(Color.GRAY);

            class asyncTaskDR extends AsyncTask {
                @Override
                protected Object doInBackground(Object[] objects) {
                    try {
                        gameLogic.hentOrdFraDr();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                }

                @Override
                protected void onPostExecute(Object result) {
                    buttonDRGet.setText("OK");
                    Toast.makeText(game_page_new.this, "Hentede ord fra DR", Toast.LENGTH_SHORT).show();
                    gameLogic.nulstil();
                    buttonReset();
                    updateScreen();
                }
            }
            new asyncTaskDR().execute();
        } else if (v == buttonNewWord) {
            gameLogic.nulstil();
            buttonReset();
        } else {
            Button b = (Button) v;
            gameLogic.gætBogstav(b.getText().toString().toLowerCase());
            b.setEnabled(false);
            if (gameLogic.getOrdet().contains(b.getText().toString().toLowerCase())) {
                b.setBackgroundColor(getResources().getColor(R.color.grønKorrekt));
            } else {
                b.setBackgroundColor(getResources().getColor(R.color.rødForkert));
            }
        }
        updateScreen();
    }

    /*
    Method to reset the buttons of the app
    */
    private void buttonReset() {
        for (int i = 0; i < gridLayoutButtons.getChildCount(); i++) {
            gridLayoutButtons.getChildAt(i).setBackgroundColor(Color.BLACK);
            gridLayoutButtons.getChildAt(i).setEnabled(true);
        }
    }

    /*
    Method to update the screen after the user's done interacting with the buttons.
    */
    private void updateScreen() {
        textViewInfo.setText("Dit ord er: \n" + gameLogic.getSynligtOrd());

        try {
            hangStatus.setImageResource(hangPic[gameLogic.getAntalForkerteBogstaver()]);
        } catch (Exception e) {
            hangStatus.setImageResource(hangPic[R.drawable.forkert6]);
        }
        if (gameLogic.erSpilletVundet()) {
            hentDataOgRens();

            Intent intent = new Intent(getApplicationContext(), game_page_won.class);
            intent.putExtra("AntalForkerte", antalForkerte);
            intent.putExtra("GættetOrd", gættetOrd);
            startActivity(intent);
        }
        else if (gameLogic.erSpilletTabt()) {
            hentDataOgRens();

            Intent intent = new Intent(getApplicationContext(), game_page_lost.class);
            intent.putExtra("AntalForkerte", antalForkerte);
            intent.putExtra("GættetOrd", gættetOrd);
            startActivity(intent);
        }
    }

    /*
    Method to retreive relevant data and cleanse the screen,
    for when the user returns to the previous page
     */

    private void hentDataOgRens() {
        gættetOrd = gameLogic.getOrdet().substring(0, 1).toUpperCase() + gameLogic.getOrdet().substring(1);
        antalForkerte = gameLogic.getAntalForkerteBogstaver();
        buttonReset();
        gameLogic.nulstil();
        hangStatus.setImageResource(hangPic[0]);
        updateScreen();

    }
}