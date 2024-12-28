package com.thuve.bigburger;

public class itemrecycle {
    private int imagesource;
    private String item;

    public itemrecycle(int imagesource) {
        this.imagesource = imagesource;

    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getImagesource() {
        return imagesource;
    }

    public void setImagesource(int imagesource) {
        this.imagesource = imagesource;
    }
}
