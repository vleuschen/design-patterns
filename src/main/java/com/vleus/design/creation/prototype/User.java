package com.vleus.design.creation.prototype;

/**
 * @author vleus
 * @date 2021年05月30日 21:57
 */
public class User implements Cloneable {

    private String username;

    private Integer age;

    public User() {
        System.out.println("User对象创建");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("username='").append(username).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    /**
     * 再创建一个人，赋予所有属性
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setUsername(this.username);
        user.setAge(this.age);
        return user;
    }
}