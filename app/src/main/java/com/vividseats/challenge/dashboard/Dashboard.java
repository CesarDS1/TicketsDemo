package com.vividseats.challenge.dashboard;

import com.vividseats.challenge.model.CardResponse;

import java.util.List;


public interface Dashboard {

    interface View {
        void showData(List<CardResponse> cardResponse);

    }

    interface Presenter {
        void requestCardData();

        void handleRequestCardData(List<CardResponse> cardResponse);
    }

    interface Model {
        void requestCardData();
    }
}
