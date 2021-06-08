package com.vleus.design.behavioral.chain.ext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vleus
 * @date 2021年06月08日 22:22
 * 靠这个维护链条
 */
public class FilterChain {

    //filter的链
    List<Filter> filtersChain = new ArrayList<>();

    void addFilter(Filter filter) {
        filtersChain.add(filter);
    }
}