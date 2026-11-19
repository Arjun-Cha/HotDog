public class HotDog {
 
   public long printMenu() {
   
      long count = 0;
      
      for (int targetToppings = 0; targetToppings <= 7; targetToppings++) {
         for (int ketchup = 0; ketchup <= 1; ketchup++) {
            for (int mustard = 0; mustard <= 1; mustard++) {
               for (int onions = 0; onions <= 1; onions++) {
                  for (int tomato = 0; tomato <= 1; tomato++) {
                     for (int relish = 0; relish <= 1; relish++) {
                        for (int peppers = 0; peppers <= 1; peppers++) {
                           for (int kraut = 0; kraut <= 1; kraut++) {
                              int currentToppings = ketchup + mustard + onions + tomato
                                    + relish + peppers + kraut;

                              if (currentToppings == targetToppings) {
                                 
                                 String description = "Dog in Bun";
                                 int totalCents = 99;
                                 boolean firstTopping = true;
                                 if (ketchup == 1) {
                                    description += (firstTopping ? " with " : ", ") + "Ketchup";
                                    totalCents += 15;
                                    firstTopping = false;
                                 }
                                
                                 if (mustard == 1) {
                                    description += (firstTopping ? " with " : ", ") + "Mustard";
                                    totalCents += 17;
                                    firstTopping = false;
                                 }
                                 
                                 if (onions == 1) {
                                    description += (firstTopping ? " with " : ", ") + "Chopped Onions";
                                    totalCents += 20;
                                    firstTopping = false;
                                 }
                                 
                                 if (tomato == 1) {
                                    description += (firstTopping ? " with " : ", ") + "Tomato Wedge";
                                    totalCents += 25;
                                    firstTopping = false;
                                 }
                                 if (relish == 1) {
                                    description += (firstTopping ? " with " : ", ") + "Sweet Relish";
                                    totalCents += 30;
                                    firstTopping = false;
                                 }
                                 if (peppers == 1) {
                                    description += (firstTopping ? " with " : ", ") + "Sport Peppers";
                                    totalCents += 35;
                                    firstTopping = false;
                                 }
                                
                                 if (kraut == 1) {
                                    description += (firstTopping ? " with " : ", ") + "Sauerkraut";
                                    totalCents += 45;
                                    firstTopping = false;
                                 }

                                 System.out.printf("%3d %-82s $%.2f%n", count, description, totalCents / 100.0);
                                 count++;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

    
      return count;
   }

   /**
    * Entry point that creates a HotDog menu printer and verifies 128 combinations.
    *
    * @param args command-line arguments (unused)
    */
   public static void main(String[] args) {
      // Instantiate HotDog and print the menu
      HotDog obj = new HotDog();
      long count = obj.printMenu();
      // Verify that 2^7 = 128 combinations were produced
      assert count == 128;
   }
}