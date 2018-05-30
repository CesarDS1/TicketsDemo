package com.vividseats.challenge.dashboard;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.vividseats.challenge.R;


public class CardsViewHolder extends RecyclerView.ViewHolder {


    public TextView tvTopLabel;
    public TextView tvMiddleLabel;
    public TextView tvBottomLabel;
    public TextView tvEventCount;
    public ImageView ivCardImage;

    CardsViewHolder(View view) {
        super(view);
        tvTopLabel = view.findViewById(R.id.tvTopLabel);
        tvMiddleLabel = view.findViewById(R.id.tvMiddleLabel);
        tvBottomLabel = view.findViewById(R.id.tvBottomLabel);
        tvEventCount = view.findViewById(R.id.tvEventCount);
        ivCardImage = view.findViewById(R.id.ivCard);

    }
}
