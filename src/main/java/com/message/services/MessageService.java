package com.message.services;

import com.message.models.Message;
import com.message.models.User;

public class MessageService {
	public static Message send(User sender, User receiver, String messageText) {
		String time = "12:20";

		return new Message(sender, receiver, messageText, time);
	}
}
