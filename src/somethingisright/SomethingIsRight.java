/*
 * Something Is Right
 */
package somethingisright;

import java.awt.Rectangle;//Import java.awt.Rectangle;

/**
 * Something is right
 * @author Doru
 */
public class SomethingIsRight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();//Create the 'Rectangle' object;
        myRect.width = 40;
        myRect.height = 50;
        int area = myRect.width*myRect.height;//Create the integer 'area';
        System.out.println("myRect's area is " + area);//Modifed the 'myRect.area()'in 'area';
    }
    
}
