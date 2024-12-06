package _02_04;

import java.nio.file.FileAlreadyExistsException;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  // Add three methods to set the value of each field, called setDestination,
  // setPrice and setIsReturn.
  /**
   * Set the destination on this ticket object.
   * 
   * @param dest The string representing ticket destination.
   */
  public void setDestination(String dest) {
    destination = dest;
  }

  /**
   * Set the price of the ticket
   * 
   * @param pr the double value of price.
   */
  public void setPrice(double pr) {
    price = pr;
  }

  /**
   * Set the Is-return value if the ticket it round-trip.
   * @param value Boolean whether the ticket is round-trip
   */
  public void setIsReturn(Boolean value) {
    isReturn = value;
  }

  // Add a separate method to get the value of each field, called getDestination,
  // getPrice and getIsReturn.

  /**
   * The destination on the ticket
   * 
   * @return String representing the Destination on the ticket.
   */
  public String getDestination() {
    return destination;
  }

  /**
   * Retrieve the price of the ticket.
   * 
   * @return double value of the price.
   */
  public double getPrice() {
    return price;
  }

  /**
   * Get the round-trip status of the ticket
   * 
   * @return True if the ticket is round-trip.
   */
  public Boolean getIsReturn() {
    return isReturn;
  }

  /**
   * Sample executable to test basic functions.
   * @param args
   */
  public static void main(String[] args) {
    Ticket t = new Ticket();
    t.setDestination("Seattle");
    t.setPrice(500.00);
    t.setIsReturn(false);

    System.out.println("Ticket: {" + t.getDestination() + ", " + t.getPrice() + ", " + t.getIsReturn() + "}");
  }
}
