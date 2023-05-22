import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends World
{

    GreenfootSound backgroundMusic = new GreenfootSound("BitShift.mp3");
    
    public Screen(int width, int height, int pixels)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height, pixels);
        backgroundMusic.setVolume(40);
        
    }
    
    
    public void reset(){
        //left blank as stages will have own versions
    }
}
