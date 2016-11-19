package com.esoftworks.oss.boxfusehttps.web.resources;

import java.io.Serializable;

public class Status implements Serializable {

    private String version = "1.0.0";

    private String status = "OK";

    private String message = "Please, use compatible application or REST client.";

    public Status() {
    }

    public Status(String version, String status, String message) {
        this.version = version;
        this.status = status;
        this.message = message;
    }

    public String getVersion() {
        return version;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

}

