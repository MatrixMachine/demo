package com.example.demo.service.impl;

import com.example.demo.model.ActivityModel;
import com.example.demo.service.IActivityModelHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author kermit.mo
 */
@Slf4j
@Service
public class DbSaveHandler implements IActivityModelHandler {

  @Override
  public void handleActivityModel(ActivityModel activityModel) {
    log.info("开始入库---------------:{}", activityModel);
  }

  @Override
  public boolean supports(ActivityModel model) {
    return true;
  }
}
