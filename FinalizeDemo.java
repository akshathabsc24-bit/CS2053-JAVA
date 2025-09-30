class Class1 {
  Class1() {
    System.out.println("Object created");
  }

  protected void finalize() {
    System.out.println("finalize() method called before object is destroyed");
  }
}

public class FinalizeDemo {
  public static void main(String[] args) {
    Class1 obj = new Class1(); // Object created
    obj = null;                // Dereference the object
    System.gc();               // Suggest garbage collection
  }
}

