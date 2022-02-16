package com.codepath.apps.restclienttemplate.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class Media {

    public String mediaUrl;

    public static Media fromJson(JSONArray jsonArray) throws JSONException {
        Media media = new Media();
        JSONObject jsonObject = jsonArray.getJSONObject(0);

        media.mediaUrl = jsonObject.getString("media_url_https");
        return media;
    }
}
