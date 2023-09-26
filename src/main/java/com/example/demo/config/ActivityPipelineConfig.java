package com.example.demo.config;

import com.example.demo.filter.*;
import com.example.demo.model.ActivityContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kermit.mo
 */
@Configuration
public class ActivityPipelineConfig {

    @Bean
    public FilterChainPipeline activityPipeline() {
        FilterChainPipeline filterChainPipeline = new FilterChainPipeline();
        filterChainPipeline.addFilter(userFilter())
                .addFilter(validPeriodFilter())
                .addFilter(placeInfoQueryFilter())
                .addFilter(userInfoQueryFilter())
                .addFilter(activityInfoQueryFilter());
        return filterChainPipeline;
    }

    @Bean
    public UserFilter userFilter() {
        return new UserFilter();
    }

    @Bean
    public ValidPeriodFilter validPeriodFilter() {
        return new ValidPeriodFilter();
    }

    @Bean
    public PlaceInfoQueryFilter placeInfoQueryFilter() {
        return new PlaceInfoQueryFilter();
    }

    @Bean
    public UserInfoQueryFilter userInfoQueryFilter() {
        return new UserInfoQueryFilter();
    }

    @Bean
    public ActivityInfoQueryFilter activityInfoQueryFilter() {
        return new ActivityInfoQueryFilter();
    }
}
