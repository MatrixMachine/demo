package com.example.demo;

import com.example.demo.config.FilterConfigProperties;
import com.example.demo.enums.BizEnum;
import com.example.demo.model.ActivityRequest;
import com.example.demo.service.impl.IActivityService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

	@Resource
	private IActivityService activityService;
	@Resource
	private FilterConfigProperties filterConfigProperties;

	@Test
	void contextLoads() {
		Map<BizEnum, List<String>> configs = filterConfigProperties.getFilterConfigs();
		ActivityRequest activityRequest = new ActivityRequest();
		activityRequest.setBizEnum(BizEnum.ACTIVITY);
		activityRequest.setUserId(99);
		activityRequest.setActivityId(8964);
		activityRequest.setOptPlaceId(010);
		activityService.activity(activityRequest);
	}

}
