package com.message;

import com.message.models.Message;
import com.message.models.User;
import com.message.services.MessageService;
import com.message.services.UserService;

public class Main {
    public static void main(String[] args) {
        User[] users = UserService.create4users();
        Message[] messages = MessageService.create4Messages(users);

        for (User user : users) {
            System.out.println(user.getData());
        }

        for (Message message : messages) {
            System.out.println(message.getData());
        }
    }
}