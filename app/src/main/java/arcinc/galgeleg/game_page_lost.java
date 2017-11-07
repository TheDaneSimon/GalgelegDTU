package arcinc.galgeleg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mads on 07-11-2017.
 */

public class game_page_lost extends AppCompatActivity implements View.OnClickListener {


    Button buttonBack;
    TextView textViewInfo;
    ImageView imageViewHangPic;
    int antalForkerte;
    String gættetOrd;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_lost);

        antalForkerte = getIntent().getIntExtra("AntalForkerte", 0);
        gættetOrd = getIntent().getStringExtra("GættetOrd");

        buttonBack = (Button) findViewById(R.id.buttonReturn);
        buttonBack.setOnClickListener(this);
        buttonBack.setText("Tilbage");

        textViewInfo = (TextView) findViewById(R.id.textViewInfo);
        textViewInfo.setText("Desværre, du tabte. \n" +
                "Du gættede forkert 6 gange i dit forsøg på at gætte ordet: \n" + gættetOrd);

        imageViewHangPic = (ImageView) findViewById(R.id.imageViewHangPic);
        imageViewHangPic.setImageResource(R.drawable.tabtpic);

    }


    @Override
    public void onClick(View v) {
        if (v == buttonBack){
            finish();
        }
    }
}
