package com.example.mvcvalidation.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD}) //can be applied to method or field
@Retention(RetentionPolicy.RUNTIME) // retain the bytecode at runtime
public @interface CourseCode {
    //attributes
    public String value() default "SMA";

    public String message() default "Course Code must start with SMA";

    // define default groups
    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
