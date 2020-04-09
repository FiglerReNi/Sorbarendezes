/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Csokkeno {
    public static void main(String[]args){
        int[] a=new int[31];
        int b;
        for(int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*27)+12;
            System.out.print(a[i]+" ");
        }
        for(int i=0; i<a.length; i++){
            for(int j=(a.length-1); j>i; j--){
                if(a[j-1]<a[j]){
                    b=a[j-1];
                    a[j-1]=a[j];
                    a[j]=b;
                }
            }           
        }
        System.out.println();
        System.out.println("Csökkenő sorrend: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
