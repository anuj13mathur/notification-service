package com.notification.model.channel.slack;

import com.notification.model.channel.inapp.InAppTemplate;
import com.notification.model.type.Severity;

import java.util.List;

public class SlackClient {
    public void send(SlackMessage message, List<String> userIds, Severity severity) {
    }

    public void broadcast(SlackMessage message, String channel, Severity severity) {
    }
}
