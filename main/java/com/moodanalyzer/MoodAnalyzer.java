package com.moodanalyzer;

public class MoodAnalyzer {

    public String analyzer(String message){
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }void main(String[] args) {
        System.out.println("-----------------------Welcome to Mood Analysis Problem!-----------------------i");
    }

}
