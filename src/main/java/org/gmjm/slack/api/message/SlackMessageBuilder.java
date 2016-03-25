package org.gmjm.slack.api.message;

public interface SlackMessageBuilder
{
	SlackMessageBuilder setText(String text);

	SlackMessageBuilder setIconEmoji(String iconEmoji);

	SlackMessageBuilder setIconUrl(String iconUrl);

	SlackMessageBuilder setText(String text, boolean markdownEnabled);

	SlackMessageBuilder setChannel(ChannelName channelName);

	SlackMessageBuilder setUserAsChannel(String userName);

	SlackMessageBuilder addAttachment(AttachmentBuilder attachmentBuilder);

	SlackMessageBuilder setResponseType(String responseType);

	SlackMessageBuilder setUsername(String username);

	String build();
}