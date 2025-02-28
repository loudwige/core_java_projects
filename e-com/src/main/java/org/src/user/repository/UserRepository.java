package org.src.user.repository;

import org.src.user.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * The UserRepository class represents an in-memory database for storing and managing User objects.
 * It provides functionality to save, retrieve, and check the existence of users using their username.
 */

public class UserRepository {
    /**
     * A map used as an in-memory database to store User objects,
     * where the key represents the username of the User, and the value is the User object itself.
     * This structure supports operations such as saving, retrieving, and checking the existence of Users.
     */
    private final Map<String, User> userDatabase = new HashMap<>();

    /**
     * Saves the specified user into the in-memory database. The user is stored
     * using their username as the key. If a user with the same username already
     * exists, it is replaced with the new user.
     *
     * @param user the User object to be saved in the in-memory database
     */
    public void save(User user) {
        userDatabase.put(user.getUsername(), user);
    }

    /**
     * Retrieves a User object from the in-memory database based on the provided username.
     *
     * @param username the username of the user to be retrieved
     * @return an Optional containing the User object if found, or an empty Optional if no user with the specified username exists
     */
    public User findByUsername(String username) {
        return userDatabase.get(username);
    }

    /**
     * Checks if a user with the specified username exists in the in-memory database.
     *
     * @param username the username of the user to check for existence
     * @return true if a user with the specified username exists, false otherwise
     */
    public boolean exists(String username) {
        return userDatabase.containsKey(username);
    }
}
