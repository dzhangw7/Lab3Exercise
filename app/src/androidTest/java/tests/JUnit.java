package tests;

import android.support.annotation.MainThread;
import android.test.ActivityInstrumentationTestCase2;

import com.londonappdeveloper.lab3.MainActivity;

/**
 * Created by Daniel on 4/20/2016.
 */
public class JUnit extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit() {
        super(MainActivity.class);
    }

    public void test_add() {
        mainActivity = getActivity();
        assertEquals(4, 2+2);
    }

}
