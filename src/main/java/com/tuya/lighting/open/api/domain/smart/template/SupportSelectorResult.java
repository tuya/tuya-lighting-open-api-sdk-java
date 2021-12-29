package com.tuya.lighting.open.api.domain.smart.template;

import java.util.List;

public class SupportSelectorResult {

    private List<Selector> product;
    private List<Selector> topCategory;
    private List<Selector> secondCategory;
    private List<Selector> thirdCategory;
    private List<Selector> purpose;

    public List<Selector> getProduct() {
        return product;
    }

    public void setProduct(List<Selector> product) {
        this.product = product;
    }

    public List<Selector> getTopCategory() {
        return topCategory;
    }

    public void setTopCategory(List<Selector> topCategory) {
        this.topCategory = topCategory;
    }

    public List<Selector> getSecondCategory() {
        return secondCategory;
    }

    public void setSecondCategory(List<Selector> secondCategory) {
        this.secondCategory = secondCategory;
    }

    public List<Selector> getThirdCategory() {
        return thirdCategory;
    }

    public void setThirdCategory(List<Selector> thirdCategory) {
        this.thirdCategory = thirdCategory;
    }

    public List<Selector> getPurpose() {
        return purpose;
    }

    public void setPurpose(List<Selector> purpose) {
        this.purpose = purpose;
    }

    public static class Selector {
        private String code;
        private String name;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
