package com.vividseats.challenge.model;

import com.google.gson.annotations.SerializedName;

public class CardRequest {

    @SerializedName("startDate")
    private String startDate;

    @SerializedName("endDate")
    private String endDate;

    @SerializedName("includeSuggested")
    private String includeSuggested;

    public CardRequest(String startDate, String endDate, String includeSuggested) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.includeSuggested = includeSuggested;
    }


}
