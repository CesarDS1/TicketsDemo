package com.vividseats.challenge.dashboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.vividseats.challenge.R;
import com.vividseats.challenge.model.CardResponse;
import com.vividseats.challenge.network.NetworkHelper;

import java.util.ArrayList;
import java.util.List;


public class DashboardActivity extends AppCompatActivity implements Dashboard.View {

    private RecyclerView rvCardList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);

        setContentView(R.layout.activity_dashboard);

        rvCardList = findViewById(R.id.rv_card_list);
        NetworkHelper networkHelper = new NetworkHelper();
        Dashboard.Presenter presenter = new CardsPresenter(this, networkHelper);
        presenter.requestCardData();

    }

    @Override
    public void showData(List<CardResponse> cardResponse) {
        CardsAdapter cardsAdapter = new CardsAdapter(this, (ArrayList<CardResponse>) cardResponse);
        rvCardList.setAdapter(cardsAdapter);
        rvCardList.setLayoutManager(new LinearLayoutManager(this));
    }
}
