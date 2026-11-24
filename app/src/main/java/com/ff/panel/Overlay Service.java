package com.ff.panel;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class OverlayService extends Service {
    static { System.loadLibrary("ffpanel"); }
    public native void startOverlay();
    @Override public IBinder onBind(Intent intent) { return null; }
    @Override public void onCreate() {
        super.onCreate();
        startOverlay();
    }
}
