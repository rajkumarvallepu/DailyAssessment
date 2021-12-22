package com.htd.customannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Tag("Fast")

public @interface Fast {
}
