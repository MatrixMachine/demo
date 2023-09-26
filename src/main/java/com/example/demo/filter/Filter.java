package com.example.demo.filter;

/**
 * @author kermit.mo
 */
public interface Filter<T extends FilterContext> {
    void doFilter(T context, DefaultFilterChain<T> chain);
}