package arcinc.galgeleg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    Button buttonHelp, buttonStart, buttonHighScore, buttonSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        buttonHelp = (Button) findViewById(R.id.buttonHelp);
        buttonHighScore = (Button) findViewById(R.id.buttonHighscore);
        buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonSettings = (Button) findViewById(R.id.buttonSettings);

        buttonHelp.setOnClickListener(this);
        buttonHighScore.setOnClickListener(this);
        buttonStart.setOnClickListener(this);
        buttonSettings.setOnClickListener(this);
    }


    public void onClick (View v) {

        if (v == buttonStart){
            Intent i = new Intent(this, game_page_new.class);
            startActivity(i);
        }

        else if (v == buttonHighScore){
            Toast.makeText(this, "Denne funktion er endnu ikke implementeret!", Toast.LENGTH_SHORT).show();
        }

        else if (v == buttonHelp){
            Intent i = new Intent(this, help_page.class);
            startActivity(i);
        }

        else if (v == buttonSettings){
            Toast.makeText(this, "Denne funktion er endnu ikke implementeret!", Toast.LENGTH_SHORT).show();
        }

    }
}
