package com.tuya.lighting.open.api.domain;

/**
 * Base class of paging query request
 *
 * @author lighting
 */
public class PageQuery {

    /**
     * page
     */
    private Integer page;

    /**
     * pageSize
     */
    private Integer pageSize;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
