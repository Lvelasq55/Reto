package com.siigo.qa.utils;

import com.google.gson.Gson;

import java.util.Map;

public class JsonConverter {

    public static <T> String getJson(T object) {
        final Gson gson = new Gson();
        return gson.toJson(object);
    }

    public static Map converterJsonMap(String object) {
        final Gson gson = new Gson();
        return gson.fromJson(object, Map.class);
    }
}