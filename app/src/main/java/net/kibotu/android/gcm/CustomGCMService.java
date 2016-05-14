package net.kibotu.android.gcm;

import android.os.Bundle;
import android.util.Log;

import co.mobiwise.fastgcm.GCMListenerService;

/**
 * Created by jan.rabe on 12/05/16.
 */
public class CustomGCMService extends GCMListenerService {

    private static final String TAG = CustomGCMService.class.getSimpleName();

    @Override
    public void onMessageReceived(String from, Bundle data) {
        super.onMessageReceived(from, data);

        Log.v(TAG, "[onMessage] " + from + " " + data);
    }
}