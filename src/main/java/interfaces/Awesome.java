package interfaces;

interface MyInt {
  String value = "amazing";


  void amazingMethod(String arg);
}

abstract class MyClass {
  static String value = "awesome";

  abstract void amazingMethod(String arg1, String arg2);
}

public class Awesome extends MyClass implements MyInt {
// sem HIDEAMENTO HAVERA "CLASH DAS STATIC FIELDS DE MY-CLASS E MYINT

  public void amazingMethod(String arg1) {

  }

  public void amazingMethod(String arg1, String arg2) {

  }

  public void main(String[] args) {

    MyInt ai = new Awesome();

    //System.out.println(value);
  }
}