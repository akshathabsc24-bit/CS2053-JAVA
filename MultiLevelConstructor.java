class Bank {
   Bank() {
     System.out.println("Bank Constructor Called");
  }
}

class Branch extends Bank {
   Branch() {
     System.out.println("Branch Constructor Called");
  }
}

class Account extends Branch {
  Account() {
    System.out.println("Account Constructor Called");
  }
}

public class MultiLevelConstructor {
  public static void main(String[] args) {
    System.out.println("Creating Account...");
    Account acc = new Account();
  }
}