package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class Entities {

    public Media media;

    public static Entities fromJson(JSONObject jsonObject) throws JSONException {
        Entities entities = new Entities();

        try {
            entities.media = Media.fromJson(jsonObject.getJSONArray("media"));
        } catch(JSONException e) {
            entities.media = null;
        }
        return entities;
    }
}
