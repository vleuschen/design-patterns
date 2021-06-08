package com.vleus.design.behavioral.chain.ext;

import lombok.Data;

/**
 * @author vleus
 * @date 2021年06月08日 22:22
 */
@Data
public class Request {

    String msg; //请求内容

    public Request(String msg) {
        this.msg = msg;
    }
}