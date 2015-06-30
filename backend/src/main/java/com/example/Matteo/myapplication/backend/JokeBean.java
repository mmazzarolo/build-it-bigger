package com.example.Matteo.myapplication.backend;

import com.example.JokeTelling;

/**
 * The object model for the data we are sending through endpoints
 */
public class JokeBean {

    private JokeTelling jokeTelling;

    public JokeBean() {
        jokeTelling = new JokeTelling();
    }

    public String getJoke() {
        return jokeTelling.getRandomJoke();
    }
}