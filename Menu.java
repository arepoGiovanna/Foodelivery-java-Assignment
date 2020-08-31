import java.util.ArrayList;

public class Menu {
    
    //fields
    private ArrayList<Item> main = new ArrayList<Item>();
    private ArrayList<Item> rice = new ArrayList<Item>();
    //private ArrayList<Item> noodles= new ArrayList<Item>();
    private ArrayList<Item> drinks= new ArrayList<Item>();



    //constructors
    public Menu(){
        populateMenu();
    }


    //aasessor n mutators
    //return specific menu
    public Item getMain(int index){
        return main.get(index);
    }

    //return specific menu
    public int getMainSize(){
        return main.size();
    }

    //return all the main dishes as a string
    public String getAllMain(){
        String aMenu = "";
        aMenu += "Main : \n";
        for(int i = 0; i< main.size(); i++){
            Item a = main.get(i);
            //add id, name, price
            aMenu += "M" + (i+1) + " " + a.toString() + "\n";
        }
        return aMenu;
    }

    /*for rice */
    //return specific menu
    public Item getRice(int index){
        return rice.get(index);
    }

    //return specific menu
    public int getRiceSize(){
        return rice.size();
    }

    //return all the main dishes as a string
    public String getAllRice(){
        String aMenu = "";
        aMenu += "Rice : \n";
        for(int i = 0; i< rice.size(); i++){
            Item a = rice.get(i);
            //add id, name, price
            aMenu += "R" + (i+1) + " " + a.toString() + "\n";
        }
        return aMenu;
    }

    /*for drinks */
    //return specific menu
    public Item getDrinks(int index){
        return drinks.get(index);
    }

    //return specific menu
    public int getDrinksSize(){
        return drinks.size();
    }

    //return all the main dishes as a string
    public String getAllDrinks(){
        String aMenu = "";
        aMenu += "Drinks : \n";
        for(int i = 0; i< drinks.size(); i++){
            Item a = drinks.get(i);
            //add id, name, price
            aMenu += "D" + (i+1) + " " + a.toString() + "\n";
        }
        return aMenu;
    }


    //methods
    public void populateMenu(){
        //main
        main.add(new Item("Nasi ayam bakar\t\t", "Main", 10));
        main.add(new Item("Nasi ikan salai\t\t", "Main", 12));
        main.add(new Item("Nasi daging teratak\t\t", "Main", 15));

        //rice
        rice.add(new Item ("Nasi goreng Cina\t\t", "Rice", 5));
        rice.add(new Item ("Nasi goreng Belacan\t\t", "Rice", 7));
        rice.add(new Item ("Nasi goreng ayam\t\t", "Rice", 9));

        //drinks
        drinks.add(new Item("sky juice\t\t", "drinks", 2));
        drinks.add(new Item("land juice\t\t", "drinks", 3));
        drinks.add(new Item("Watermelon juice\t\t", "drinks", 4, "12 oz"));


    }


    //toString
    //print all menu in one string
    public String toString(){
        String menu = "";
        menu += "Restaurant A Menu\n"+
        "------------------------------------------------------------------------\n";
        menu += getAllMain() + "\n";
        menu += getAllRice() + "\n";
        menu += getAllDrinks() + "\n";
        return menu;
    }

}