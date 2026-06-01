package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    void givenSadMessage_ShouldReturnSad() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser("I am in Sad Mood");

        String mood = moodAnalyser.analyseMood();

        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenHappyMessage_ShouldReturnHappy() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser("I am in Happy Mood");

        String mood = moodAnalyser.analyseMood();

        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenNullMood_ShouldReturnHappy() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser(null);

        String mood = moodAnalyser.analyseMood();

        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenEmptyMood_ShouldReturnHappy() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser("");

        String mood = moodAnalyser.analyseMood();

        Assertions.assertEquals("HAPPY", mood);
    }
}