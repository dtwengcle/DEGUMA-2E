
package deguma.it2e;


public class order {
    
    int orderId;
    String customerName;
    String orderDate;
    double orderAmount;
    String orderStatus;
    
    public void Order(int orderId, String customerName, String orderDate, double orderAmount, String orderStatus){
        
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
        
    }
    
    public int getOrder(){
        return orderId;
    }
    
    public String getCustomerName(){
        return customerName;  
    }
    
    public String getOrderDate(){
        return orderDate;
    }
    
    public double getOtrderAmount(){
        return orderAmount;
    }
    
    public String getOrderStatus(){
        return orderStatus;
    }
    
    public void displayOrder(){
        System.out.println("Order ID:" + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("OrderDate: " + orderDate);
        System.out.println("Order Amount: " + orderAmount);
        System.out.println("Order Status: " + orderStatus);
        
    }
    
    }
    
        
    
    
    
    

