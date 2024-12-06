package _02_03b;

public class Ticket {
  public Ticket() {

  }

  public String destination;
  public double price;
  public Boolean isReturn;

  public static void main(String[] args) {
    Ticket t = new Ticket();
    t.destination = "Seattle";
    t.price = 210.99;
    t.isReturn = true;

    System.out.println(t.destination + " " + t.price + " " + t.isReturn);
  }

}
