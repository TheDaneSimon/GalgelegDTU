package arcinc.galgeleg;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Mads Stege on 22-10-2017.
 */

public class game_page_new extends AppCompatActivity implements View.OnClickListener {

    private TextView info, guessedLetters;
    private Button buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG,
            buttonH, buttonI, buttonJ, buttonK, buttonL, buttonM, buttonN, buttonO,
            buttonP, buttonQ, buttonR, buttonS, buttonT, buttonU, buttonV, buttonW,
            buttonX, buttonY, buttonZ, buttonÆ, buttonØ, buttonÅ;
    private ImageView hangStatus;
    Galgelogik gameLogic = new Galgelogik();
/*
Note that the reason for the extra forkert6.png object is that without it, the app would crash due to
an outOfBounds exception thrown because of a slightly faulty counter in the getBrugteBogstaver method.
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

        guessedLetters = (TextView) findViewById(R.id.textViewGuessedLetters);
        guessedLetters.setText("Du har gættet på: ");

        buttonA = (Button) findViewById(R.id.buttonA);buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);buttonD = (Button) findViewById(R.id.buttonD);
        buttonE = (Button) findViewById(R.id.buttonE);buttonF = (Button) findViewById(R.id.buttonF);
        buttonG = (Button) findViewById(R.id.buttonG);buttonH = (Button) findViewById(R.id.buttonH);
        buttonI = (Button) findViewById(R.id.buttonI);buttonJ = (Button) findViewById(R.id.buttonJ);
        buttonK = (Button) findViewById(R.id.buttonK);buttonL = (Button) findViewById(R.id.buttonL);
        buttonM = (Button) findViewById(R.id.buttonM);buttonN = (Button) findViewById(R.id.buttonN);
        buttonO = (Button) findViewById(R.id.buttonO);buttonP = (Button) findViewById(R.id.buttonP);
        buttonQ = (Button) findViewById(R.id.buttonQ);buttonR = (Button) findViewById(R.id.buttonR);
        buttonS = (Button) findViewById(R.id.buttonS);buttonT = (Button) findViewById(R.id.buttonT);
        buttonU = (Button) findViewById(R.id.buttonU);buttonV = (Button) findViewById(R.id.buttonV);
        buttonW = (Button) findViewById(R.id.buttonW);buttonX = (Button) findViewById(R.id.buttonX);
        buttonY = (Button) findViewById(R.id.buttonY);buttonZ = (Button) findViewById(R.id.buttonZ);
        buttonÆ = (Button) findViewById(R.id.buttonÆ);buttonØ = (Button) findViewById(R.id.buttonØ);
        buttonÅ = (Button) findViewById(R.id.buttonÅ);

        buttonA.setOnClickListener(this);buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);buttonD.setOnClickListener(this);
        buttonE.setOnClickListener(this);buttonF.setOnClickListener(this);
        buttonG.setOnClickListener(this);buttonH.setOnClickListener(this);
        buttonI.setOnClickListener(this);buttonJ.setOnClickListener(this);
        buttonK.setOnClickListener(this);buttonL.setOnClickListener(this);
        buttonM.setOnClickListener(this);buttonN.setOnClickListener(this);
        buttonO.setOnClickListener(this);buttonP.setOnClickListener(this);
        buttonQ.setOnClickListener(this);buttonR.setOnClickListener(this);
        buttonS.setOnClickListener(this);buttonT.setOnClickListener(this);
        buttonU.setOnClickListener(this);buttonV.setOnClickListener(this);
        buttonW.setOnClickListener(this);buttonX.setOnClickListener(this);
        buttonY.setOnClickListener(this);buttonZ.setOnClickListener(this);
        buttonÆ.setOnClickListener(this);buttonØ.setOnClickListener(this);
        buttonÅ.setOnClickListener(this);

        hangStatus = (ImageView) findViewById(R.id.imageViewHangStatus);


    }
/*
onClick method to check which button was pressed.
 */

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.buttonA:
                gameLogic.gætBogstav("A");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonB:
                gameLogic.gætBogstav("B");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonC:
                gameLogic.gætBogstav("C");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonD:
                gameLogic.gætBogstav("D");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonE:
                gameLogic.gætBogstav("E");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonF:
                gameLogic.gætBogstav("F");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonG:
                gameLogic.gætBogstav("G");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonH:
                gameLogic.gætBogstav("H");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonI:
                gameLogic.gætBogstav("I");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonJ:
                gameLogic.gætBogstav("J");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonK:
                gameLogic.gætBogstav("K");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonL:
                gameLogic.gætBogstav("L");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonM:
                gameLogic.gætBogstav("M");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonN:
                gameLogic.gætBogstav("N");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonO:
                gameLogic.gætBogstav("O");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonP:
                gameLogic.gætBogstav("P");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonQ:
                gameLogic.gætBogstav("Q");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonR:
                gameLogic.gætBogstav("R");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonS:
                gameLogic.gætBogstav("S");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonT:
                gameLogic.gætBogstav("T");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonU:
                gameLogic.gætBogstav("U");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonV:
                gameLogic.gætBogstav("V");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonW:
                gameLogic.gætBogstav("W");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonX:
                gameLogic.gætBogstav("X");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonY:
                gameLogic.gætBogstav("Y");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonZ:
                gameLogic.gætBogstav("Z");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonÆ:
                gameLogic.gætBogstav("Æ");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonØ:
                gameLogic.gætBogstav("Ø");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;
            case R.id.buttonÅ:
                gameLogic.gætBogstav("Å");
                buttonA.setEnabled(false);
                buttonA.setBackgroundColor(Color.GRAY);
                break;

        }

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
            info.setText("Tillykke! Du har vundet! \n Dit ord var: "+gameLogic.getOrdet().substring(0,1).toUpperCase()+gameLogic.getOrdet().substring(1));
               guessedLetters.setText("Du gættede på: "+gameLogic.getBrugteBogstaver());
        }
        if (gameLogic.erSpilletTabt()){
            info.setText("Desværre! Du har tabt! \n Det rigtige ord er: " + gameLogic.getOrdet().substring(0,1).toUpperCase()+gameLogic.getOrdet().substring(1));
            guessedLetters.setText("Du gættede på: "+gameLogic.getBrugteBogstaver());

        }
    }
}