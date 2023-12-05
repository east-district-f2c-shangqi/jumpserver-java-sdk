package com.jumpserver.sdk.v2.model;

import java.util.List;


public class AssetsPage {
    private Integer count;
    private String next;
    private String previous;
    private List<Asset> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public List<Asset> getResults() {
        return results;
    }

    public void setResults(List<Asset> results) {
        this.results = results;
    }
}
