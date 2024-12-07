package com.message.services;

import com.message.models.Message;
import com.message.models.User;

public class MessageService {
	public static Message send(User sender, User receiver, String messageText) {
		String time = "12:20";

		return new Message(sender, receiver, messageText, time);
	}

	public Message[] create4Messages(User[] users)  {
		Message[] messages = new Message[4];
		messages[0] = send(users[0], users[1], "test");
		messages[1] = send(users[1], users[2], "test");
		messages[2] = send(users[2], users[3], "test");
		messages[3] = send(users[3], users[0], "test");

		return messages;
	}
}
