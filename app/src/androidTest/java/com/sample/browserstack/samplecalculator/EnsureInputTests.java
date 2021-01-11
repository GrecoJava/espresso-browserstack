package com.sample.browserstack.samplecalculator;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SmallTest;

import com.squareup.spoon.Spoon;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Espresso tests to ensure that editText box is updated appropriately
 * whenever buttons are clicked
 */

@SmallTest
@RunWith(AndroidJUnit4.class)
public class EnsureInputTests {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void ensureSingleInputIsHandled() {
//        try (ActivityScenario<MainActivity> scenario =  ActivityScenario.launch(MainActivity.class)) {
//            scenario.onActivity(mainActivity -> {
//                Spoon.screenshot(mainActivity, "initial_state");
                onView(withId(R.id.buttonOne)).perform(click());
                onView(withId(R.id.editText)).check(matches(withText("1")));
//                Spoon.screenshot(mainActivity, "post_multiple_btn_click");
//            });
//        }
    }

    @Test
    public void ensureMultipleInputIsHandled() {
//        try (ActivityScenario<MainActivity> scenario =  ActivityScenario.launch(MainActivity.class)) {
//            scenario.onActivity(mainActivity -> {
//                Spoon.screenshot(mainActivity, "initial_state");
                onView(withId(R.id.buttonOne)).perform(click());
                onView(withId(R.id.buttonTwo)).perform(click());
                onView(withId(R.id.editText)).check(matches(withText("12")));
//                Spoon.screenshot(mainActivity, "post_multiple_btn_click");
//            });
//        }
    }
}
