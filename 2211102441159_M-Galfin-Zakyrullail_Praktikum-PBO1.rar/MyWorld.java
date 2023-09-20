import greenfoot.*;
public class MyWorld extends World {
    public MyWorld() {    
        super(800, 600, 1);  
        addObject(new Rocket(),getWidth() / 2, getHeight() / 2);
    }
}
