public class Order {
  String orderName;
  boolean isFilled;
  double billAmount;
  String shipping;

  public Order(String name, boolean filled, double cost, String shippingMethod) {
    System.out.println("---------------------------------------\n");
    System.out.println("ORDER: " + name);
		if (cost > 24.00) {
      System.out.println("Order Price: High");
    } else {
      System.out.println("Order Price: Low");
    }
    orderName = name;
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }

  public void ship() {
    if (isFilled) {
      System.out.println("Order Status: Shipped");
    } else {
      System.out.println("Order Status: Not ready yet");
    }

    double shippingCost = calculateShipping();

    System.out.print("Shipping Cost: ");
    System.out.println(shippingCost + "\n");
  }

  public double calculateShipping() {
    double shippingCost;
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":
        shippingCost = 1.75;
        break;
      default:
        shippingCost = .50;
    }
    return shippingCost;
 	}

  public static void main(String[] args) {
    // create instances and call methods here!

  Order biologyOrder = new Order("Biology Coursebook", true, 15.99, "Express");

  biologyOrder.ship();

  Order ChemistryOrder = new Order("Chemistry Lab Notebook", false, 36.00, "Regular");

  ChemistryOrder.ship();

  Order PhysicsOrder = new Order("Physics Coursebook and Lab Manual", true, 10.00, "Express");

  PhysicsOrder.ship();
  }
}
