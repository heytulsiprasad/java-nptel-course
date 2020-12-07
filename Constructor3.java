class Foo {
  void baz() {
    System.out.println("Baz logged");
  }

  void bar() {
    System.out.println("Bar logged");
    this.baz();
  }
}

class Constructor3 {
  public static void main(String args[]) {
    Foo foo = new Foo();
    foo.bar();
  } 
}
