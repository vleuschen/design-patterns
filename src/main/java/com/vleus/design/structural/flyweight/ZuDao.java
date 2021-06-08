package com.vleus.design.structural.flyweight;

import lombok.AllArgsConstructor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author vleus
 * @date 2021年06月03日 23:37
 */
@AllArgsConstructor
public class ZuDao {

    private static Map<String,AbstractWaitressFlyweight> poolMap = new HashMap<>();
    //享元尺子中有很多对象
    static {
        BeautifulWaitress beautifulWaitress1 = new BeautifulWaitress("1111","张三",18);
        BeautifulWaitress beautifulWaitress2 = new BeautifulWaitress("2222","枫华恋",20);
        poolMap.put(beautifulWaitress1.id,beautifulWaitress1);
        poolMap.put(beautifulWaitress2.id,beautifulWaitress2);
    }

    public void addWaitress(AbstractWaitressFlyweight waitressFlyweight) {
        poolMap.put(UUID.randomUUID().toString(), waitressFlyweight);
    }

    public static AbstractWaitressFlyweight getWaitress(String name) {
        AbstractWaitressFlyweight flyweight = poolMap.get(name);
        if (flyweight == null) {
            for (AbstractWaitressFlyweight value : poolMap.values()) {
                //当前共享对象
                if (value.isCanService()) {
                    return value;
                }
            }

            return null;
        }

        return flyweight;
    }
}