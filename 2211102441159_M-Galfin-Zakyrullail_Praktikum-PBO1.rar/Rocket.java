import greenfoot.*;

public class Rocket extends Actor 
{
    public void act() 
    {if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 10);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 10);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 10, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 10, getY());
        }
    }
}

