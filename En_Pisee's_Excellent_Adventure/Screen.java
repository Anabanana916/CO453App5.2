import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


/**
 * This code defines a class named "Screen" that extends the "World" class.
 * It contains a static variable "backgroundMusic" of type "GreenfootSound" and initializes it with the sound file "BitShift.mp3".
 * 
 * The class constructor takes three integer parameters: width, height, and pixels.
 * It creates a new world with the specified width, height, and pixels as the cell size.
 * 
 * Inside the constructor, it checks if the background music is not currently playing.
 * If the music is not playing, it starts playing the background music in a loop and sets the volume to 0 (mute).
 */

public class Screen extends World
{

    private static GreenfootSound backgroundMusic = new GreenfootSound("BitShift.mp3");
    public Screen(int width, int height, int pixels)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height, pixels);
        
        
        if (!backgroundMusic.isPlaying()){
            backgroundMusic.playLoop();
            backgroundMusic.setVolume(20);
        }
        
    }
    
    
    public void reset(){
        //left blank as stages will have own versions
    }
}
