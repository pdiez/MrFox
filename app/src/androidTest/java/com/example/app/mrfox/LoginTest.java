package com.example.app.mrfox;

import android.support.v4.widget.SwipeRefreshLayout;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by 2912 on 06/03/2018.
 */

public class LoginTest extends ActivityInstrumentationTestCase2<MyMain> {
    public LoginTest(String pkg, Class<MyMain> activityClass) {
        super(pkg, activityClass);
    }

    public void testActivityExists() {
        MyMain activity = getActivity();
        assertNotNull(activity);
    }

    public void testSwipe() {
/*
        MyMain activity = getActivity();

        SwipeRefreshLayout swipe_container = (SwipeRefreshLayout)

        TouchUtils.dragViewBy(this,  swipe_container,
                Gravity.TOP | Gravity.CENTER_HORIZONTAL,
                0,
                Math.round(mSwipeRefreshLayout.getHeight() * 0.4f));

        // Then the SwipeRefreshLayout should be refreshing
        // We need to use runOnMainSync here as fake dragging uses waitForIdleSync()
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                assertTrue(mSwipeRefreshLayout.isRefreshing());
            }
        });*/
    }
}
