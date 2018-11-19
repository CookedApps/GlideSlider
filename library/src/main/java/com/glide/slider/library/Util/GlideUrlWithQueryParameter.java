package com.glide.slider.library.Util;

import com.bumptech.glide.load.model.GlideUrl;

/**
 * Extension of {@link GlideUrl} for storing an Url and its Query Parameters separately for caching.
 * <p>Created by sandro on 19.11.2018</p>
 */
public class GlideUrlWithQueryParameter extends GlideUrl {

    private String sourceUrl;

    public GlideUrlWithQueryParameter(String url) {
        super(url);
        setSourceUrl(url);
    }

    private void setSourceUrl(String url) {
        sourceUrl = url.split("\\?")[0];
    }

    @Override
    public String getCacheKey() {
        return sourceUrl;
    }

    @Override
    public String toString() {
        return super.getCacheKey();
    }
}
