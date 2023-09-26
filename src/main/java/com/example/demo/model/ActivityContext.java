package com.example.demo.model;

import com.example.demo.enums.BizEnum;
import com.example.demo.filter.AbstractFilterContext;
import com.example.demo.selector.FilterSelector;
import lombok.Getter;
import lombok.Setter;

/**
 * @author kermit.mo
 */

public class ActivityContext extends AbstractFilterContext {

    @Setter
    @Getter
    private ActivityRequest activityRequest;

    @Setter
    @Getter
    private ActivityModel activityModel;

    public ActivityContext(BizEnum bizEnum, FilterSelector selector) {
        super(bizEnum, selector);
    }

    @Override
    public boolean continueChain() {
        return true;
    }

}
