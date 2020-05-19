package com.codegama.commutionlibrary;

import android.content.Context;
import android.content.Intent;

public class CallAnotherAppActivity {

    public static void callApplication(Context context, int inputOne, int inputTwo, int type) {
        Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage("com.codegama.newapplication");
        launchIntent.putExtra("INPUT_ONE", inputOne);
        launchIntent.putExtra("INPUT_TWO", inputTwo);
        launchIntent.putExtra("TYPE", type);
        if (launchIntent != null) {
            context.startActivity(launchIntent);
        }
    }
}
