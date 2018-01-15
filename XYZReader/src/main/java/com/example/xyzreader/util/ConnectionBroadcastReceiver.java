package com.example.xyzreader.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.net.ConnectivityManagerCompat;

/**
 * Created by Nick on 1/15/2018.
 */

public class ConnectionBroadcastReceiver extends BroadcastReceiver {

    public interface ConnectivityChangeListener {
        void connectivityChanged(boolean connected);
    }

    ConnectivityChangeListener listener;

    public ConnectionBroadcastReceiver(ConnectivityChangeListener listener) {
        this.listener = listener;
    }


    @Override
    public void onReceive(Context context, Intent intent) {

        listener.connectivityChanged(NetworkUtil.checkNetworkConnection(context));
    }


}
