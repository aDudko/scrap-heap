package com.udemy.java.annotation;

/**
 * Usage: @AnnotationWithParameters(name = "Mike", dateOfBirth = 1947)
 */
public @interface AnnotationWithParameters {
    String name();
    int dateOfBirth();
}
