package com.example.licio.restaurants;

import android.content.Intent;
import android.widget.TextView;

import com.example.licio.restaurants.ui.MainActivity;
import com.example.licio.restaurants.ui.RestaurantsListActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Shadows;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();

    }

    @Test
    public void validateTextViewContent() {
        TextView appNameTextView = activity.findViewById(R.id.appNameTextView);
        assertEquals(true, "My Restaurants".equals(appNameTextView.getText().toString()));
    }

    @Test
    public void activityNotNull() {
        assertNotNull(activity);
    }

//    @Test
//    public void findRestaurantsActivity() {
//        activity.findViewById(R.id.findRestaurantsButton).performClick();
//        Intent expectedIntent = new Intent(activity, RestaurantsListActivity.class);
//        ShadowActivity shadowActivity = Shadows.shadowOf(activity);
//        Intent actualIntent = shadowActivity.getNextStartedActivity();
//        assertTrue(actualIntent.filterEquals(expectedIntent));
//    }
}