import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;

public class gruScene extends Scene {

  private Villain gru;

  public gruScene() {
    gru = new Villain("gruImage-removebg-preview.png", "I STOLE", "THE SHRINK", "RAY!!");
  }

  public void drawScene() {
    clear("white");
    drawImage("sciencelabimage.jpg", 0, 0, getWidth(), getHeight(), 0);
    drawImage(gru.getImage(), 40, 95, 150);
    drawImage("kevinminion-removebg-preview.png", 150, 260, 140);
    drawImage("bobminion-removebg-preview.png", 220, 300, 100);
    drawImage("stuart-removebg-preview.png", 262, 290, 150);
    drawThoughtbubble();
    setTextHeight(13);
    drawText(gru.getThought1(), 212, 110);
    drawText(gru.getThought2(), 200, 135);
    drawText(gru.getThought3(), 220, 160);
    
    pause(1);
  }

  private void drawThoughtbubble() {
    setFillColor("white");

    drawImage("LeftSpeechBubble.png", 90, 0, 289);
  }
 


 
}
