package com.vividseats.challenge.model;

import android.util.Log;


import com.vividseats.challenge.dashboard.CardsPresenter;
import com.vividseats.challenge.dashboard.Dashboard;
import com.vividseats.challenge.network.NetworkHelper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class CardModel implements Dashboard.Model {

    public List<CardResponse> cardsGlobal;
    private NetworkHelper networkHelper;
    private CardsPresenter presenter;
    public Observable<List<CardResponse>> cards;

    public CardModel(NetworkHelper networkHelper, CardsPresenter presenter) {
        cardsGlobal = new ArrayList<>();
        this.networkHelper = networkHelper;
        this.presenter = presenter;

    }

    @Override
    public void requestCardData() {

        Date currentDate = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = df.format(currentDate);

        Calendar otherDayCalendar = Calendar.getInstance();
        otherDayCalendar.add(Calendar.DAY_OF_WEEK, 5);
        Date otherDay = otherDayCalendar.getTime();

        String otherDateString = df.format(otherDay);

        CardRequest cardRequest = new CardRequest(formattedDate, otherDateString, "true");

        cards = networkHelper.getCardsApi().getCards(cardRequest);

        cards.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<CardResponse>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e("Main", "subscriobe");
                    }

                    @Override
                    public void onNext(List<CardResponse> cards) {

                        cardsGlobal.addAll(cards);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("Main", "onError");
                    }

                    @Override
                    public void onComplete() {
                        Log.e("Main", "onComplete");
                            presenter.handleRequestCardData(cardsGlobal);

                    }
                });
    }
}
