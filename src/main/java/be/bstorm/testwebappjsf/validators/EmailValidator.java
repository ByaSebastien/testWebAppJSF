package be.bstorm.testwebappjsf.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<Email, String> {

    private static final Pattern emailPattern = Pattern.compile( "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$" );
    
    @Override
    public void initialize( Email constraintAnnotation ) {
        // Rien à faire pour cet exemple.
    }
    
    @Override
    public boolean isValid( String email, ConstraintValidatorContext context ) {
        return emailPattern.matcher( email ).find();
    }
    
}