package com.tuya.lighting.open.api.domain.energy;

import java.util.List;

/**
 * Result of energy query
 *
 * @author lighting
 */
public class EnergyQueryResult {

    /**
     * total energy
     */
    private Double totalEnergy;

    /**
     * average energy
     */
    private Double averageEnergy;

    /**
     * tb value
     */
    private Double tbValue;

    /**
     * hb value
     */
    private Double hbValue;

    /**
     * tb
     */
    private Double tb;

    /**
     * hb
     */
    private Double hb;

    /**
     * data
     */
    private List<DetailEnergy> data;

    public Double getTotalEnergy() {
        return totalEnergy;
    }

    public void setTotalEnergy(Double totalEnergy) {
        this.totalEnergy = totalEnergy;
    }

    public Double getAverageEnergy() {
        return averageEnergy;
    }

    public void setAverageEnergy(Double averageEnergy) {
        this.averageEnergy = averageEnergy;
    }

    public Double getTbValue() {
        return tbValue;
    }

    public void setTbValue(Double tbValue) {
        this.tbValue = tbValue;
    }

    public Double getHbValue() {
        return hbValue;
    }

    public void setHbValue(Double hbValue) {
        this.hbValue = hbValue;
    }

    public Double getTb() {
        return tb;
    }

    public void setTb(Double tb) {
        this.tb = tb;
    }

    public Double getHb() {
        return hb;
    }

    public void setHb(Double hb) {
        this.hb = hb;
    }

    public List<DetailEnergy> getData() {
        return data;
    }

    public void setData(List<DetailEnergy> data) {
        this.data = data;
    }

    public static class DetailEnergy {

        /**
         * sort
         */
        private Long sort;

        /**
         * time
         */
        private Long time;

        /**
         * energy
         */
        private Double energy;

        public Long getSort() {
            return sort;
        }

        public void setSort(Long sort) {
            this.sort = sort;
        }

        public Long getTime() {
            return time;
        }

        public void setTime(Long time) {
            this.time = time;
        }

        public Double getEnergy() {
            return energy;
        }

        public void setEnergy(Double energy) {
            this.energy = energy;
        }
    }
}
