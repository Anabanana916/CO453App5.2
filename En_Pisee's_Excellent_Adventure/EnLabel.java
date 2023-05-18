import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnLabel extends Actor
{
    public EnLabel(String text)
    {
        GreenfootImage img = new GreenfootImage (text.length()*20, 30);
        img.drawString (text, 2, 30);
        setImage (img);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
