package com.example.demo.filter;

/**
 * @author kermit.mo
 */
public abstract class AbstractOrderFilter<T extends FilterContext> implements Filter<T> {

    @Override
    public void doFilter(T context, DefaultFilterChain<T> chain) {
        if (context.getFilterSelector().matchFilter(this.getClass().getSimpleName())) {
            this.handle(context);
        }

        if (context.continueChain()) {
            chain.fireNext(context);
        }
    }

    protected abstract void handle(T t);
}
