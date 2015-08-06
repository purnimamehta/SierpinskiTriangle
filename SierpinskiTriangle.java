import javax.swing.*;
import java.applet.Applet; 
import java.awt.*; 

public class SierpinskiTriangle  extends Applet 
{ 
  int n = 0; //Declare your variables out here. This is a “global” variable

 public void init () { //Init is a method that runs before you paint
 //This line makes the option pane appear.
 
 String input = JOptionPane.showInputDialog ("Enter a number between 1 and 10:");

 //This line takes the string and makes it into a number
 // so that you can use it.
 n = Integer.parseInt (input);
} 
  public void paint(Graphics g) 
  { 
    triangle (n,598,337,200);
  }
  public void triangle(double n, double x,double y, double size) 
  {
    try
    {
      Graphics g= getGraphics();
      if (n < 1) 
        return;
      else 
      {      
      int xArray [] = {((int)(x)),((int)(x+(size/2))),((int)(x+size)),((int)(x))};
      int yArray [] = {((int)(y)),((int)(y+size)),((int)(y)),((int)(y))};    
      g.fillPolygon (xArray,yArray,4);
      triangle((n-1),x+(size/4),y-(size/2),(size/2));
      triangle((n-1),x-(size/4),y+(size/2),(size/2));
      triangle((n-1),x+((size*3)/4),y+(size/2),(size/2));             
      } 
    }    
    catch (Exception e)
    {      
    }
  }
}