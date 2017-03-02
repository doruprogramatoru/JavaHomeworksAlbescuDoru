/*
 * Anonymous classes no more
 */
package anonymousclasses;

/**
 * Anonymous classes
 *
 * @author Doru
 */
public class HelloWorldAnonymousClasses {

    public enum Languages {
        ENGLISH, FRENCH, SPANISH
    }

// Inner interface HelloWorld
    interface HelloWorld {

        public void greet();

        public void greetSomeone(String someone);

    }
// Method sayHello prints 

    public void sayHello(Languages language) {

// Local class EnglishGreetings implemented in the method sayHello()
        class EnglishGreeting implements HelloWorld {

            String name = "world";

            @Override

            public void greet() {

                greetSomeone("world");

            }

            @Override

            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Hello " + name);

            }

        } // end of EnglishGreeting local class
        // create an EnglishGreeting object/instance 
        HelloWorld englishGreeting = new EnglishGreeting();

        /* Instead of anonymous class,I create local class FrenchGreeting
         * Local class FrenchGreeting implemented in the method sayHello()
         */
        class FrenchGreeting implements HelloWorld {

            String name = "tout le monde";

            @Override

            public void greet() {

                greetSomeone("tout le monde");

            }

            @Override

            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Salut " + name);

            }// end of FrenchGreeting local class 
        }
        // create an FrenchGreeting object/instance 
        HelloWorld frenchGreeting = new FrenchGreeting();

        /* Again instead of anonymous class,I create local class SpanishGreeting
         * Local class SpanishGreeting implemented in the method sayHello()
         */
        class SpanishGreeting implements HelloWorld {

            String name = "mundo";

            @Override

            public void greet() {

                greetSomeone("mundo");
            }

            @Override

            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Hola, " + name);

            }// end of SpanishGreeting local class 
        }
        // create an SpanishGreeting object/instance
        HelloWorld spanishGreeting = new SpanishGreeting();

        switch (language) {

            case ENGLISH:

                englishGreeting.greet();

                break;

            case FRENCH:

                frenchGreeting.greetSomeone("Fred");

                break;

            case SPANISH:

                spanishGreeting.greet();

                break;

            default:

                break;

        }
    }

    // main method
    public static void main(String... args) {
        // test how method works
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        //for ENGLISH Language
        myApp.sayHello(Languages.ENGLISH);
        //for FRENCH Language
        myApp.sayHello(Languages.FRENCH);
        //for SPANISH Language
        myApp.sayHello(Languages.SPANISH);

    }
}
