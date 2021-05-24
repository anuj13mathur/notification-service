package com.notification.model.channel.inapp;

import com.notification.model.channel.email.EmailTemplate;
import com.notification.model.channel.slack.SlackTemplate;
import com.notification.model.type.Severity;

import java.util.List;

public class InAppClient {
    public void send(InAppMessage inAppMessage, List<String> userIds, Severity severity) {
    }

    public void broadcast(InAppMessage inAppMessage, String channel, Severity severity) {
    }
}
