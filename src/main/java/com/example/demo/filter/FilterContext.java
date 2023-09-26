package com.example.demo.filter;

import com.example.demo.enums.BizEnum;
import com.example.demo.selector.FilterSelector;

/**
 * @author kermit.mo
 */
public interface FilterContext {

    BizEnum getBizCode();
    FilterSelector getFilterSelector();

    boolean continueChain();
}
