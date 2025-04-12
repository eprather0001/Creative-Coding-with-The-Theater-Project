import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    vectorScene scene = new vectorScene();
    gruScene museum = new gruScene();
    moonScene moon = new moonScene();
    moonScenePt2 moon2 = new moonScenePt2();
    endScene end = new endScene();
    
    scene.drawScene();
    museum.drawScene();
    moon.drawScene();
    moon2.drawScene();
    end.drawScene();

    Theater.playScenes(scene, museum, moon, moon2, end);
 
  }
}
