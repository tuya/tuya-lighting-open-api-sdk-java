package com.tuya.lighting.open.api.domain;

import java.util.List;

/**
 * Paging query result
 *
 * @param <T> T
 * @author lighting
 */
public class PageResult<T> {

    /**
     * total
     */
    private Integer total;

    /**
     * list
     */
    private List<T> list;

    /**
     * records
     * Todo: using only one kind of paging result.
     */
    private List<T> records;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }
}
