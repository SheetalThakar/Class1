/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bead;

/**
 *
 * @author mehta
 */
public class BeadTester {
    
    public static void main(String[] args)
    {
        Bead b1=new Bead("Purple",'S');
        Bead b2=new Bead();
        
        b2.setColor("Red");
        b2.setLetter('H');
        
        //Array of Objects
        //int[] temp=new int[7];
        Bead[] b=new Bead[7];
        b[0]=b1;
        b[1]=b2;
        b[2]=new Bead();
        
        //Print color and Letter
        for(int i=0;i<3;i++)
        {
            //System.out.println(b[i]); - It will print hash value.
            System.out.println(b[i].getColor());
            System.out.println(b[i].getLetter());
        }
    }
    
}
