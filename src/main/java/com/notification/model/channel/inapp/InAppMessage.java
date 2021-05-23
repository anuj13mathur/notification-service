package com.notification.model.channel.inapp;

import java.util.Map;

import static java.lang.String.format;

public class InAppMessage {
    private final InAppTemplate template;
    private final Map<String, String> data;

    public InAppMessage(InAppTemplate template, Map<String, String> data) {
        this.template = template;
        this.data = data;
    }

    public String getFormattedHeader() {
        return format(template.getHeader(), data.get("userName"));
    }

    public String getFormattedBody() {
        //TODO: return a formatted body using template and data
        return "";
    }

    public String getFormattedFooter(){
        //TODO: return a formatted/static footer using template and data
        return "";
    }
}
