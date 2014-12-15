package com.tngtech.jgiven.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotates elements that should be hidden in reports. 
 * <p>
 * This is useful for technical helper methods or arguments that have no meaning for domain expert,
 * but are needed for some technical reasons.
 * <p>
 * You should write technical helper methods in camelCase so that the name already indicates that
 * the method does not appear in the report.
 */
@Documented
@Retention( RetentionPolicy.RUNTIME )
@Target( { ElementType.METHOD, ElementType.PARAMETER } )
public @interface Hidden {

}
