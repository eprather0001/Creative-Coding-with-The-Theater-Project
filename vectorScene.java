import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;

public class vectorScene extends Scene {
  private Villain vector;

  public vectorScene() {
    vector = new Villain("OIP-removebg-preview.png", "HAHA I FINALLY", "STOLE THE", "PYRAMID!");
  }

  public void drawScene() {
    drawImage("vectorBackground.jpg", 0, 0, getWidth());
    drawImage(vector.getImage(), 80, 215, 150);
    drawThoughtbubble();
    setTextHeight(12);
    drawText(vector.getThought1(), 192, 166);
    drawText(vector.getThought2(), 205, 188);
    drawText(vector.getThought3(), 210, 210);

    pause(1);
  }

  private void drawThoughtbubble() {
    setFillColor("white");
    
    drawImage("LeftSpeechBubble.png", 110, 70, 250);
  }

}
