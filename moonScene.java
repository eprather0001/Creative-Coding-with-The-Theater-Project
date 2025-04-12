import org.code.theater.*;
import org.code.media.*;

public class moonScene extends Scene{
  private Villain moon;
 
  
  public moonScene() { 
    moon = new Villain("download-removebg-preview.png","NOW I WILL", "STEAL THE", "MOON!!");
  }
 public void drawScene() {
   clear("black");
   // drawImage("moonScene.jpeg", 0, 0, getWidth(), getHeight(), 0);
   drawImage(moon.getImage(), 10, 95, 100);
   drawImage("download__1_-removebg-preview.png", 195, 195, 200);
   drawMoon();
   drawThoughtbubble();
   drawText(moon.getThought1(), 72, 60);
   drawText(moon.getThought2(), 74, 80);
   drawText(moon.getThought3(), 90, 100);
   pause(1);
   
   drawImage("explosionImage-removebg-preview.png", 210, 0, 200);
   playSound("explosion-312361.wav");
   pause(2);

  }

   private void drawThoughtbubble() {
    setFillColor("white");

    drawEllipse(50, 20, 160, 100);


    }

public void drawMoon(){
  setFillColor("gray");

  drawEllipse(240, 5, 150, 150);

}
  
}
