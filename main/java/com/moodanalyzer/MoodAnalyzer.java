package com.moodanalyzer;

public class MoodAnalyzer {
    String mood;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String mood) {
        this.mood = mood;
    }

    public String analyzeMood(){
        try {
            if (mood.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch(NullPointerException e){
            return "HAPPY";
        }

        }

    public static void main(String[] args) {
        System.out.println("-----------------------Welcome to Mood Analysis Problem!-----------------------i");
    }

}
