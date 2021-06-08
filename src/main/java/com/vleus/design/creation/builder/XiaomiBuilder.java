package com.vleus.design.creation.builder;

/**
 * @author vleus
 * @date 2021年05月31日 23:58
 */
public class XiaomiBuilder extends AbstractBuilder{

    public XiaomiBuilder() {
        phone = new Phone();
    }

    @Override
    AbstractBuilder customCpu(String cpuName) {
        phone.cpu = cpuName;
        return this;
    }

    @Override
    AbstractBuilder customMem(String mem) {
        phone.mem = mem;
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.disk = disk;
        return this;
    }

    @Override
    AbstractBuilder customCam(String cam) {
        phone.cam = cam;
        return this;
    }
}