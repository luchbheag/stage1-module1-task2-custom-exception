package com.epam.mjc;

/**
 * Custom exception extends {@link IllegalArgumentException} for {@link StudentManager class}.
 * Should be thrown if there is no such id.
*/
public class WrongIdStudentException extends IllegalArgumentException {
    public WrongIdStudentException(long id) {
        super(String.format("Could not find student with ID %d", id));
    }
}
