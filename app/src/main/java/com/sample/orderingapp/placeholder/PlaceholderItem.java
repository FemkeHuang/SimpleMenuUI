package com.sample.orderingapp.placeholder;

import android.graphics.Bitmap;

/**
 * A placeholder item representing a piece of content.
 */
public class PlaceholderItem {
    public final String categoryName;
    public final String note;
    public final String sectorName;
    public final String dishName;
    public final String price;
    public Bitmap image = null;
    public final String unit;
    public final int number;
    public final Double discount;
    public final String dishDescription;


    public PlaceholderItem(String categoryName, String note, String sectorName, String dishName, String price, Bitmap image, String unit, int number, Double discount, String dishDescription) {
        this.categoryName = categoryName;
        this.note = note;
        this.sectorName = sectorName;
        this.dishName = dishName;
        this.price = price;
        this.image = image;
        this.unit = unit;
        this.number = number;
        this.discount = discount;
        this.dishDescription = dishDescription;
    }

    public PlaceholderItem(String categoryName, String note, String sectorName, String dishName, String price, Bitmap image, String unit, String dishDescription) {
        this.categoryName = categoryName;
        this.note = note;
        this.sectorName = sectorName;
        this.dishName = dishName;
        this.price = price;
        this.image = image;
        this.unit = unit;
        this.number = 0;
        this.discount = 1.0;
        this.dishDescription = dishDescription;
    }
}
