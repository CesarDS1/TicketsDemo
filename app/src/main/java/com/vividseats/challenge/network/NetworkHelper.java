package com.vividseats.challenge.network;


import com.vividseats.challenge.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class NetworkHelper {

    private CardsApi cardsApi;

    public NetworkHelper() {

        cardsApi = retrofitFactory(BuildConfig.VIVA_SEATS_API).create(CardsApi.class);
    }

    /**
     * Builds retrofit services.
     *
     * @param url base url.
     * @return retrofit instance.
     */
    private Retrofit retrofitFactory(final String url) {

        return new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public CardsApi getCardsApi() {
        return cardsApi;

    }
}
