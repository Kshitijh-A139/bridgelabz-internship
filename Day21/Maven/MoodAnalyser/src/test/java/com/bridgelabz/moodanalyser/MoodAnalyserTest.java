package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	@Test
    void givenSadMessage_ShouldReturnSad() throws MoodAnalyserException {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser("I am in Sad Mood");

        String mood = moodAnalyser.analyseMood();

        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenHappyMessage_ShouldReturnHappy() throws MoodAnalyserException {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser("I am in Happy Mood");

        String mood = moodAnalyser.analyseMood();

        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenNullMood_ShouldReturnHappy() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser(null);

        try {

            String mood = moodAnalyser.analyseMood();

            Assertions.assertEquals("HAPPY", mood);

        } catch (MoodAnalyserException e) {

            Assertions.assertEquals(
                    MoodAnalyserException.ExceptionType.NULL_MOOD,
                    e.type);
        }
    }

    @Test
    void givenNullMood_ShouldThrowMoodAnalysisException() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser(null);

        try {

            moodAnalyser.analyseMood();

        } catch (MoodAnalyserException e) {

            Assertions.assertEquals(
                    MoodAnalyserException.ExceptionType.NULL_MOOD,
                    e.type);

            Assertions.assertEquals(
                    "Mood should not be Null",
                    e.getMessage());
        }
    }

    @Test
    void givenEmptyMood_ShouldThrowMoodAnalysisException() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser("");

        try {

            moodAnalyser.analyseMood();

        } catch (MoodAnalyserException e) {

            Assertions.assertEquals(
                    MoodAnalyserException.ExceptionType.EMPTY_MOOD,
                    e.type);

            Assertions.assertEquals(
                    "Mood should not be Empty",
                    e.getMessage());
        }
    }
}
