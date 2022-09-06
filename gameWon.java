import java.awt.*;

public class gameWon {
    public void render(Graphics g){
        //this will allow us to draw out our rectangle
        Graphics2D twoD = (Graphics2D) g;
        //this is just the font we will be using it can be change whenever
        Font fnt0 = new Font("Kristen ITC", Font.BOLD,50);
        //setting font
        g.setFont(fnt0);
        //color of font
        g.setColor(Color.white);
        //what we are going to display
        g.drawString("Congratulations", Game.width/2+70,325);
        g.drawString("You Survived!", Game.width/2+100,425);
    }
}
