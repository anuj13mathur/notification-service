package com.notification.model;

import com.notification.model.channel.email.EmailTemplate;
import com.notification.model.channel.inapp.InAppTemplate;
import com.notification.model.channel.slack.SlackTemplate;

public class Template {
    private final String id;
    private final String title;
    private final String description;
    private final EmailTemplate emailTemplate;
    private final SlackTemplate slackTemplate;
    private final InAppTemplate inAppTemplate;

    public Template(String id, String title, String description, EmailTemplate emailTemplate, SlackTemplate slackTemplate, InAppTemplate inAppTemplate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.emailTemplate = emailTemplate;
        this.slackTemplate = slackTemplate;
        this.inAppTemplate = inAppTemplate;
    }
}
