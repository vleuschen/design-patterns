package com.vleus.design.creation.factory.builder;

/**
 * @author vleus
 * @date 2021年05月31日 23:57
 */
public abstract class AbstractBuilder {

    Phone phone;

    abstract AbstractBuilder customCpu(String cpuName);

    abstract AbstractBuilder customMem(String mem);

    abstract AbstractBuilder customDisk(String disk);

    abstract AbstractBuilder customCam(String cam);

    Phone getProduct() {
        return phone;
    }
}