package com.vleus.design.structural.adapter.clazz;

import com.vleus.design.structural.adapter.Player;
import com.vleus.design.structural.adapter.Zh_JPTranslator;

/**
 * @author vleus
 * @date 2021年06月01日 22:50
 * @desc 通过继承的方式适配转换翻译器的功能上
 */
public class JpMoviePlayerAdapter extends Zh_JPTranslator implements Player {

    private Player target;

    public JpMoviePlayerAdapter(Player target) {
        this.target = target;
    }

    @Override
    public String play() {

        String play = target.play();

        //转换字幕
        String translate = translate(play);
        System.out.println("日文:"  + translate);

        return play;
    }
}