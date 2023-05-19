import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NeutralEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NeutralEnd extends Screen
{

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    
    public NeutralEnd()
    {
        super(800, 600, 1);
        showText("You leap into the maw of the Dragon. He swallows you whole and you feel", 400, 20);
        showText("yourself slide down the gullet of the beast. You don't have much time.", 400, 40);
        showText("You use all of your remaining strength to slice and cut the innards of", 400, 60);
        showText("the Dragon. You hear their muffled screams of pain, their cries of pain", 400, 80);
        showText("slowly being turned into gargled screams as blood fills their lungs.", 400, 100);
        showText("You slew the beast and eventually cut your way out. You saved the village", 400, 120);
        showText("and lived to tell the tale. Thanks to you, the village thrives. Your", 400, 140);
        showText("story is shared across the land, a statue erected in the village square,", 400, 160);
        showText("and you are heralded as a hero.Thank you for playing my game. I hope", 400, 180);
        showText("to see you again for another story soon.", 400, 200);
        
        createEnPisee();
    }
    
    public void createButtons(Screen main) {
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 475);
        
    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCvhappy.png");
        addObject(testEnPisee, 600, 300);
    }

}
