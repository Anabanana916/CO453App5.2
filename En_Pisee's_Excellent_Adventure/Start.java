
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The `Start` class represents the starting point of the game. It initializes and connects all the game worlds and screens together.
 * It extends the `Screen` class, which is the base class for all the game screens.
 * 
 * The class contains instances of various game worlds and screens, such as `Main`, `Intro`, `Village`, `Weapons`, and more.
 * It creates and configures the buttons and characters in each world/screen.
 * 
 * The `Start` class serves as the entry point of the game, where the `Main` world is set as the initial world.
 */
public class Start extends Screen
{
    public Main main;
    public Intro intro;
    public Village village;
    public Weapons weapons;
    public OldCrone oldCrone;
    public River river;
    public Bomb bomb;
    public Climb climb;
    public Cave cave;
    public Dragon dragon;
    
    public Challenge1 challenge1;
    public Challenge2 challenge2;
    public Challenge3 challenge3;
    
    public NeutralEnd neutralEnd;
    public Gameover gameover;
    
    public Sneak1 sneak1;
    public Sneak2 sneak2;
    public Sneak3 sneak3;
    public EvilEnding evilEnding;
    
    public Start()
        {
            super(800, 600, 1);
            
            main = new Main();
            intro = new Intro();
            village = new Village();
            weapons = new Weapons();
            oldCrone = new OldCrone();
            river = new River();
            bomb = new Bomb();
            climb = new Climb();
            cave = new Cave();
            dragon = new Dragon();
            challenge1 = new Challenge1();
            challenge2 = new Challenge2();
            challenge3 = new Challenge3();
            neutralEnd = new NeutralEnd();
            gameover = new Gameover();
            evilEnding = new EvilEnding();
            sneak1 = new Sneak1();
            sneak2 = new Sneak2();
            sneak3 = new Sneak3();
            
            main.createButtons();
            
            gameover.createButtons();
            gameover.createEnPisee();
            
            intro.createButtons();
            intro.createEnPisee();
            
            village.createButtons();
            village.createEnPisee();
            
            weapons.createButtons();
            weapons.createEnPisee();
            
            oldCrone.createButtons();
            oldCrone.createEnPisee();
            
            oldCrone.createPlayerWeapon();
            
            river.createButtons();
            river.createEnPisee();
            river.createPlayerWeapon();  
        
            bomb.createButtons();
            bomb.createEnPisee();
            bomb.createPlayerWeapon();  
        
            climb.createButtons();
            climb.createEnPisee();
            climb.createPlayerWeapon();  
        
            cave.createButtons();
            cave.createEnPisee();
            cave.createPlayerWeapon();  
        
            dragon.createButtons();
            dragon.createEnPisee();
            dragon.createPlayerWeapon();  
        
            challenge1.createButtons();
            challenge1.createEnPisee();
            challenge1.createPlayerWeapon();  
        
            challenge2.createButtons();
            challenge2.createEnPisee();
            challenge2.createPlayerWeapon();  
        
            challenge3.createButtons();
            challenge3.createEnPisee();
            challenge3.createPlayerWeapon();  
        
            sneak1.createButtons();
            sneak1.createEnPisee();
            sneak1.createPlayerWeapon();  
        
            sneak2.createButtons();
            sneak2.createEnPisee();
            sneak2.createPlayerWeapon();  
        
            sneak3.createButtons();
            sneak3.createEnPisee();
            sneak3.createPlayerWeapon();
            sneak3.createItems(); 
        
            neutralEnd.createButtons(main);
            neutralEnd.createEnPisee();
        
            evilEnding.createButtons(main);
            evilEnding.createEnPisee();
        
            Greenfoot.setWorld(main);
        }
    
    }