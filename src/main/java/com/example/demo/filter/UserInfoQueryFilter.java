package com.example.demo.filter;

import com.example.demo.model.*;

import java.util.Date;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author kermit.mo
 */
public class UserInfoQueryFilter extends AbstractOrderFilter<ActivityContext> {
    @Override
    protected void handle(ActivityContext activityContext) {
        ActivityRequest activityRequest = activityContext.getActivityRequest();
        Integer userId = activityRequest.getUserId();
        User user = new User();
        Date date = new Date();
        long time = date.getTime();
        long duration = TimeUnit.DAYS.toMillis(1);

        user.setUserId(userId);
        user.setRegisterTime(new Date(time - duration));

        ActivityModel activityModel = Optional.ofNullable(activityContext.getActivityModel()).orElseGet(ActivityModel::new);
        activityModel.setUser(user);
        activityContext.setActivityModel(activityModel);
    }
}
