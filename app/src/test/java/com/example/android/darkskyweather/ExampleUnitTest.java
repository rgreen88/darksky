package com.example.android.darkskyweather;

import com.example.android.darkskyweather.model.DailyDatum;
import com.example.android.darkskyweather.view.activities.main.MainAdapter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

//    DailyDatum dailyDatum = new DailyDatum();
    private List<DailyDatum> dailyDatums = new ArrayList<>();
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testForFailure() {
        MainAdapter tester = new MainAdapter(dailyDatums); // MyClass is tested

        // assert statements
        assertEquals(0, tester.getItemCount());

        //test for not receiving data from call

    }

}