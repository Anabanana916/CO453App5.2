import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerWeapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerWeapon extends Actor
{
    /**
     * Act - do whatever the PlayerWeapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public PlayerWeapon(String imageName){
        setImage(imageName);
        GreenfootImage image = getImage();
        setImage(new GreenfootImage(image));
        image.scale(image.getWidth() * 1, image.getHeight() * 1 );
        setImage(image);
    }
}
