package org.codnect.firesnap.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Burak Koken on 24.10.2018.
 *
 * @author Burak Koken
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
public @interface GeneratedValue {

    GenerationStrategy strategy() default GenerationStrategy.AUTO;

}
