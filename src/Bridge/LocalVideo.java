package Bridge;

public class LocalVideo implements VideoSource{
  @Override
  public void playVideo() {
    System.out.println("Воспроизведение локального видео");
  }
}
