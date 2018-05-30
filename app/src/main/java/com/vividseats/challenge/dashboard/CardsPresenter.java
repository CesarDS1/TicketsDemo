package com.vividseats.challenge.dashboard;


import com.vividseats.challenge.model.CardModel;
import com.vividseats.challenge.model.CardResponse;
import com.vividseats.challenge.network.NetworkHelper;

import java.util.List;

public class CardsPresenter implements Dashboard.Presenter {

    private Dashboard.Model model;
    private Dashboard.View view;

    public CardsPresenter(Dashboard.View view, NetworkHelper networkHelper) {
        this.view = view;
        model = new CardModel(networkHelper, this);

    }

    @Override
    public void requestCardData() {
        model.requestCardData();
    }

    @Override
    public void handleRequestCardData(List<CardResponse> cardResponse) {
        view.showData(cardResponse);

    }
}
