package com.example.mvcvalidation.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
    private String coursePrefix;
    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix = coursePrefix;
    }


    @Override
    public boolean isValid(String courseCode, ConstraintValidatorContext constraintValidatorContext) {
        if(courseCode == null) return true;
        return courseCode.startsWith(coursePrefix);
    }
}
