import java.util.Arrays;
import java.util.Scanner;

public class Machine {
    
    private Item[][] items;

    public Machine(Item[][] items){
        this.items = new Item[items.length][items[0].length];
        for(int i = 0; i < items.length; i++){
            for(int k = 0 ; k < items[i].length; k++){
                    this.items[i][k] = new Item(items[i][k]);
            }
        }
    }
    
    public Item getItem(int row, int spot){
        return new Item(this.items[row][spot]);        
    }

    public void setItem(Item item, int row, int spot){
         this.items[row][spot] = new Item(item);
    }

    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */
    public boolean dispense(int row, int spot){
        if(items[row][spot].getQuantity() > 0){
            int count = this.items[row][spot].getQuantity();
            items[row][spot].setQuantity(count-1);
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        String temp = "";
        for(int i = 0; i < items.length; i++){
            temp += "\t";
            for(int k = 0 ; k < items[i].length; k++){
                temp += this.items[i][k].toString() + " "; 
            }
            temp += "\n\n";
    }
    temp += "\t************************************************";
    return temp;
    }
}
