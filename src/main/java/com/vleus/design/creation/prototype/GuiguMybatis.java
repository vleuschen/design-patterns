package com.vleus.design.creation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vleus
 * @date 2021年05月30日 21:56
 */
public class GuiguMybatis {


    private Map<String, User> userCached = new HashMap<>();

    /**
     * 从数据库中查找数据
     * @return
     */
    public User getUser(String username) throws CloneNotSupportedException {

        //从数据库中查找数据
        User user = null;
        if (!userCached.containsKey(username)) {
            //缓存中没有，查询数据库
            user = getUserFromDb(username);
        }else{
            //从缓存中直接拿，脏缓存问题
            //原型对象已拿到，但是不能直接给
            user = userCached.get(username);

            //从这个对象中快速得到一个克隆体
            user = (User) user.clone();
        }
        return user;
    }

    private User getUserFromDb(String username) throws CloneNotSupportedException {
        System.out.println("从数据库查询数据库" + username);
        User user = new User();
        user.setUsername(username);
        user.setAge(18);

        userCached.put(username, (User)user.clone());
        return user;
    }


}