package com.vleus.design.behavioral.chain.ext;

import lombok.Data;

/**
 * @author vleus
 * @date 2021年06月08日 22:22
 */
@Data
public class Response {

    String content;

    public Response(String content) {
        this.content = content;
    }
}