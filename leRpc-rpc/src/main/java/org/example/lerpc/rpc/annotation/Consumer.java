package org.example.lerpc.rpc.annotation;

public @interface Consumer {
    String url() default "";
    String endpoint() default "";
}
