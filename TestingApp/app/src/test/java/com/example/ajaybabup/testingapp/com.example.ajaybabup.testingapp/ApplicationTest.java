package com.example.ajaybabup.testingapp;

import android.app.Application;
import android.test.ApplicationTestCase;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;
import android.widget.Toast;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityUnitTestCase<MainActivity> {

    MainActivity mainActivity;
    TextView tvHello;

    public ApplicationTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        startActivity(new Intent(getInstrumentation().getTargetContext(), MainActivity.class), null, null);

        // Getting a reference to the MainActivity of the target application
        mainActivity = (MainActivity)getActivity();

        // Getting a reference to the TextView of the MainActivity of the target application
//        tvHello=(TextView)mainActivity.findViewById(R.id.txt_hello);

        mainActivity.findViewById(R.id.txt_hello);

    }

    @SmallTest
    public void testHello()
    {
        String actual=tvHello.getText().toString();
        String expected="Hello World";

//        assertEquals(actual,expected);
        assertTrue(false);

    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}