package com.moodanalyzer;

public class MoodAnalysisException  extends Exception{
    String message;
    static ExceptionType type;
    enum ExceptionType{
        NULL, EMPTY;
    }
    public MoodAnalysisException(ExceptionType type , String message){
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
