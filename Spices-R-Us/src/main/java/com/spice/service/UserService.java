package com.spice.service;

import com.spice.model.SpiceUser;

/**
 * Interface for users.
 */
public interface UserService {
    
    /**
     * Saves details input by user in register form into the database.
     * @param user New user to be added to database.
     */
    void registerUser(SpiceUser user);
}
