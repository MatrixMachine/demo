package com.example.demo;

import com.example.demo.config.FilterConfigProperties;
import com.example.demo.enums.BizEnum;
import com.example.demo.model.ActivityModel;
import com.example.demo.model.ActivityRequest;
import com.example.demo.plugin.Cat;
import com.example.demo.plugin.CatContext;
import com.example.demo.service.IActivityModelHandler;
import com.example.demo.service.IActivityService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.plugin.core.PluginRegistry;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

	@Resource
	private IActivityService activityService;
	@Resource
	private FilterConfigProperties filterConfigProperties;

	@Resource
	private PluginRegistry<Cat, CatContext> pluginRegistry;

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

	@Test
	public void testCatPlugin(){
		CatContext catContext = new CatContext();
		catContext.setColor("orange");
//		catContext.setBirthplace("china");
//		List<Cat> pluginsFor = pluginRegistry.getPluginsFor(catContext);
		pluginRegistry.getPluginFor(catContext).ifPresent(Cat::shout);
//		pluginsFor.forEach(Cat::shout);
	}

}
