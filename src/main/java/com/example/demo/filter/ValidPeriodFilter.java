package com.example.demo.filter;

import com.example.demo.model.Activity;
import com.example.demo.model.ActivityContext;
import com.example.demo.model.ActivityModel;
import com.example.demo.model.ActivityRequest;

import java.util.Date;
import java.util.Optional;

/**
 * @author kermit.mo
 */
public class ValidPeriodFilter extends AbstractOrderFilter<ActivityContext> {
    @Override
    protected void handle(ActivityContext activityContext) {
        ActivityModel activityModel = activityContext.getActivityModel();
        Activity activity = activityModel.getActivity();

        // 查询活动，然后获得活动详情
        if (new Date().compareTo(activity.getEndTime())>0){
            throw new RuntimeException("活动超过有效期");
        }
    }
}
