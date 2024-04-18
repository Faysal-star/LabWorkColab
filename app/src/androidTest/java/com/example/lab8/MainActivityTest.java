package com.example.lab8;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void beginning(){
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Button clicked 0 times")));
    }

    @Test
    public void testButtonClick_1() {
        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Button clicked 1 times")));
    }

    @Test
    public void testButtonClick_2() {
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click())
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Button clicked 2 times")));
    }

    @Test
    public void testButton2Click() {
        Espresso.onView(ViewMatchers.withId(R.id.button2)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Button clicked -1 times")));
    }

}
