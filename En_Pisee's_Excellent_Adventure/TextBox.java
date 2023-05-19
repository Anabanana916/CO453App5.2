import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TextBox extends Actor
{
    public TextBox(String text){
        GreenfootImage img = new GreenfootImage(text.length()*200, 300);
        img.setColor(Color.BLACK);
        img.drawString(text, 20, 200);
        setImage(img);
    }
    
    public void setText(String text){
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(text, 20, 200);
        //updates text
    }
    
}

