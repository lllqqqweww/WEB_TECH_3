package com.lllllll.entity;

import java.io.Serializable;

public class Response implements Serializable {
    private Object body;
    private boolean status;

    public Response(Object body, boolean status) {
        this.body = body;
        this.status = status;
    }

    public Response() {

    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
