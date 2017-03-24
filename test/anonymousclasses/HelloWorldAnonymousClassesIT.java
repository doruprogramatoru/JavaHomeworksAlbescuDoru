/*
 * Java Unit Test
 */
package anonymousclasses;

import static anonymousclasses.HelloWorldAnonymousClasses.Languages.ENGLISH;
import org.junit.Test;

/**
 * Java Unit Test
 *
 * @author Doru
 */
public class HelloWorldAnonymousClassesIT {

    public HelloWorldAnonymousClassesIT() {
    }

    /**
     * Test of sayHello method, of class HelloWorldAnonymousClasses.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        HelloWorldAnonymousClasses.Languages language = ENGLISH;
        HelloWorldAnonymousClasses instance = new HelloWorldAnonymousClasses();
        instance.sayHello(language);
    }

    /**
     * Test of main method, of class HelloWorldAnonymousClasses.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HelloWorldAnonymousClasses.main(args);
    }

}
