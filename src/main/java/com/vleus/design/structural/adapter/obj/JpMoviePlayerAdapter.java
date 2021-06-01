package com.vleus.design.structural.adapter.obj;

import com.vleus.design.structural.adapter.Player;
import com.vleus.design.structural.adapter.Translator;
import com.vleus.design.structural.adapter.Zh_JPTranslator;

/**
 * @author vleus
 * @date 2021年06月01日 22:50
 * @desc 通过继承的方式适配转换翻译器的功能上
 */
public class JpMoviePlayerAdapter implements Player {

    private Player target;

    //组合的方式实现适配器想过
    private Translator translator = new Zh_JPTranslator();

    public JpMoviePlayerAdapter(Player target) {
        this.target = target;
    }

    @Override
    public String play() {

        String play = target.play();

        //转换字幕
        String translate = translator.translate(play);
        System.out.println("日文:"  + translate);

        return play;
    }
}