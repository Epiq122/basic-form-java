//package com.gleasondev.form.web.domain;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//public class LastNameValidator implements ConstraintValidator<LastName, String> {
//
//
//    @Override
//    public void initialize(LastName constraintAnnotation) {
//        ConstraintValidator.super.initialize(constraintAnnotation);
//    }
//
//    @Override
//    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
//        return !value.equals(User.getFirstName());
//    }
//}
