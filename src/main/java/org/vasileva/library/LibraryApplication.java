package org.vasileva.library;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.vasileva.library.config.LibraryConfig;

public class LibraryApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(LibraryConfig.class);
    }
}
