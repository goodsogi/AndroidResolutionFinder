package com.example.owner.androidresolutionfinder;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int deviceWidth = displayMetrics.widthPixels;

        int deviceHeight = displayMetrics.heightPixels;

// 꼭 넣어 주어야 한다. 이렇게 해야 displayMetrics가 세팅이 된다.

        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int dipWidth  = (int) (120  * displayMetrics.density);

        int dipHeight = (int) (90 * displayMetrics.density);

        System.out.println("displayMetrics.density : " + displayMetrics.densityDpi);

        System.out.println("deviceWidth : " + deviceWidth +", deviceHeight : "+deviceHeight);
        System.out.println("dipWidth : " + dipWidth +", dipHeight : "+dipHeight);
    }
}
