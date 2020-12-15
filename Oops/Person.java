package Oops;

import Oops.interfaces.Student;
import Oops.interfaces.YouTuber;

public class Person implements Student, YouTuber {
  public static void main(String[] args) {
    Person p = new Person();
    p.study();
    p.makeVideo();
  }

  public void study() {
    System.out.println("Person is studying");
  }

  public void makeVideo() {
    System.out.println("Person is making a good video");
  }
}
