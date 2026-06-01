package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {

        if (message == null || message.trim().isEmpty()) {
            return "HAPPY";
        }

        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        }

        return "HAPPY";
    }
}