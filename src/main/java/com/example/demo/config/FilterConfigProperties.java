package com.example.demo.config;

import com.example.demo.enums.BizEnum;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author kermit.mo
 */
@ConfigurationProperties(prefix = "configs")
@Component
public class FilterConfigProperties {

  private Map<BizEnum, List<String>> filterConfigs;

  public FilterConfigProperties() {
  }

  public FilterConfigProperties(Map<BizEnum, List<String>> filterConfigs) {
    this.filterConfigs = filterConfigs;
  }

  public Map<BizEnum, List<String>> getFilterConfigs() {
    return filterConfigs;
  }

  public void setFilterConfigs(Map<BizEnum, List<String>> filterConfigs) {
    this.filterConfigs = filterConfigs;
  }
}
