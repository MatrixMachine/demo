package com.example.demo.filter;
/**
 * @author kermit.mo
 */
public final class FilterChainPipeline<T extends FilterContext, F extends Filter<T>> {
    private DefaultFilterChain<T> last;

    public FilterChainPipeline() {
    }

    public DefaultFilterChain<T> getFilterChain() {
        return this.last;
    }

    public FilterChainPipeline<T, F> addFilter(F filter) {
        this.last = new DefaultFilterChain<>(this.last, filter);
        return this;
    }

    public FilterChainPipeline<T, F> addFilter(String desc, F filter) {
        this.last = new DefaultFilterChain<>(this.last, filter);
        return this;
    }
}
