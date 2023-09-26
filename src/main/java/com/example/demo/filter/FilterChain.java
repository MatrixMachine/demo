package com.example.demo.filter;

/**
 * @author kermit.mo
 */
public interface FilterChain<T extends FilterContext> {
    void handle(T var1);

    void fireNext(T var1);
}
