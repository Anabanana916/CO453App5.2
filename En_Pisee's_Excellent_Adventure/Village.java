import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Village here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Village extends Screen
{
    int i = 0;
    private EnPisee testEnPisee;
    private Buttons op1Button; // Rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    
    /**
     * Constructor for objects of class Village.
     */
    public Village()
    {
        // Constructor for the 'Village' class
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Call the 'createButtons()' method to create buttons
        createButtons();
        
        // Print the introduction and choices for the village scenario to the console
        System.out.println("You, in a world of dragons and knights in shining armor, find yourself in a village.");
        System.out.println("The village people are tired and ragged. Labouring long hours to appease the great,");
        System.out.println("blue dragon who oversees the village. It demands that all food and precious materials");
        System.out.println("of the village be given to them. The villagers are barely able to keep themselves alive");
        System.out.println("whilst keeping the dragon from killing them all.");
        System.out.println("1) 'No, seriously. WTF are you?'");
        System.out.println("2) Take pity on the villagers");
        System.out.println("3) Sympathize with the villagers");
        System.out.println("4) Look at them in disgust");
        System.out.print(">  ");
        
        createEnPisee();
        
        // Check if the value of 'i' is 5
        if (i == 5) {
            // NPC leaves ending
            System.out.println("Ok! That does it!! If you're just going to be rude! I won't tell you my excellent story.");
            System.out.println("Goodbye!!");
            // gameOver();
        }
    }
    
    public void createButtons() {
        // Method to create buttons
        
        // Create an instance of the 'Buttons' class named 'op1Button' with the image "Option1.png"
        op1Button = new Buttons("Option1.png");
        // Add the 'op1Button' object to the world at coordinates (100, 475)
        addObject(op1Button, 100, 475);
        
        // Create an instance of the 'Buttons' class named 'op2Button' with the image "Option2.png"
        op2Button = new Buttons("Option2.png");
        // Add the 'op2Button' object to the world at coordinates (100, 540)
        addObject(op2Button, 100, 540);
        
        // Create an instance of the 'Buttons' class named 'op3Button' with the image "Option3.png"
        op3Button = new Buttons("Option3.png");
        // Add the 'op3Button' object to the world at coordinates (275, 475)
        addObject(op3Button, 275, 475);
        
        // Create an instance of the 'Buttons' class named 'op4Button' with the image "Option4.png"
        op4Button = new Buttons("Option4.png");
        // Add the 'op4Button' object to the world at coordinates (275, 540)
        addObject(op4Button, 275, 540);
    }
    
    public void act() {
        // Method executed continuously during the game
        
        // Check if the mouse click occurred on the 'op1Button' object
        if (Greenfoot.mouseClicked(op1Button)) {
            // Print "OPTION 1 SELECTED" to the console
            System.out.println("OPTION 1 SELECTED");
            System.out.println("1)'No, seriously. WTF are you?'");
            
            // Increment the value of 'i' by 1
            i = i + 1;
            
            // Transition to the 'Weapons' world by setting the world to a new instance of 'Weapons'
            Greenfoot.setWorld(new Weapons());
        }
        
        // Check if the mouse click occurred on the 'op2Button' object
        if (Greenfoot.mouseClicked(op2Button)) {
            // Print "OPTION 2 SELECTED" to the console
            System.out.println("OPTION 2 SELECTED");
            System.out.println("2) Take pity on the villagers");
            
            // Set the value of 'i' to 6
            i = 6;
            
            // Transition to the 'Weapons' world by setting the world to a new instance of 'Weapons'
            Greenfoot.setWorld(new Weapons());
        }
        
        // Check if the mouse click occurred on the 'op3Button' object
        if (Greenfoot.mouseClicked(op3Button)) {
            // Print "OPTION 3 SELECTED" to the console
            System.out.println("OPTION 3 SELECTED");
            System.out.println("3) Sympathize with the villagers");
            
            // Set the value of 'i' to 6
            i = 6;
            
            // Transition to the 'Weapons' world by setting the world to a new instance of 'Weapons'
            Greenfoot.setWorld(new Weapons());
        }
        
        // Check if the mouse click occurred on the 'op4Button' object
        if (Greenfoot.mouseClicked(op4Button)) {
            // Print "OPTION 4 SELECTED" to the console
            System.out.println("OPTION 4 SELECTED");
            System.out.println("4) Look at them in disgust");
            
            // Set the value of 'i' to 6
            i = 6;
            
            // Transition to the 'Weapons' world by setting the world to a new instance of 'Weapons'
            Greenfoot.setWorld(new Weapons());
        }
    }
    
    public void createEnPisee() {
        // Method to create the EnPisee character
        
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPChappy.png"
        testEnPisee = new EnPisee("NPCRightArm.png");
        
        // Add the 'testEnPisee' object to the world at coordinates (400, 300)
        addObject(testEnPisee, 400, 300);
    }
}
