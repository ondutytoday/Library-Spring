package org.vasileva.library;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.vasileva.library.config.SpringConfig;

public class LibraryApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
    }
}
