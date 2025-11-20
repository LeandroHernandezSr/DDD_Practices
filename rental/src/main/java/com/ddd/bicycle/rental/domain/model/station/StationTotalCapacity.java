package com.ddd.bicycle.rental.domain.model.station;

public class StationTotalCapacity {
    
    private final Integer totalCapacity;
    private Integer currentBikeCount;

    public StationTotalCapacity(Integer totalCapacity,Integer currentBikeCount) {
        this.totalCapacity = totalCapacity;
        this.currentBikeCount=currentBikeCount;
    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public Integer getCurrentBikeCount() {
        return currentBikeCount;
    }

    public void aumentBikeCount(){
        if (currentBikeCount >= totalCapacity) throw new IllegalArgumentException("The currentBikeCount cannot be big than totalCapacity");
        this.currentBikeCount++;
    }

    public void reduceBikeCount(){
        if (currentBikeCount < 0) throw new IllegalArgumentException("The currentBikeCount cannot be small than zero");
        this.currentBikeCount--;
    }
}
