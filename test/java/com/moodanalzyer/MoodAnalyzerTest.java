package com.moodanalzyer;

import com.moodanalyzer.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void testMoodAnalysis1() throws Exception{
        MoodAnalyzer mood = new MoodAnalyzer();
        String s =  mood.analyzer("I am in Sad mood");
        Assertions.assertEquals(s, "SAD");
    }
    @Test
    void testMoodAnalysis2() throws Exception{
        MoodAnalyzer mood = new MoodAnalyzer();
        String s =  mood.analyzer("I am in ANY mood");
        Assertions.assertEquals(s, "HAPPY");
    }
}
