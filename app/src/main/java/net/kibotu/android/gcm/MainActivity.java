package net.kibotu.android.gcm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import co.mobiwise.fastgcm.GCMListener;
import co.mobiwise.fastgcm.GCMManager;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView token = (TextView) findViewById(R.id.token);
        final TextView label = (TextView) findViewById(R.id.label);

        GCMManager.getInstance(this).registerListener(new GCMListener() {
            @Override
            public void onDeviceRegisted(final String s) {
                Log.v(TAG, "[onDeviceRegisted] " + s);

                token.post(new Runnable() {
                    @Override
                    public void run() {
                        token.setText("Token: " + s);
                    }
                });
            }

            @Override
            public void onMessage(final String s, final Bundle bundle) {
                Log.v(TAG, "[onMessage] " + s + " " + bundle);

                label.post(new Runnable() {
                    @Override
                    public void run() {
                        label.setText("MessageId: " + s + " Content: " + bundle);
                    }
                });
            }

            @Override
            public void onPlayServiceError() {
                Log.v(TAG, "[onPlayServiceError]");
            }
        });

    }

    @Override
    protected void onDestroy() {
        GCMManager.getInstance(this).unRegisterListener();
        super.onDestroy();
    }
}
