/*
 * To compile this file:
 *    javac Main.java
 *
 * To exexcute/run this class:
 *    java Main
 *
 */
public class Main {

    public static void main(String[] args) {

        int age = 18;
        //age = 80;
        //age = 90;
        //age = 100;
        //age = 101;

        if (age>100) {
            System.out.println("Wow, you're over hundred years old!");
        } else if (age>80) {
            System.out.println("Wow, you're kind of old!");
        } else {
            System.out.println("You're still young");
        }
    }

}
