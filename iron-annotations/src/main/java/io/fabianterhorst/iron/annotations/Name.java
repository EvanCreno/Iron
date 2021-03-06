package io.fabianterhorst.iron.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Name {
    String value();
    boolean transaction() default false;
    boolean listener() default false;
    boolean loader() default false;
    boolean async() default false;
}