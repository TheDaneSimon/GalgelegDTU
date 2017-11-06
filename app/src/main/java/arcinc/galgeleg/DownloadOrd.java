package arcinc.galgeleg;

/**
 * Created by Mads on 06-11-2017.
 */
import android.os.AsyncTask;

public class DownloadOrd extends AsyncTask<String, Void, String> {

    Galgelogik galgelogik = new Galgelogik();
    public void Runable (){
        //doInBackground();
    }

    @Override
    protected String doInBackground(String... strings) {
        try {
            galgelogik.hentOrdFraDr();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Task finished");
        return "Executed!";
    }
}
