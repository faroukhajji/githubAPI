
package com.farouk.hajji.model;

import com.google.gson.annotations.SerializedName;

public class PullRequest {

    @SerializedName("diff_url")
    private String mDiffUrl;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("merged_at")
    private Object mMergedAt;
    @SerializedName("patch_url")
    private String mPatchUrl;
    @SerializedName("url")
    private String mUrl;

    public String getDiffUrl() {
        return mDiffUrl;
    }

    public void setDiffUrl(String diffUrl) {
        mDiffUrl = diffUrl;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public Object getMergedAt() {
        return mMergedAt;
    }

    public void setMergedAt(Object mergedAt) {
        mMergedAt = mergedAt;
    }

    public String getPatchUrl() {
        return mPatchUrl;
    }

    public void setPatchUrl(String patchUrl) {
        mPatchUrl = patchUrl;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
