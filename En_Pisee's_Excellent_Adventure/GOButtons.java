import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GOButtons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GOButtons extends Actor
{
    /**
     * Act - do whatever the GOButtons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Screen link;
    
    public GOButtons(String image, Screen link){
        setImage(new GreenfootImage(image));
        this.link = link;
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }
    }
}
