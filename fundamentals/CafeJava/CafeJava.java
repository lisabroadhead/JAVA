public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 5.95;
        double latte = 7.00;
        double cappuccino = 6.32;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        
        // order1 - CINDHURI
        if(isReadyOrder1){
            System.out.println(customer1 + readyMessage + ". " + displayTotalMessage +  dripCoffee );

        }else{
            System.out.println(generalGreeting + customer1 + ". Great a Coffee" + pendingMessage + "!");
        }
        System.out.println();


        // order2 - NOAH
        System.out.println(generalGreeting + customer4 + "!");
        if(isReadyOrder2){
            System.out.println( customer4 +  readyMessage + ". " + displayTotalMessage + cappuccino);
        }else{
            System.out.println(customer4 + pendingMessage);
        } 
        System.out.println();


        // order3 - SAM
        System.out.println(generalGreeting + customer2 + "! My My My, thristy today?");
        if(isReadyOrder3){
            System.out.println( customer2 + readyMessage + ". " + displayTotalMessage + latte * 2); 
        }else{
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println();



        // order4 - JIMMY
        System.out.println(generalGreeting + customer4);

        double OrderTotel = dripCoffee - latte;
        String orderMessage;
        if(OrderTotel > 1){
            orderMessage = "here's your change $";
        }else{
            orderMessage = "you owe $";
            OrderTotel = latte - dripCoffee;
        }

        if(isReadyOrder4){
            System.out.println(customer4 + ", we're very sorry. You were charged for a coffee not a latte. You " + orderMessage + OrderTotel);
        }else{
            System.out.println(customer4 + pendingMessage);
        }
    }
}
