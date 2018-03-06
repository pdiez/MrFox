package com.example.app.mrfox;

import android.content.Intent;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 2912 on 06/03/2018.
 */

public class MySplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Thread timer= new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(3000);
                }
                catch (InterruptedException e)
                {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                finally
                {
                    startActivity(new Intent(MySplash.this, MyLogin.class));
                    finish();
                }
            }
        };

        getWindow().getDecorView().setBackground(getResources().getDrawable(R.drawable.avd_anim));
        ((AnimatedVectorDrawable) getWindow().getDecorView().getBackground()).start();
        timer.start();

    }

    @Override
    public void onStart() {
        super.onStart();

    }

}
