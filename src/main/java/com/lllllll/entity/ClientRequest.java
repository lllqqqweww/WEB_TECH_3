package com.lllllll.entity;

import java.io.Serializable;

public class ClientRequest implements Serializable {
    private Object body;
    private RequestType requestType;

    public ClientRequest(Object body, RequestType type){
        this.body = body;
        this.requestType = type;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }
}
