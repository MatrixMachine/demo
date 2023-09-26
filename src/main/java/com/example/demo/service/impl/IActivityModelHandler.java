package com.example.demo.service.impl;

import com.example.demo.model.ActivityModel;
import org.springframework.plugin.core.Plugin;

/**
 * @author kermit.mo
 */
public interface IActivityModelHandler extends Plugin<ActivityModel> {

  void handleActivityModel(ActivityModel activityModel);

}
