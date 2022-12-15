package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Simple guice injection done. This is just to use Guice library.
 */
public class App {
    public static void main( String[] args ) {
        Injector injector = Guice.createInjector();
        A a = injector.getInstance(A.class);
        a.printDeps();
    }
}
