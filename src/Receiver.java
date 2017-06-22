package com.install.referral;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

public class Receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        /************* Get referrer ************/
		
        String referrer = intent.getStringExtra("referrer");

        /****************** Save Referrer Value to SharedPreferences **********************/

        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = sharedpreferences.edit();
        edit.putString("referrer", referrer);
        edit.apply();
		
    }
}