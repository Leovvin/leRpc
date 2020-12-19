package org.example.lerpc.rpc.annotation;

public @interface Provider {
    String name() default "";
    String endpoint() default "";
}
