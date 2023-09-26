package com.example.demo.selector;

import com.example.demo.model.ActivityRequest;

public interface ActivityFilterSelectorFactory {

  FilterSelector getFilterSelector(ActivityRequest request);


}
