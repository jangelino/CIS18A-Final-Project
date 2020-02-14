//==============================The Lunch class======================================
package restaurantpack;

public class Lunch {
  protected int itemNum;
  protected String dishName;
  protected double price;

  public Lunch(int i, String n, double p) { 					//set method
    itemNum = i;
    dishName = n;
    price = p;
  }

  public double getPrice() {						//get method
    return price;
  }

  public int getItemNum() {						//get method
    return itemNum;
  }

  public void showDish() {						//show method
    System.out.println(itemNum + ": " + dishName + "  $" + price);
  }

  public String toString() {						//show method
    return itemNum + ": " + dishName + "  $" + price;
  }
}