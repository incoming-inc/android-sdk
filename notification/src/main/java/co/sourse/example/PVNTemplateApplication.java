package co.sourse.example;

import android.app.Application;
import android.util.Log;

import com.incoming.au.foundation.tool.LogIncoming;

import co.sourse.pvnsdk.PushVideo;

/**
 * Simple Android Application class that launches the Sourse Analytics SDK.
 */
public class PVNTemplateApplication extends Application {

  private static final String TAG = PVNTemplateApplication.class.getSimpleName();

  @Override
  public void onCreate() {
    super.onCreate();
    Log.i(TAG, "Launching the Sourse Analytics SDK");

    String endPoint = getString(R.string.incoming_pvn_endpoint);
    String projectKey = getString(R.string.incoming_pvn_project_key);

    // Turn on logging (optional)
    LogIncoming.setDevBuild(true);

    PushVideo.initialize(getApplicationContext(), endPoint, projectKey);


    Log.i(TAG, "Launched the Sourse Analytics SDK");
  }
}
