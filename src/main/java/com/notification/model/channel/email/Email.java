package com.notification.model.channel.email;

import java.util.Map;

import static java.lang.String.format;

public class Email {
    private final EmailTemplate template;
    private final Map<String, String> data;

    public Email(EmailTemplate template, Map<String, String> data) {
        this.template = template;
        this.data = data;
    }
    public String getFormattedSubject(){
        return format(template.getSubject(), data.get("userName"));
    };

    public String getFormattedBody(){
        //TODO: return a formatted body using template and data
        return "";
    };
}
