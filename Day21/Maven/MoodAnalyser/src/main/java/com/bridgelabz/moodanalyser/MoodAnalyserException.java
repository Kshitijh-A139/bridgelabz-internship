package com.bridgelabz.moodanalyser;

public class MoodAnalyserException extends Exception {
    enum ExceptionType {
        NULL_MOOD,
        EMPTY_MOOD
    }

    ExceptionType type;

    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}