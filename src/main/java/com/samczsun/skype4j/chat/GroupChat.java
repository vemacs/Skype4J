package com.samczsun.skype4j.chat;

import com.samczsun.skype4j.exceptions.SkypeException;

/**
 * Represents a group chat with one or more people
 *
 * @author samczsun
 */
public interface GroupChat extends Chat {
    /**
     * Get the topic of the chat.
     *
     * @return The topic
     */
    String getTopic();

    /**
     * Set the topic of the chat. This will update it in real time
     *
     * @param topic The topic
     * @throws SkypeException
     */
    void setTopic(String topic) throws SkypeException;

    /**
     * Kick a user from this chat
     *
     * @param username The username of the user to kick
     * @throws SkypeException If the user is not in this chat, or if the kick failed
     */
    void kick(String username) throws SkypeException;

    /**
     * Leave the chat
     *
     * @throws SkypeException If the leave failed
     */
    void leave() throws SkypeException;
}
