package arcinc.galgeleg;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Mads Stege on 22-10-2017.
 */

public class game_page_new extends Activity implements View.OnClickListener {

    private TextView info;
    private Button buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG,
            buttonH, buttonI, buttonJ, buttonK, buttonL, buttonM, buttonN, buttonO,
            buttonP, buttonQ, buttonR, buttonS, buttonT, buttonU, buttonV, buttonW,
            buttonX, buttonY, buttonZ, buttonÆ, buttonØ, buttonÅ, buttonExit, buttonNewWord;

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
        setContentView(R.layout.activity_game_page_new);

        String bogstavGæt;

        info = (TextView) findViewById(R.id.textViewInfo);
        info.setText("Dit ord er: \n" + gameLogic.getSynligtOrd());

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

        buttonExit = (Button) findViewById(R.id.buttonExit);
        buttonExit.setOnClickListener(this);
        buttonExit.setText("Afslut spil");

        buttonNewWord = (Button) findViewById(R.id.buttonNewWord);
        buttonNewWord.setOnClickListener(this);
        buttonNewWord.setText("Nyt ord");

        hangStatus = (ImageView) findViewById(R.id.imageViewHangStatus);
        hangStatus.setImageResource(R.drawable.galge);


    }
/*
onClick method to check which button was pressed.
 */
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonA:
                gameLogic.gætBogstav("a");
                buttonA.setEnabled(false);
                if (gameLogic.getOrdet().contains("a")){
                    buttonA.setBackgroundColor(Color.GREEN);
                } else {
                    buttonA.setBackgroundColor(Color.RED);
                }
                updateScreen();
                break;
            case R.id.buttonB:
                gameLogic.gætBogstav("b");
                buttonB.setEnabled(false);
                if (gameLogic.getOrdet().contains("b")){
                    buttonB.setBackgroundColor(Color.GREEN);
                } else {
                    buttonB.setBackgroundColor(Color.RED);
                }
                updateScreen();
                break;
            case R.id.buttonC:
                gameLogic.gætBogstav("c");
                buttonC.setEnabled(false);
                if (gameLogic.getOrdet().contains("c")){
                    buttonC.setBackgroundColor(Color.GREEN);
                } else {
                    buttonC.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonD:
                gameLogic.gætBogstav("d");
                buttonD.setEnabled(false);
                if (gameLogic.getOrdet().contains("d")){
                    buttonD.setBackgroundColor(Color.GREEN);
                } else {
                    buttonD.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonE:
                gameLogic.gætBogstav("e");
                buttonE.setEnabled(false);
                if (gameLogic.getOrdet().contains("e")){
                    buttonE.setBackgroundColor(Color.GREEN);
                } else {
                    buttonE.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonF:
                gameLogic.gætBogstav("f");
                buttonF.setEnabled(false);
                if (gameLogic.getOrdet().contains("f")){
                    buttonF.setBackgroundColor(Color.GREEN);
                } else {
                    buttonF.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonG:
                gameLogic.gætBogstav("g");
                buttonG.setEnabled(false);
                if (gameLogic.getOrdet().contains("g")){
                    buttonG.setBackgroundColor(Color.GREEN);
                } else {
                    buttonG.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonH:
                gameLogic.gætBogstav("h");
                buttonH.setEnabled(false);
                if (gameLogic.getOrdet().contains("h")){
                    buttonH.setBackgroundColor(Color.GREEN);
                } else {
                    buttonH.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonI:
                gameLogic.gætBogstav("i");
                buttonI.setEnabled(false);
                if (gameLogic.getOrdet().contains("i")){
                    buttonI.setBackgroundColor(Color.GREEN);
                } else {
                    buttonI.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonJ:
                gameLogic.gætBogstav("j");
                buttonJ.setEnabled(false);
                if (gameLogic.getOrdet().contains("j")){
                    buttonJ.setBackgroundColor(Color.GREEN);
                } else {
                    buttonJ.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonK:
                gameLogic.gætBogstav("k");
                buttonK.setEnabled(false);
                if (gameLogic.getOrdet().contains("k")){
                    buttonK.setBackgroundColor(Color.GREEN);
                } else {
                    buttonK.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonL:
                gameLogic.gætBogstav("l");
                buttonL.setEnabled(false);
                if (gameLogic.getOrdet().contains("l")){
                    buttonL.setBackgroundColor(Color.GREEN);
                } else {
                    buttonL.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonM:
                gameLogic.gætBogstav("m");
                buttonM.setEnabled(false);
                if (gameLogic.getOrdet().contains("m")){
                    buttonM.setBackgroundColor(Color.GREEN);
                } else {
                    buttonM.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonN:
                gameLogic.gætBogstav("n");
                buttonN.setEnabled(false);
                if (gameLogic.getOrdet().contains("n")){
                    buttonN.setBackgroundColor(Color.GREEN);
                } else {
                    buttonN.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonO:
                gameLogic.gætBogstav("o");
                buttonO.setEnabled(false);
                if (gameLogic.getOrdet().contains("o")){
                    buttonO.setBackgroundColor(Color.GREEN);
                } else {
                    buttonO.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonP:
                gameLogic.gætBogstav("p");
                buttonP.setEnabled(false);
                if (gameLogic.getOrdet().contains("p")){
                    buttonP.setBackgroundColor(Color.GREEN);
                } else {
                    buttonP.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonQ:
                gameLogic.gætBogstav("q");
                buttonQ.setEnabled(false);
                if (gameLogic.getOrdet().contains("q")){
                    buttonQ.setBackgroundColor(Color.GREEN);
                } else {
                    buttonQ.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonR:
                gameLogic.gætBogstav("r");
                buttonR.setEnabled(false);
                if (gameLogic.getOrdet().contains("r")){
                    buttonR.setBackgroundColor(Color.GREEN);
                } else {
                    buttonR.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonS:
                gameLogic.gætBogstav("s");
                buttonS.setEnabled(false);
                if (gameLogic.getOrdet().contains("s")){
                    buttonS.setBackgroundColor(Color.GREEN);
                } else {
                    buttonS.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonT:
                gameLogic.gætBogstav("t");
                buttonT.setEnabled(false);
                if (gameLogic.getOrdet().contains("t")){
                    buttonT.setBackgroundColor(Color.GREEN);
                } else {
                    buttonT.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonU:
                gameLogic.gætBogstav("u");
                buttonU.setEnabled(false);
                if (gameLogic.getOrdet().contains("u")){
                    buttonU.setBackgroundColor(Color.GREEN);
                } else {
                    buttonU.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonV:
                gameLogic.gætBogstav("v");
                buttonV.setEnabled(false);
                if (gameLogic.getOrdet().contains("v")){
                    buttonV.setBackgroundColor(Color.GREEN);
                } else {
                    buttonV.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonW:
                gameLogic.gætBogstav("w");
                buttonW.setEnabled(false);
                if (gameLogic.getOrdet().contains("w")){
                    buttonW.setBackgroundColor(Color.GREEN);
                } else {
                    buttonW.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonX:
                gameLogic.gætBogstav("x");
                buttonX.setEnabled(false);
                if (gameLogic.getOrdet().contains("x")){
                    buttonX.setBackgroundColor(Color.GREEN);
                } else {
                    buttonX.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonY:
                gameLogic.gætBogstav("y");
                buttonY.setEnabled(false);
                if (gameLogic.getOrdet().contains("y")){
                    buttonY.setBackgroundColor(Color.GREEN);
                } else {
                    buttonY.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonZ:
                gameLogic.gætBogstav("z");
                buttonZ.setEnabled(false);
                if (gameLogic.getOrdet().contains("z")){
                    buttonZ.setBackgroundColor(Color.GREEN);
                } else {
                    buttonZ.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonÆ:
                gameLogic.gætBogstav("æ");
                buttonÆ.setEnabled(false);
                if (gameLogic.getOrdet().contains("æ")){
                    buttonÆ.setBackgroundColor(Color.GREEN);
                } else {
                    buttonÆ.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonØ:
                gameLogic.gætBogstav("ø");
                buttonØ.setEnabled(false);
                if (gameLogic.getOrdet().contains("ø")){
                    buttonØ.setBackgroundColor(Color.GREEN);
                } else {
                    buttonØ.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonÅ:
                gameLogic.gætBogstav("å");
                buttonÅ.setEnabled(false);
                if (gameLogic.getOrdet().contains("å")){
                    buttonÅ.setBackgroundColor(Color.GREEN);
                } else {
                    buttonÅ.setBackgroundColor(Color.RED);
                }
                break;
            case R.id.buttonExit:
                finish();
                break;
            case R.id.buttonNewWord:
                gameLogic.nulstil();
                buttonA.setEnabled(true);
                buttonA.setBackgroundColor(Color.BLACK);
                buttonB.setEnabled(true);
                buttonB.setBackgroundColor(Color.BLACK);
                buttonC.setEnabled(true);
                buttonC.setBackgroundColor(Color.BLACK);
                buttonD.setEnabled(true);
                buttonD.setBackgroundColor(Color.BLACK);
                buttonE.setEnabled(true);
                buttonE.setBackgroundColor(Color.BLACK);
                buttonF.setEnabled(true);
                buttonF.setBackgroundColor(Color.BLACK);
                buttonG.setEnabled(true);
                buttonG.setBackgroundColor(Color.BLACK);
                buttonH.setEnabled(true);
                buttonH.setBackgroundColor(Color.BLACK);
                buttonI.setEnabled(true);
                buttonI.setBackgroundColor(Color.BLACK);
                buttonJ.setEnabled(true);
                buttonJ.setBackgroundColor(Color.BLACK);
                buttonK.setEnabled(true);
                buttonK.setBackgroundColor(Color.BLACK);
                buttonL.setEnabled(true);
                buttonL.setBackgroundColor(Color.BLACK);
                buttonM.setEnabled(true);
                buttonM.setBackgroundColor(Color.BLACK);
                buttonN.setEnabled(true);
                buttonN.setBackgroundColor(Color.BLACK);
                buttonO.setEnabled(true);
                buttonO.setBackgroundColor(Color.BLACK);
                buttonP.setEnabled(true);
                buttonP.setBackgroundColor(Color.BLACK);
                buttonQ.setEnabled(true);
                buttonQ.setBackgroundColor(Color.BLACK);
                buttonR.setEnabled(true);
                buttonR.setBackgroundColor(Color.BLACK);
                buttonS.setEnabled(true);
                buttonS.setBackgroundColor(Color.BLACK);
                buttonT.setEnabled(true);
                buttonT.setBackgroundColor(Color.BLACK);
                buttonU.setEnabled(true);
                buttonU.setBackgroundColor(Color.BLACK);
                buttonV.setEnabled(true);
                buttonV.setBackgroundColor(Color.BLACK);
                buttonW.setEnabled(true);
                buttonW.setBackgroundColor(Color.BLACK);
                buttonX.setEnabled(true);
                buttonX.setBackgroundColor(Color.BLACK);
                buttonY.setEnabled(true);
                buttonY.setBackgroundColor(Color.BLACK);
                buttonZ.setEnabled(true);
                buttonZ.setBackgroundColor(Color.BLACK);
                buttonÆ.setEnabled(true);
                buttonÆ.setBackgroundColor(Color.BLACK);
                buttonØ.setEnabled(true);
                buttonØ.setBackgroundColor(Color.BLACK);
                buttonÅ.setEnabled(true);
                buttonÅ.setBackgroundColor(Color.BLACK);
        }
        updateScreen();
    }
/*
Method to update the screen after the user's done interacting with the buttons.
 */
    private void updateScreen() {
        info.setText("Dit ord er: \n" + gameLogic.getSynligtOrd());

        try {
            hangStatus.setImageResource(hangPic[gameLogic.getAntalForkerteBogstaver()]);
        } catch (Exception e) {
            hangStatus.setImageResource(hangPic[R.drawable.forkert6]);
        }
        if (gameLogic.erSpilletVundet()){
            info.setText("Du gættede rigtigt! \n Dit ord var: "+gameLogic.getOrdet().substring(0,1).toUpperCase()+gameLogic.getOrdet().substring(1));
        }
        if (gameLogic.erSpilletTabt()){
            info.setText("Du har tabt! \n Ordet var: " + gameLogic.getOrdet().substring(0,1).toUpperCase()+gameLogic.getOrdet().substring(1));

        }
    }
}