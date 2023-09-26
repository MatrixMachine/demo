package com.example.demo.selector;

import com.example.demo.config.FilterConfigProperties;
import com.example.demo.enums.BizEnum;
import com.example.demo.model.ActivityRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.example.demo.enums.BizEnum.ACTIVITY;

/**
 * @author kermit.mo
 */
@Service
public class EnvBasedFilterSelectorFactory implements ActivityFilterSelectorFactory {


  @Resource
  private FilterConfigProperties filterConfigProperties;


  @Override
  public FilterSelector getFilterSelector(ActivityRequest request) {
    BizEnum bizEnum = request.getBizEnum();
    switch (bizEnum){
      case ACTIVITY:
        List<String> filterNames = filterConfigProperties.getFilterConfigs()
                .getOrDefault(ACTIVITY, Collections.unmodifiableList(new ArrayList<>()));
        return new FakeFilterSelector(filterNames);
      default:
        break;
    }
    return null;
  }
}
