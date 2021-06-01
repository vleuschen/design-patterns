package com.vleus.design.creation.factory.builder;

/**
 * @author vleus
 * @date 2021年05月31日 23:53
 */
public class Phone {

    protected String cpu;

    protected String mem;

    protected String disk;

    protected String cam;

    public String getCpu() {
        return cpu;
    }

    public String getMem() {
        return mem;
    }

    public String getDisk() {
        return disk;
    }

    public String getCam() {
        return cam;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Phone{");
        sb.append("cpu='").append(cpu).append('\'');
        sb.append(", mem='").append(mem).append('\'');
        sb.append(", disk='").append(disk).append('\'');
        sb.append(", cam='").append(cam).append('\'');
        sb.append('}');
        return sb.toString();
    }
}