package com.vleus.design.behavioral.chain.ext;

public interface Filter {

    void doFilter(Request request,Response response,FilterChain filterChain);
}
