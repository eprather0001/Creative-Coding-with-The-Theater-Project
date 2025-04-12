public class Villain {

  private String imageFile;
  private String thought1;
  private String thought2;
  private String thought3;

  public Villain(String imageFile, String thought1, String thought2, String thought3) {
    this.imageFile = imageFile;
    this.thought1 = thought1;
    this.thought2 = thought2;
    this.thought3 = thought3;
  }


  public String getImage() {
    return imageFile;
  }

  public String getThought1() {
    return thought1;
  }

  public String getThought2() {
    return thought2;
  }

   public String getThought3() {
    return thought3;
  }
}
