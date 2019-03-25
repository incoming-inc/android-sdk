package co.sourse.example;

import android.app.Application;
import android.preference.PreferenceManager;
import android.util.Log;

import com.incoming.au.foundation.tool.LogIncoming;
import com.incoming.pvnsdk.PushVideo;

 import co.sourse.example.R;

 /**
 * Simple Android Application class that launches the Incoming Push Video SDK. The Push Video SDK configuration
 * may also be invoked from the launch Activity.
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
