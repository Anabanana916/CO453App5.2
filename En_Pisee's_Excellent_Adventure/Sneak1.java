import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sneak1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sneak1 extends Screen
{

    private EnPisee testEnPisee;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    
    public Sneak1()
    {
        super(800, 600, 1);
        System.out.println("You get behind the dragon, but you knock over some coins! The sound causes the dragon");
        System.out.println("to raise it's head suddenly and start looking around.");

        System.out.println("1) Freeze");
        System.out.println("2) Hide");
        System.out.println("3) Say Hi");
        
        createButtons();
    }
    
    public void createButtons() {
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 475);
        
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 540);
        
        op3Button = new Buttons("Option3.png");
        addObject(op3Button, 275, 475);
        
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            System.out.println("OPTION 1 SELECTED");
            System.out.println("You once heard that a dragon's vision is based on movement.");
            System.out.println("You heard wrong.");
            System.out.println("The Dragon crushes you with it's tail.");
            Greenfoot.setWorld(new Gameover());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You duck behind a pile of treasure. The Dragon takes a moment, before return to it's");
            System.out.println("rest.");
            //Greenfoot.setWorld(new Sneak2());
        }
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("The Dragon looks at you, bewildered. Then smiles.");
            System.out.println("'Goodbye.'");
            System.out.println("It blasts you with it's lightening breath.");
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCvhappy.png");
        addObject(testEnPisee, 200, 200);
    }
}
