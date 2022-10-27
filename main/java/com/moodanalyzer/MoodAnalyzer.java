package com.moodanalyzer;

public class MoodAnalyzer {
    String mood;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String mood) {
        this.mood = mood;
    }

    public String analyzeMood() throws MoodAnalysisException {
        try {
            if (mood.contains("Sad"))
                return "SAD";
            else if (mood.contains("")){
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY, "Input cannot be empty!!");
            }
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            if (this.mood == null)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL, "Input cannot be Null");
            else
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY, "Input cannot be Empty");
        }
    }
    public static void main(String[] args) {
        System.out.println("-----------------------Welcome to Mood Analysis Problem!-----------------------i");
    }

}
