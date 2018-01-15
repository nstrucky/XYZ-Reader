package com.example.xyzreader.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Nick on 1/15/2018.
 */

public class NetworkUtil {

    public static boolean checkNetworkConnection(Context context) {

        ConnectivityManager managerCompat = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = managerCompat.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnectedOrConnecting();

    }
}
