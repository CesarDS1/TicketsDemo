package com.vividseats.challenge.dashboard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import com.vividseats.challenge.R;
import com.vividseats.challenge.model.CardResponse;

import java.util.ArrayList;


public class CardsAdapter extends RecyclerView.Adapter<CardsViewHolder> {

    private ArrayList<CardResponse> cards;
    private Context ctx;

    public CardsAdapter(Context ctx, ArrayList<CardResponse> cards) {

        this.ctx = ctx;
        this.cards = cards;

    }

    @NonNull
    @Override
    public CardsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item_home, parent, false);

        return new CardsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CardsViewHolder holder, int position) {
        CardResponse cardResponse = cards.get(position);
        holder.tvTopLabel.setText(cardResponse.getTopLabel());
        holder.tvMiddleLabel.setText(cardResponse.getMiddleLabel());
        holder.tvBottomLabel.setText(cardResponse.getBottomLabel());
        holder.tvEventCount.setText(String.format("%s %s", String.valueOf(cardResponse.getEventCount()),
                ctx.getString(R.string.label_events)));

        Glide.with(ctx).load(cardResponse.getImage()).into(holder.ivCardImage);

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }
}
