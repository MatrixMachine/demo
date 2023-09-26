package com.example.demo.filter;

import com.example.demo.model.Activity;
import com.example.demo.model.ActivityContext;
import com.example.demo.model.ActivityModel;
import com.example.demo.model.ActivityRequest;

import java.time.Instant;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author kermit.mo
 */
public class ActivityInfoQueryFilter extends AbstractOrderFilter<ActivityContext> {
    @Override
    protected void handle(ActivityContext activityContext) {
        ActivityRequest activityRequest = activityContext.getActivityRequest();
        Integer activityId = activityRequest.getActivityId();
        Date now = new Date();
        long time = now.getTime();
        long duration = TimeUnit.DAYS.toMillis(1);

        Activity activity = new Activity();
        activity.setActivityId(activityId);
        activity.setActivityName("老用户与🐕不得参与");
        activity.setStartTime(now);
        activity.setEndTime(new Date(time + duration));

        ActivityModel activityModel = Optional.ofNullable(activityContext.getActivityModel()).orElseGet(ActivityModel::new);
        activityModel.setActivity(activity);
        activityContext.setActivityModel(activityModel);
    }
}
