/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */

import java.util.Scanner;

public class EX08 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("How many people?");
        int ppl = input.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizza = input.nextInt();

        System.out.println("How many slices per pizza?");
        int slices = input.nextInt();

        int ttlslices = pizza*slices;
        int ttl = (ttlslices/ppl)  ;
        int left = ttlslices - (ttl*ppl);

        System.out.println(ppl + " people with "+ pizza + " pizzas " +"(" + ttlslices + " slices"+")");
        System.out.println("Each person gets " + ttl + " pieces of pizza");
        System.out.println("There are " + left + " leftover pieces");





    }
}
