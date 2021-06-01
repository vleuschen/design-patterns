package com.vleus.design.structural.adapter;

/**
 * @author vleus
 * @date 2021年06月01日 22:52
 */
public class Zh_JPTranslator implements Translator{
    @Override
    public String translate(String contents) {
        if ("你好".equals(contents)) {
            return "空你几哇";
        }

        if ("不要啊".equals(contents)) {
            return "雅蠛蝶";
        }

        return "******";
    }
}