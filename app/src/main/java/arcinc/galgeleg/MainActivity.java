package arcinc.galgeleg;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonHelp, buttonStart, buttonHighScore, buttonSettings;
    private String playerName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main_page);

        buttonHelp = (Button) findViewById(R.id.buttonHelp);
        buttonHighScore = (Button) findViewById(R.id.buttonHighscore);
        buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonSettings = (Button) findViewById(R.id.buttonSettings);

        buttonHelp.setOnClickListener(this);
        buttonHighScore.setOnClickListener(this);
        buttonStart.setOnClickListener(this);
        buttonSettings.setOnClickListener(this);

        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        playerName = sharedPrefs.getString("spillerNavn", "Anonym");

        if (playerName == "Anonym") {
            Toast.makeText(this, "Gå til Indstillinger for at sætte nyt spillernavn", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Velkommen, " + playerName, Toast.LENGTH_SHORT).show();
        }

    }


    public void onClick(View v) {

        if (v == buttonStart) {
            Intent i = new Intent(this, game_page_new.class);
            startActivity(i);
        } else if (v == buttonHighScore) {
            Toast.makeText(this, "Denne funktion er endnu ikke implementeret!", Toast.LENGTH_SHORT).show();
        } else if (v == buttonHelp) {
            Intent i = new Intent(this, help_page.class);
            startActivity(i);
        } else if (v == buttonSettings) {
            Intent i = new Intent(this, settings_page.class);
            startActivity(i);
        }

    }
}
