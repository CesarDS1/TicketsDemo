package com.vividseats.challenge;


import com.vividseats.challenge.dashboard.CardsPresenter;
import com.vividseats.challenge.dashboard.DashboardActivity;
import com.vividseats.challenge.model.CardModel;
import com.vividseats.challenge.model.CardResponse;
import com.vividseats.challenge.network.NetworkHelper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import static junit.framework.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class getDataUnitTest {

    private CardsPresenter cardsPresenter;

    private CardModel cardsModel;
    @Mock
    private DashboardActivity dashboardActivity;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void validateGetData() {
        NetworkHelper networkHelper = new NetworkHelper();

        cardsPresenter = new CardsPresenter(dashboardActivity, networkHelper);
        cardsModel = new CardModel(networkHelper, cardsPresenter);
        cardsModel.requestCardData();

        cardsModel.cards.subscribe(new Observer<List<CardResponse>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(List<CardResponse> cardResponses) {
                assertNotNull(cardResponses.get(0));
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });


    }
}