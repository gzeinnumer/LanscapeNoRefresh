package com.gzeinnumer.lanscapenorefresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add to manifest
        //android:configChanges="orientation|screenSize"
        //with this code, the aplication wont refresh or restart activity life cycle
    }
}
