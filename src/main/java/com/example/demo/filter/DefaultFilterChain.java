package com.example.demo.filter;

import java.util.Objects;

/**
 * @author kermit.mo
 */
public final class DefaultFilterChain<T extends FilterContext> implements FilterChain<T> {
    private final FilterChain<T> next;
    private final Filter<T> filter;

    public DefaultFilterChain(FilterChain<T> chain, Filter<T> filter) {
        this.next = chain;
        this.filter = filter;
    }

    public void handle(T context) {
        this.filter.doFilter(context, this);
    }

    public void fireNext(T ctx) {
        FilterChain<T> nextChain = this.next;
        if (Objects.nonNull(nextChain)) {
            nextChain.handle(ctx);
        }

    }

}