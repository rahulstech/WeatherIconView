package com.github.pwittchen.weathericonview.app;

import android.app.Activity;
import android.os.Bundle;

/**
 * This is an exemplary Activity presenting how WeatherIconView works
 * WeatherIconView can be configured in layout. See: res/layout/activity_my.xml file
 * It can be also configured programmatically. See commented code below.
 */
public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
//        weatherIconView.setIconResource(getString(R.string.wi_day_sunny_overcast));
//        weatherIconView.setIconSize(100);
//        weatherIconView.setIconColor(Color.BLACK);
    }
}
