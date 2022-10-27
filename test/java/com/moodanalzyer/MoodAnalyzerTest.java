package com.moodanalzyer;

import com.moodanalyzer.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void testMoodAnalysis1() throws Exception{
        MoodAnalyzer mood = new MoodAnalyzer("I am in Sad mood");
        String s =  mood.analyzeMood();
        Assertions.assertEquals(s, "SAD");
    }
    @Test
    void testMoodAnalysis2() throws Exception{
        MoodAnalyzer mood = new MoodAnalyzer("I am in ANY mood");
        String s =  mood.analyzeMood();
        Assertions.assertEquals(s, "HAPPY");
    }
}
