package com.example.demo.selector;

import java.util.List;

/**
 * @author kermit.mo
 */
public interface FilterSelector {
    boolean matchFilter(String var1);

    List<String> getFilterNames();
}
