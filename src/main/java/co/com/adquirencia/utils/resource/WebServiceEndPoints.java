package co.com.adquirencia.utils.resource;

import co.com.adquirencia.utils.Constant.Endpoints;


public enum WebServiceEndPoints {
    URI(Endpoints.URL_USERS);

    private final String url;

    WebServiceEndPoints(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
