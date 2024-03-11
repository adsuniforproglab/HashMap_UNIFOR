package com.unifor.data_structures_problem.service;

import com.unifor.data_structures_problem.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private final HashMap<String, User> usersHashMap = new HashMap<>();

    public UserService() {
        User user1 = new User("João", "12345678901", "85999999999", "email@email.com");
        User user2 = new User("Maria", "12345678902", "85999999998", "email2@emial.com");
        User user3 = new User("José", "12345678903", "85999999997", "email3@email.com");
        usersHashMap.put(user1.getCpf(), user1);
        usersHashMap.put(user2.getCpf(), user2);
        usersHashMap.put(user3.getCpf(), user3);
    }

    public User getUserByCpf(String cpf) {
        return usersHashMap.get(cpf);
    }

    public void addUser(User user) {
        usersHashMap.put(user.getCpf(), user);
    }

    public Map<String, User> getAllUsers() {
        return usersHashMap;
    }

}
