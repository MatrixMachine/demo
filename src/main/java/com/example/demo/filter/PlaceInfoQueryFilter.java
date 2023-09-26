package com.example.demo.filter;

import com.example.demo.model.*;

import java.util.Date;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author kermit.mo
 */
public class PlaceInfoQueryFilter extends AbstractOrderFilter<ActivityContext> {
    @Override
    protected void handle(ActivityContext activityContext) {
        ActivityRequest activityRequest = activityContext.getActivityRequest();
        Integer placeId = activityRequest.getOptPlaceId();
        Place place = new Place();
        place.setOptPlaceId(placeId);
        place.setOptPlaceName("场所名字不重要");
        ActivityModel activityModel = Optional.ofNullable(activityContext.getActivityModel()).orElseGet(ActivityModel::new);
        activityModel.setPlace(place);
        activityContext.setActivityModel(activityModel);
    }
}
