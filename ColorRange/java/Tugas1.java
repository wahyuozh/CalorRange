/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColorRange.java;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan panjang gelombang : ");
        int waveleght = input.nextInt();
         
        if (waveleght >= 380 && waveleght < 450) {
        System.out.println("The color is Violet"); }
        else if (waveleght >=450 && waveleght <495) {
        System.out.println("The color is Blue"); }
        else if (waveleght >=495 && waveleght <570) {
        System.out.println("The color is Green");}
        else if (waveleght >=570 && waveleght <590) {
        System.out.println("The color is Yellow");}
        else if (waveleght >=590 && waveleght <620) {
        System.out.println("The color is orange");}
        else if (waveleght >=620 && waveleght <750) {
        System.out.println("The color is red"); }
        
        else 
        System.out.println ("The entered wavelength is not a part of the visible spectrum");
    
        {
            
        }}
        }


                
        

    

        
        
     