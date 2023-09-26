package com.example.demo.filter;

import com.example.demo.enums.BizEnum;
import com.example.demo.selector.FilterSelector;

/**
 * @author kermit.mo
 */
public abstract class AbstractFilterContext implements FilterContext{
    private BizEnum bizEnum;
    private final FilterSelector selector;

    public AbstractFilterContext(BizEnum bizEnum, FilterSelector selector) {
        this.bizEnum = bizEnum;
        this.selector = selector;
    }

    @Override
    public BizEnum getBizCode() {
        return bizEnum;
    }

    @Override
    public FilterSelector getFilterSelector() {
        return selector;
    }
}
