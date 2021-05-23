package com.notification.model.channel.slack;

public class SlackTemplate {
    private final String id;
    private final String text;

    public SlackTemplate(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
