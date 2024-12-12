
import java.util.Random;
import simplegraphics.SimpleGraphics;
import simplegraphics.shapes.*;

public class SGRandomWalk 
{
    public static void main(String[] args) 
    {
        SimpleGraphics sg = new SimpleGraphics("Random Walk", 300, 300);
        Rectangle field = new Rectangle(0, 0, 300, 300);
        field.setColor(200, 200, 200);
        field.fill();

        Ellipse boundaryCircle = new Ellipse(50, 50, 200, 200);
        boundaryCircle.setColor(0, 0, 0);
        boundaryCircle.draw();

        Ellipse walker = new Ellipse(145, 145, 10, 10);
        walker.setColor(0, 0, 255);
        walker.fill();

        Random random = new Random();
        int x = 150, y = 150;
        int steps = 0;

        while (Math.sqrt(Math.pow(x - 150, 2) + Math.pow(y - 150, 2)) <= 100) 
        {
            int deltaX = random.nextInt(21) - 10;
            int deltaY = random.nextInt(21) - 10;

            x += deltaX;
            y += deltaY;

            walker.translate(deltaX, deltaY);

            try { Thread.sleep(100);}
            catch(Exception ex) {};

            steps++;
        }

        System.out.println("Steps to escape: " + steps);
    }
}


