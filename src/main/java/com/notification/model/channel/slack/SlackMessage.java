package com.notification.model.channel.slack;

import java.util.Map;

import static java.lang.String.format;

public class SlackMessage {
    private final SlackTemplate template;
    private final Map<String, String> data;

    public SlackMessage(SlackTemplate template, Map<String, String> data) {
        this.template = template;
        this.data = data;
    }

    public String getFormattedText() {
        return format(template.getText(), data.get("userName"));
    }
}
