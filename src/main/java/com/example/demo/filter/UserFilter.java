package com.example.demo.filter;

import com.example.demo.model.ActivityContext;
import com.example.demo.model.ActivityRequest;

/**
 * @author kermit.mo
 */
public class UserFilter extends AbstractOrderFilter<ActivityContext> {
    @Override
    protected void handle(ActivityContext activityContext) {
        ActivityRequest activityRequest = activityContext.getActivityRequest();
        Integer userId = activityRequest.getUserId();
        if (userId > 100){
            throw new RuntimeException("您没有参与资格,仅限前100位参与");
        }
    }
}
