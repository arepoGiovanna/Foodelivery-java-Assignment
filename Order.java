import java.util.ArrayList;


public class Order {
    
    
    //fields
    private static int orderNo = 0;
    private ArrayList<Item> order = new ArrayList<Item>();

    //constructors
    public Order(){    }


    //assessors. mutators

    /*get item from the order*/
    public Item getItem(int index){
        return order.get(index);
    }

    /*add item to order*/
    public void addItem(Item item){
        order.add(item);
    }


    //methods


    /*remove an item from the order*/
    public void removeItem(Item item){
        order.remove(item);
    }

    /*get order size/number of items ordered */
    public int getSize(){
        return order.size();
    }

    /*clears the order*/
    public void clearOrder(){
        order.clear();
    }

    /*get order number */
    public int getNumber(){
        return orderNo;
    }

    /*increment order number */
    public static void incrementNo(){
        orderNo++ ;
    }


    //toString
    public String toString() {
        String str = "";
        for(int i = 0; i < order.size(); i++){
            str += order.get(i).toString() + "\n\n";
        }
        return str;
    }
}