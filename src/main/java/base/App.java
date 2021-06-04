/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

/*
Story:
    There was a (adjective)(noun) that liked to (adverb)(verb).
    Then it lived happily ever after.
 */
public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        myApp.output(myApp.nounPrompt(), myApp.verbPrompt(), myApp.adjPrompt(), myApp.advPrompt());
    }

    private String nounPrompt() {
        System.out.print("Enter a noun: ");
        return in.nextLine();
    }

    private String verbPrompt() {
        System.out.print("Enter a verb: ");
        return in.nextLine();
    }

    private String adjPrompt() {
        System.out.print("Enter a adjective: ");
        return in.nextLine();
    }

    private String advPrompt() {
        System.out.print("Enter a adverb: ");
        return in.nextLine();
    }

    private void output(String noun, String verb, String adj, String adv) {
        System.out.printf("There was a %s %s that liked to %s %s. It then lived happily ever after.", adj, noun, verb, adv);
    }
}
