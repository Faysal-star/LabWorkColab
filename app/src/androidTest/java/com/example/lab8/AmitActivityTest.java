package com.example.lab8;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class AmitActivityTest {
    @Rule
    public ActivityScenarioRule<AmitActivity> activityScenarioRule =
            new ActivityScenarioRule<>(AmitActivity.class);

    @Test
    public void testButton1() {
        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Hello Amit")));
    }

    @Test
    public void testButton2() {
        Espresso.onView(ViewMatchers.withId(R.id.button2)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("")));
    }

}
