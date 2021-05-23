package com.notification.model.channel.inapp;

public class InAppTemplate {
    private final String id;
    private final String header;
    private final String body;
    private final String footer;

    public InAppTemplate(String id, String header, String body, String footer) {
        this.id = id;
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public String getId() {
        return id;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public String getFooter() {
        return footer;
    }
}
