package com.sample.aws;

import java.util.Map;

public class GatewayResponse {

    private String body;
    private Integer statusCode;
    private Map<String, String> headers;

    public GatewayResponse(String body, Integer statusCode, Map<String, String> headers) {
        this.body = body;
        this.statusCode = statusCode;
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

}
