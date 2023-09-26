package com.example.demo.selector;

import java.util.List;

/**
 * @author kermit.mo
 */
public class FakeFilterSelector {
    public boolean matchFilter(String currentFilterName) {
        return false;
    }

    public List<String> getFilterNames() {
        return null;
    }
}
