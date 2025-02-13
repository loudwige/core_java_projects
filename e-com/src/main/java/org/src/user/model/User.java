package org.src.user.model;

import java.util.Objects;

/**
 * Represents a user with a username, password, and assigned role.
 * Provides methods to access and modify these attributes, as well as
 * overrides for standard object methods such as toString, equals, and hashCode.
 */
public class User {
    private String username;
    private String password;
    private String role;


    /**
     * Constructs a User object with the specified username, password, and role.
     *
     * @param username the username of the user
     * @param password the password of the user
     * @param role     the role assigned to the user
     */
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    /**
     * Retrieves the username of the user.
     *
     * @return the username of the user
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username for this user.
     *
     * @param username the new username to be assigned to the user
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Retrieves the password of the user.
     *
     * @return the password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Updates the password for the user.
     *
     * @param password the new password to be set for the user
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Retrieves the role assigned to the user.
     *
     * @return the role of the user
     */
    public String getRole() {
        return role;
    }

    /**
     * Updates the role assigned to the user.
     *
     * @param role the new role to be set for the user
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Returns a string representation of the User object.
     * The string includes the values of the username, password, and role fields.
     *
     * @return a string representation of the User object
     */
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    /**
     * Compares this User object to the specified object for equality.
     * Returns true if the specified object is also a User and has the same
     * values for the username, password, and role fields as this User.
     *
     * @param o the object to be compared with this User
     * @return true if the specified object is equal to this User; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(role, user.role);
    }

    /**
     * Returns the hash code value for this User object. The hash code is computed
     * based on the values of the username, password, and role fields.
     *
     * @return the hash code value for this User object
     */
    @Override
    public int hashCode() {
        return Objects.hash(username, password, role);
    }
}
