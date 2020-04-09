/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Sorbarendezes {
    public static void main(String[]args){
        int[] a=new int[20];
        boolean bennevan;
        int b=0;
        int szam;
        while(b<20){
            szam=(int)(Math.random()*31)+45;
            bennevan=false;
            for(int i=0; i<a.length; i++){
            if(szam==a[i]){
                bennevan=true;
            }
            }
            if(bennevan==false){
                a[b]=szam;
                b++;
            }
    }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Sorrendben: ");
        int c;
        for(int i=0; i<(a.length-1); i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    c=a[i];
                    a[i]=a[j];
                    a[j]=c;                  
                }
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }   
}
