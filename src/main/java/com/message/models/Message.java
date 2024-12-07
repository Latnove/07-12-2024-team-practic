package com.message.models;

public class Message {
	private User sender;
	private User reseiver;
	private String messageText;
	private String messageTime;

  public Message(User sender, User reseiver, String messageText, String messageTime) {
		this.sender = sender;
		this.reseiver = reseiver;
		this.messageText = messageText;
		this.messageTime = messageTime;
	}

	public User getSender() {
		return this.sender;
	}

	public User getReseiver() {
		return  this.reseiver;
	}

	public String getMessageText() {
		return this.messageText;
	}

	public String getMessageTime() {
		return this.messageTime;
	}

	public String getData() {
		return this.sender + " отправил " + this.reseiver + " сообщение: " + this.messageText + " в " + this.messageTime;
	}
}
