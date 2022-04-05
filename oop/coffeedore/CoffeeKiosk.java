import java.util.Scanner; 
import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Order> orders;
    private ArrayList<Item> menu;

    public CoffeeKiosk(){
        this.orders = new ArrayList<Order>();
        this.menu = new ArrayList<Item>();
    }

    public void addMenuItem(Item newItem){
        menu.add(newItem);
    } 

    public void displayMenu(){
        System.out.println("MENU:");
        for(int i = 0; i < menu.size();i++){
            System.out.println(menu.get(i).getIndex() + " " +  menu.get(i).getName() + " -- $" + menu.get(i).getPrice());
        }
    }

    public void newOrder(){
        Scanner scan = new Scanner( System.in);
        
        System.out.println("Name on Order: ");
        String name = scan.next();
        
        System.out.println("Order: choose by id, hit q to submit order");
        int order = scan.nextInt();
    }

}