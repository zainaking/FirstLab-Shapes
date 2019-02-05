
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Square trunk;
    private Triangle tree;
    private Square trees;
    private Square stalk;
    private Circle treeL;
    private Triangle tree2;


    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(100);
        wall.changeSize(100, 100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.changeSize(30, 100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(40, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(100);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(200);
        sun.moveVertical(-12);
        sun.changeSize(60);
        sun.makeVisible();
        sun2 = new Circle();
        
        trunk = new Square();
        trunk.moveVertical(100);
        trunk.moveHorizontal(100);
        trunk.changeColor("black");
        trunk.changeSize(20, 100);
        trunk.makeVisible();
        
        tree = new Triangle();
        tree.changeSize(50, 140);
        tree.moveHorizontal(200);
        tree.moveVertical(100);
        tree.changeColor("green");
        tree.makeVisible();
        tree2 = new Triangle();
        
        
        
       
       
        trunk.moveVertical(300);
        trunk.moveHorizontal(100);
        trunk.changeColor("black");
        trunk.changeSize(20, 100);
        trunk.makeVisible();
        
        trees = new Square();
        trees.moveVertical(300);
        trees.moveHorizontal(500);
        trees.changeColor("black");
        trees.changeSize(20, 100);
        trees.makeVisible();
        
        stalk = new Square();
        stalk.changeColor("black");
        stalk.moveHorizontal(175);
        stalk.moveVertical(100);
        stalk.makeVisible();
        stalk.changeSize(10, 100);
        stalk.makeVisible();
        
        treeL = new Circle();
        treeL.changeSize(50);
        treeL.moveHorizontal(200);
        treeL.moveVertical(-180);
        treeL.changeColor("black");
        treeL.makeVisible();
        
        
        
        
   
        
        
       }

    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
