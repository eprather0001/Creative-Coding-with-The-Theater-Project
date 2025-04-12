import org.code.theater.*;
import org.code.media.*;

public class endScene extends Scene{
  private Villain end;

  public endScene() {
     
  }
  public void drawScene() {
    clear("white");
    drawText("THE END", 150, 200);
    playSound("all-minions-cheering-101soundboards.wav");
    drawImage("gruStealingMoon.jpg", 0, 0, getWidth(), getHeight(), 0);
  }
}
