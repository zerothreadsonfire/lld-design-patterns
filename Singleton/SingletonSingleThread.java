import java.util.*;

class SingletonSingleThread {
  public static void main(String[] args) {
    SingletonSingleThread obj = new SingletonSingleThread();

    Singleton s1 = Singleton.getInstance("hello");
    Singleton s2 = Singleton.getInstance("world");

    System.out.println(s1.data);
    System.out.println(s2.data);
  }
}

class Singleton {
  static Singleton instance;
  String data;

  private Singleton(String data) {
    this.data = data;
  }

  Singleton getInstance(String data) {
    if(instance == null) instance = new Singleton(data);
    return instance;
  }
}
