package com.vleus.design.creation.prototype;

/**
 * @author vleus
 * @date 2021年05月30日 21:51
 * @desc
 * 1、GuiguMybatis：操作数据库，从数据库中查出很多条记录；
 * 2、每次查找数据库，查到以后就把所有数据都封装成一个对象，返回；
 *  10000 thread：查一个记录(new User("zhangsan",18)),每次创建一个对象封装并返回
 *  系统里边就会有10000个User，浪费内存；
 * 3、解决：缓存：查过的保存
 *       如果在查询相同的记录，拿到原来的原型对象
 * 4、此时直接拿到缓存中的对象；
 */
public class MainTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        GuiguMybatis guiguMybatis = new GuiguMybatis();

        User zhangsan1 = guiguMybatis.getUser("张三");
        System.out.println("1==>" + zhangsan1);

        zhangsan1.setUsername("李四2");
        System.out.println("zhangsan1自己改了: " + zhangsan1);

        User zhangsan2 = guiguMybatis.getUser("张三");
        System.out.println("2==>" + zhangsan2);

        User zhangsan3 = guiguMybatis.getUser("张三");
        System.out.println("3==>" + zhangsan3);

        User zhangsan4 = guiguMybatis.getUser("张三");
        System.out.println("4==>" + zhangsan4);

        User zhangsan5 = guiguMybatis.getUser("张三");
        System.out.println("5==>" + zhangsan5);

        System.out.println(zhangsan1 == zhangsan2);
    }
}