package arcinc.galgeleg;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mads on 07-11-2017.
 */

public class game_page_won extends AppCompatActivity implements View.OnClickListener {


    private Button buttonBack;
    private TextView textViewInfo;
    private ImageView imageViewHangPic;
    private int antalForkerte;
    private String gættetOrd;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_game_won_page);

        antalForkerte = getIntent().getIntExtra("AntalForkerte", 0);
        gættetOrd = getIntent().getStringExtra("GættetOrd");

        buttonBack = (Button) findViewById(R.id.buttonReturn);
        buttonBack.setOnClickListener(this);
        buttonBack.setText("Tilbage");

        textViewInfo = (TextView) findViewById(R.id.textViewInfo);
        textViewInfo.setText("Tillykke, du vandt spillet. \n" +
                "Du gættede forkert " + antalForkerte + " gange i dit forsøg på at gætte ordet: \n" + gættetOrd);

        imageViewHangPic = (ImageView) findViewById(R.id.imageViewHangPic);
        imageViewHangPic.setImageResource(R.drawable.vandtpic);

    }



    @Override
    public void onClick(View v) {
        if (v == buttonBack){
            finish();
        }
    }
}
