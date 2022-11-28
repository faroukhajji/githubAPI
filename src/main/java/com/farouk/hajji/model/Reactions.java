
package com.farouk.hajji.model;

import com.google.gson.annotations.SerializedName;


public class Reactions {

    @SerializedName("confused")
    private Long mConfused;
    @SerializedName("eyes")
    private Long mEyes;
    @SerializedName("heart")
    private Long mHeart;
    @SerializedName("hooray")
    private Long mHooray;
    @SerializedName("laugh")
    private Long mLaugh;
    @SerializedName("rocket")
    private Long mRocket;
    @SerializedName("total_count")
    private Long mTotalCount;
    @SerializedName("url")
    private String mUrl;


    public Long getConfused() {
        return mConfused;
    }

    public void setConfused(Long confused) {
        mConfused = confused;
    }

    public Long getEyes() {
        return mEyes;
    }

    public void setEyes(Long eyes) {
        mEyes = eyes;
    }

    public Long getHeart() {
        return mHeart;
    }

    public void setHeart(Long heart) {
        mHeart = heart;
    }

    public Long getHooray() {
        return mHooray;
    }

    public void setHooray(Long hooray) {
        mHooray = hooray;
    }

    public Long getLaugh() {
        return mLaugh;
    }

    public void setLaugh(Long laugh) {
        mLaugh = laugh;
    }

    public Long getRocket() {
        return mRocket;
    }

    public void setRocket(Long rocket) {
        mRocket = rocket;
    }

    public Long getTotalCount() {
        return mTotalCount;
    }

    public void setTotalCount(Long totalCount) {
        mTotalCount = totalCount;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
