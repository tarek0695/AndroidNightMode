package com.pixelhubllc.androidnightmode;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {
    SharedPreferences mSharedPref;

    public SharedPref(Context context){
        mSharedPref = context.getSharedPreferences("filename",Context.MODE_PRIVATE);
    }

    //this method will save night mode state , true or false
    public void setNightModeState(Boolean state){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean("NightMode", state);
        editor.commit();
    }

    //this method will load the night mode state
    public boolean loadNightModeState(){
        Boolean state = mSharedPref.getBoolean("NightMode", false);
        return state;
    }
}
