package com.vividseats.challenge.model;

import com.google.gson.annotations.SerializedName;


public class CardResponse {

    @SerializedName("topLabel")
    private String topLabel;

    @SerializedName("middleLabel")
    private String middleLabel;

    @SerializedName("bottomLabel")
    private String bottomLabel;

    @SerializedName("eventCount")
    private int eventCount;

    @SerializedName("image")
    private String image;

    @SerializedName("targetId")
    private int targetId;

    @SerializedName("targetType")
    private String targetType;

    @SerializedName("entityId")
    private int entityId;

    @SerializedName("entityType")
    private String entityType;

    @SerializedName("startDate")
    private long startDate;

    @SerializedName("rank")
    private int rank;

    public String getTopLabel() {
        return topLabel;
    }

    public void setTopLabel(String topLabel) {
        this.topLabel = topLabel;
    }

    public String getMiddleLabel() {
        return middleLabel;
    }

    public void setMiddleLabel(String middleLabel) {
        this.middleLabel = middleLabel;
    }

    public String getBottomLabel() {
        return bottomLabel;
    }

    public void setBottomLabel(String bottomLabel) {
        this.bottomLabel = bottomLabel;
    }

    public int getEventCount() {
        return eventCount;
    }

    public void setEventCount(int eventCount) {
        this.eventCount = eventCount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
