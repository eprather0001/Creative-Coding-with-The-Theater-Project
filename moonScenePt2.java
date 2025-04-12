import org.code.theater.*;
import org.code.media.*;

public class moonScenePt2 extends Scene{
  private Villain moon2;
 
  
  public moonScenePt2() { 
    moon2 = new Villain("download-removebg-preview.png","YAYYY", "I SHRUNK THE", "MOON!!");
  }
 public void drawScene() {
   clear("black");
   // drawImage("moonScenePt2.jpeg", 0, 0, getWidth(), getHeight(), 0);
   drawImage(moon2.getImage(), 10, 95, 100);
   drawImage("download__1_-removebg-preview.png", 195, 195, 200);
   drawMoon();
   drawThoughtbubble();
   drawText(moon2.getThought1(), 90, 60);
   drawText(moon2.getThought2(), 65, 80);
   drawText(moon2.getThought3(), 90, 100);
   pause(1);
   
  }

   private void drawThoughtbubble() {
    setFillColor("white");

    drawEllipse(50, 20, 160, 100);


    }

public void drawMoon(){
  setFillColor("gray");

  drawEllipse(240, 40, 20, 20);

}
  
}
