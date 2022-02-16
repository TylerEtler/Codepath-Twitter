package com.codepath.apps.restclienttemplate;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.models.Tweet;

public class TweetHolder extends RecyclerView.ViewHolder {

    ImageView ivProfileImage;
    TextView tvBody;
    TextView tvScreenName;
    TextView tvName;
    TextView tvTimestamp;
    RelativeLayout container;

    public TweetHolder(@NonNull View itemView) {
        super(itemView);
        ivProfileImage = itemView.findViewById(R.id.ivProfileImage);
        tvBody = itemView.findViewById(R.id.tvBody);
        tvScreenName = itemView.findViewById(R.id.tvScreenname);
        tvName = itemView.findViewById(R.id.tvName);
        tvTimestamp = itemView.findViewById(R.id.tvTimestamp);
        container = itemView.findViewById(R.id.item_tweet);
    }

    public RelativeLayout getContainer () {
        return container;
    }
}
