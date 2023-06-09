import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OldCrone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OldCrone extends Screen
{

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    public OldCrone()
    {
        super(800, 600, 1);
    }
    
    public void createButtons(Screen link) {
        op1Button = new Buttons("Option1.png", link);
        addObject(op1Button, 100, 475);
        
    }
    
    public void createGOButtons(Screen link) {
        op2Button = new Buttons("Option2.png", link);
        addObject(op2Button, 100, 540);

    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPC.png");
        addObject(testEnPisee, 400, 300);
    }
    
    public void createPlayerWeapon() {
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        addObject(testPlayerWeapon, 500, 500);
    }

}
