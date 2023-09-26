package com.example.demo.service.impl;

import com.example.demo.filter.Filter;
import com.example.demo.filter.FilterChainPipeline;
import com.example.demo.selector.FilterSelector;
import com.example.demo.model.ActivityContext;
import com.example.demo.model.ActivityModel;
import com.example.demo.model.ActivityRequest;
import com.example.demo.selector.ActivityFilterSelectorFactory;
import com.example.demo.service.IActivityModelHandler;
import com.example.demo.service.IActivityService;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author kermit.mo
 */
@Service
public class ActivityServiceImpl implements IActivityService {
    @Resource
    private FilterChainPipeline<ActivityContext, Filter<ActivityContext>> activityPipeline;

    @Resource
    private ActivityFilterSelectorFactory activityFilterSelectorFactory;

    @Resource
    private PluginRegistry<IActivityModelHandler, ActivityModel> pluginRegistry;



    @Override
    public void activity(ActivityRequest activityRequest) {
        FilterSelector filterSelector = activityFilterSelectorFactory.getFilterSelector(activityRequest);
        ActivityContext activityContext = new ActivityContext(activityRequest.getBizEnum(), filterSelector);
        activityContext.setActivityRequest(activityRequest);
        activityPipeline.getFilterChain().handle(activityContext);
        ActivityModel activityModel = activityContext.getActivityModel();
        pluginRegistry.getPluginsFor(activityModel)
                .forEach(handler -> handler.handleActivityModel(activityModel));
    }
}
