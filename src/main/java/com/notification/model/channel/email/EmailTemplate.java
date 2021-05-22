package com.notification.model.channel.email;

public class EmailTemplate {
    private final String id;
    private final String subject;
    private final String body;

    public EmailTemplate(String id, String subject, String body) {
        this.id = id;
        this.subject = subject;
        this.body = body;
    }
}
