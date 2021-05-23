package com.notification.model.template;

import com.notification.model.channel.email.EmailTemplate;
import com.notification.model.channel.inapp.InAppTemplate;
import com.notification.model.channel.slack.SlackTemplate;

public class AllChannelTemplate {
    private final TemplateMetadata metadata;
    private final EmailTemplate emailTemplate;
    private final SlackTemplate slackTemplate;
    private final InAppTemplate inAppTemplate;

    public AllChannelTemplate(TemplateMetadata metadata, EmailTemplate emailTemplate, SlackTemplate slackTemplate,
                              InAppTemplate inAppTemplate) {
        this.metadata = metadata;
        this.emailTemplate = emailTemplate;
        this.slackTemplate = slackTemplate;
        this.inAppTemplate = inAppTemplate;
    }
}
