package com.womensafety.sirichandana;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyService", "Service Started");
        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyService", "Service Stopped");
    }
}
