/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackelements;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class StackElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        Stack p = new Stack(5);
        char letter;
        int i, j, num;

        System.out.println("Enter 5 letters in the stack: ");
        for (i = 0; i < 5; i++) {
            letter = in.next().charAt(0);
            p.push(letter);
            p.toPrint();
        }
        System.out.print("Enter how many letters you want to remove from the stack: ");
        num = in.nextInt();
        for (j = 0; j < num; j++) {
            p.pop();
        }
        p.toPrint();
        p.consultTop();
        
    }
}
