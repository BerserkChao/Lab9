import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    public MyWorld()
    {    
        super(768, 576, 1, false);

        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; // seems to be the default
        prepare();
    }

    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CannonBall cannonBall = new CannonBall();
        addObject(cannonBall,112,103);
        CannonBall cannonBall2 = new CannonBall();
        addObject(cannonBall2,318,43);
        CannonBall cannonBall3 = new CannonBall();
        addObject(cannonBall3,465,128);
        CannonBall cannonBall4 = new CannonBall();
        addObject(cannonBall4,661,52);
        cannonBall3.setLocation(461,119);
        cannonBall3.setLocation(466,129);
        removeObject(cannonBall3);
        removeObject(cannonBall2);
        removeObject(cannonBall);
        removeObject(cannonBall4);
        Cannon cannon = new Cannon();
        addObject(cannon,171,402);
        target target = new target();
        addObject(target,431,126);
        target target2 = new target();
        addObject(target2,567,179);
        target target3 = new target();
        addObject(target3,611,319);
        target target4 = new target();
        addObject(target4,563,462);
    }
}
