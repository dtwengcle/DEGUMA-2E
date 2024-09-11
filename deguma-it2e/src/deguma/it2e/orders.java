package deguma.it2e;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of orders: ");
        int numOrders = scanner.nextInt();
        scanner.nextLine();
        
        order[] orders = new order[numOrders];
        
        for (int i = 0; i < numOrders; i++){
            System.out.println("Enter details of order " + (i + 1) + ":");
            
            System.out.println("Order ID: ");
            int orderId = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.println("Order Date (2024-sep-11) : ");
            String orderDate = scanner.nextLine();
            
            System.out.println("Order Amount: ");
            double orderAmount = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.println("Order Status: ");
            String orderStatus = scanner.nextLine();
            
            orders[i] = new Order(orderId, orderDate, orderAmount, orderStatus);
            
        }
        
        System.out.println("\nOrder Summary: ");
        for ( order order : orders){
            order.displayOrder();
        }
        scanner.close();
    }
            
        
     
          
              
            
         
        }
        
    }
}
