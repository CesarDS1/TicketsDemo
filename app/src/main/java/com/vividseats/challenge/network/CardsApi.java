package com.vividseats.challenge.network;


import com.vividseats.challenge.model.CardRequest;
import com.vividseats.challenge.model.CardResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface CardsApi {

    @Headers({"Accept: application/json", "X-Mobile-Platform: Android"})
    @POST("rest/mobile/v1/cards")
    Observable<List<CardResponse>> getCards(final @Body CardRequest bodyRequest);

}
