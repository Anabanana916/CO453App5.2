import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends Screen {
    private EnPisee testEnPisee;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;
    
    
    public Intro()
    {
        super(800, 600, 1);
        System.out.println("Hi!");
        System.out.println("My name is En Pisee! And this is my game! I will be your narrator for this adventure.");
        System.out.println("You! Will be the hero of my story! Making challenging choices, taking horrifying risks,");
        System.out.println("and hopefully defeating the evil dragon and beat my game!!");
        System.out.println("Are you up for the challenge?");
        System.out.println("1) 'Heck yes!!'");
        System.out.println("2) 'WTF are you??'");
        System.out.print("> ");
        createEnPisee();
        createButtons();
        
    }
    
        
    
    public void createButtons() {
        
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 475);
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 540);
        
        // Print out the introduction text


        // Handle button clicks

    }
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            System.out.println("OPTION 1 SELECTED");
            Greenfoot.setWorld(new Village());
        }
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            Greenfoot.setWorld(new Village());
        }
    }
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPChappy.png");
        addObject(testEnPisee, 400, 300);
    }
}