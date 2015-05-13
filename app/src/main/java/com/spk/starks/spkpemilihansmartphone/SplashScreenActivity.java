package com.spk.starks.spkpemilihansmartphone;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/**
 * Created by starks on 31/03/15.
 */
public class SplashScreenActivity extends Activity {

    protected boolean aktif =true;
    protected int splash_=5000;
    public void onCreate( Bundle savedIstanceState){
       super.onCreate(savedIstanceState);
        setContentView(R.layout.activity_splash);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Thread splashThread= new Thread(){
            public void run(){
                try {
                    int delay_= 0;
                    while (aktif && (delay_ < splash_)){
                        sleep(100);
                        if (aktif){
                            delay_+=100;

                        }
                    }
                }catch (InterruptedException e){

                }finally {
                    finish();
                    Intent imbo_class = new Intent(SplashScreenActivity.this,MainActivity.class);
                    startActivityForResult(imbo_class, 0);


                }
            }
        };
        splashThread.start();
    }

    public  void onBackPressed(){
        finish();
        System.exit(0);

    }
}
