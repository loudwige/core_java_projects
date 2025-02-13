package org.src.user.repository;

import org.src.user.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository {
    private final Map<String, User> userDatabase = new HashMap<>();

    public void save(User user) {
        userDatabase.put(user.getUsername(), user);
    }
  public Optional<User> findByUsername(String username) {
        return Optional.ofNullable(userDatabase.get(username));
  }

  public boolean exists(String username) {
        return userDatabase.containsKey(username);
  }
}
