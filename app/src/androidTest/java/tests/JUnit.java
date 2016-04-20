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

        assertEquals(6.5, mainActivity.Add(1.7, 3.8));
        //assertEquals(14, 7+7);
    }
    
    public void test_sub() {
        mainActivity = getActivity();
        
        assertEquals(3.0, mainActivity.Sub(6.0, 3.0));
    }

}
