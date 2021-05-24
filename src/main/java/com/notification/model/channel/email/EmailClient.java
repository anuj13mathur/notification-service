package com.notification.model.channel.email;

import com.notification.model.channel.inapp.InAppTemplate;
import com.notification.model.type.Severity;

import java.util.List;

public class EmailClient {
    public void send(Email email, List<String> userIds, Severity severity) {
    }

    public void broadcast(Email email, String groupEmailId, Severity severity) {
    }
}
