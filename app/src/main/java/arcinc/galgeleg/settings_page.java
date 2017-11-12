package arcinc.galgeleg;

import android.os.Bundle;
import android.preference.PreferenceActivity;


/**
 * Created by Mads on 11-11-2017.
 */

public class settings_page extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }

}
