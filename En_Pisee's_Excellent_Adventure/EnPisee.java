import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnPisee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnPisee extends Actor
{
    /**
     * Act - do whatever the EnPisee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public EnPisee(String imageName){
        setImage(imageName);
        GreenfootImage image = getImage();
        setImage(new GreenfootImage(image));
        image.scale(image.getWidth() * 3, image.getHeight() * 3 );
        setImage(image);
    }
}
