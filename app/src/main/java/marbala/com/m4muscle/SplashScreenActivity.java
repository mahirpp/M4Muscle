package marbala.com.m4muscle;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


public class SplashScreenActivity extends Activity {

    TextView TV_Header,TV_SubText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        TV_Header =(TextView) findViewById(R.id.TV_Header);
        TV_SubText =(TextView) findViewById(R.id.TV_SubText);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Roboto-BoldCondensed.ttf");
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
        TV_Header.setTypeface(tf);
        TV_SubText.setTypeface(tf1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
            }
        },4000);

    }
}
