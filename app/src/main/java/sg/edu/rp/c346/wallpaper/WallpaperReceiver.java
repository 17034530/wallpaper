package sg.edu.rp.c346.wallpaper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;


public class WallpaperReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"You have changed the wallpaper",Toast.LENGTH_SHORT).show();

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int id = preferences.getInt("id",R.id.msg1);
        if(id==R.id.msg1){
            Toast.makeText(context,R.string.good,Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(context,R.string.bad,Toast.LENGTH_LONG).show();
        }

    }

}
