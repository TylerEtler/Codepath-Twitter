package com.codepath.apps.restclienttemplate;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.databinding.ActivityDetailBinding;
import com.codepath.apps.restclienttemplate.models.Tweet;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvScreenName;
    TextView tvBody;
    TextView tvTimestamp;
    ImageView ivProfileImage;
    ImageView ivMediaImage;

    private ActivityDetailBinding binding;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        tvName = binding.tvName;
        tvScreenName = binding.tvScreenname;
        tvBody = binding.tvBody;
        tvTimestamp = binding.tvTimestamp;
        ivProfileImage = binding.ivProfileImage;
        ivMediaImage = binding.ivMediaImage;

        Tweet tweet = Parcels.unwrap(getIntent().getParcelableExtra("tweet"));

        binding.setTweet(tweet);


        tvTimestamp.setText(tweet.getCreatedAt());
        String screenName = "@" + tweet.user.screenName;
        tvScreenName.setText(screenName);


        Glide.with(this)
                .load(tweet.user.profileImageUrl)
                .into(ivProfileImage);
        if (tweet.entities.media != null) {
            Log.i("DetailActivity",tweet.entities.media.mediaUrl);
            Glide.with(this)
                    .load(tweet.entities.media.mediaUrl)
                    .into(ivMediaImage);
        }




    }
}
