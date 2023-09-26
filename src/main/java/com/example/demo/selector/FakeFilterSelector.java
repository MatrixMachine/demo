package com.example.demo.selector;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author kermit.mo
 */
public class FakeFilterSelector implements FilterSelector {
    private List<String> filterNames = new ArrayList<>();

    public boolean matchFilter(String classSimpleName) {
        return this.filterNames.stream().anyMatch((s) -> Objects.equals(s, classSimpleName));
    }

    public List<String> getFilterNames() {
        return this.filterNames;
    }

    public void addFilter(String clsNames) {
        this.filterNames.add(clsNames);
    }

    public void addFilters(List<String> filterNameList) {
        filterNames.addAll(filterNameList);
    }

    public FakeFilterSelector() {
    }

    public FakeFilterSelector(List<String> filterNames) {
        this.filterNames = filterNames;
    }
}
