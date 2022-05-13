package com.example.spring.exceptions;

import javax.persistence.NonUniqueResultException;

public class ProjectAlreadyExistsException extends NonUniqueResultException {

    public ProjectAlreadyExistsException(String s) {
        super(s);
    }
}
