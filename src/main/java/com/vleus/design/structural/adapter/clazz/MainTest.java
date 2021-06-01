package com.vleus.design.structural.adapter.clazz;

import com.vleus.design.structural.adapter.MoviePlayer;

/**
 * @author vleus
 * @date 2021年06月01日 22:50
 */
public class MainTest {

    public static void main(String[] args) {

        MoviePlayer moviePlayer = new MoviePlayer();

//        JpMoviePlayerAdapter adapter = new JpMoviePlayerAdapter(moviePlayer);
//
//        adapter.play();
    moviePlayer.play();

    }
}