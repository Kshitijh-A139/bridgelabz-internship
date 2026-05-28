package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message == null) {
                throw new MoodAnalyserException(
                        MoodAnalyserException.ExceptionType.NULL_MOOD,
                        "Mood should not be Null");
            }

            if (message.length() == 0) {
                throw new MoodAnalyserException(
                        MoodAnalyserException.ExceptionType.EMPTY_MOOD,
                        "Mood should not be Empty");
            }

            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            }

            return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(
                    MoodAnalyserException.ExceptionType.NULL_MOOD,
                    "Mood should not be Null");
        }
    }
}