package arcinc.galgeleg;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class help_page extends AppCompatActivity implements View.OnClickListener {

    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_help_page);

        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(this);
    }

    public void onClick (View v){
        if (v == buttonBack){
            finish();
        }
    }
}
