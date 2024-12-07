package com.message.services;

import com.message.models.Message;
import com.message.models.User;

public class UserService {
    public static User create(String nick, String name, String pn, String pass) {
        User user = new User(nick, name, pn, pass);
        return user;
    }

    public static User[] create4users() {
        User[] users = new User[4];
        users[0] = create("JohnDoe", "John Doe", "+1234567890", "password123");
        users[1] = create("JaneSmith", "Jane Smith", "+0987654321", "securePass456");
        users[2] = create("MikeW", "Mike Wilson", "+1122334455", "mike2024");
        users[3] = create("SaraLee", "Sara Lee", "+2211334455", "saraPass789");
        return  users;
    }
}