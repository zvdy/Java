public class coffeepot {
    
    // Create a new CoffePot class with the following properties:
    // Max Capacity (in liters)
    // Current Capacity (in liters)

    // Declare the class
    class CoffeePot {
        // Declare the properties
        private int maxCapacity;
        private int currentCapacity;
        
        // Create a constructor
        public CoffeePot(int maxCapacity, int currentCapacity) {
            this.maxCapacity = maxCapacity;
            this.currentCapacity = currentCapacity;
        }
        
        // Create a getter for maxCapacity
        public int getMaxCapacity() {
            return maxCapacity;
        }
        
        // Create a setter for maxCapacity
        public void setMaxCapacity(int maxCapacity) {
            this.maxCapacity = maxCapacity;
        }
        
        // Create a getter for currentCapacity
        public int getCurrentCapacity() {
            return currentCapacity;
        }
        
        // Create a setter for currentCapacity
        public void setCurrentCapacity(int currentCapacity) {
            this.currentCapacity = currentCapacity;
        }
        
        // Create a method to fill the coffee pot
        public void fill() {
            currentCapacity = maxCapacity;
        }
        
        // Create a method to empty the coffee pot
        public void empty() {
            currentCapacity = 0;
        }
        
        // Create a method to pour coffee
        public void pour(int amount) {
            if (amount > currentCapacity) {
                currentCapacity = 0;
            } else {
                currentCapacity -= amount;
            }
        }
    }
}