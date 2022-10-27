package interfaces;

interface Account {
  public default String getId() {

    return "0000";
  }
}

interface PremiumAccount extends Account {
  public String getId();
}

public class DefaultMethodAndSignatureTest implements PremiumAccount, Account {
  public static void main(String[] args) {

    Account acct = new DefaultMethodAndSignatureTest();
    System.out.println(acct.getId());
  }

  @Override
  public String getId() {
    return "null";

  }
}