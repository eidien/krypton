package com.gigigo.example.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 12/10/2016.
 */
public class PlayListItem {

    @SerializedName("items")
    public ArrayList<Item> items;
}
