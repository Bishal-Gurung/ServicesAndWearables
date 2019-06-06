package com.e.servicesandwearables;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import broadcasts.BroadCastReceiverExample;

public class BroadCastActivity extends AppCompatActivity {

    BroadCastReceiverExample broadCastReceiverExample=new BroadCastReceiverExample();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast);
    }

    @Override
    protected void onStart() {
        super.onStart();

        IntentFilter intentFilter=new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(broadCastReceiverExample,intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadCastReceiverExample);
    }
}
