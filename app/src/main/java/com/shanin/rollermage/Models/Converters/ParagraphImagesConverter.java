package com.shanin.rollermage.Models.Converters;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class ParagraphImagesConverter {

    @TypeConverter
    public String fromParagraphImages(List<Integer> paragraphImages) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(paragraphImages);
    }

    @TypeConverter
    public List<Integer> toParagraphImages(String data){
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(data, new TypeToken<List<Integer>>() {}.getType());
    }
}
