package com.haanhgs.recyclerglide.model;

public class Sport {

    private String title;
    private String info;
    private int imgResource;

    public Sport(String title, String info, int imgResource) {
        this.title = title;
        this.info = info;
        this.imgResource = imgResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}