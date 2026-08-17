import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Smartphone> cart;

    public Customer(String customerName) {
        this.customerName = customerName;
        cart = new ArrayList<>();
    }

    public void removePhone(String id){
        for(Smartphone phone : cart){
            if(phone.getId().equals(id)){
                cart.remove(phone);
                break;
            }
        }
    }
    public void removePhone(int index){
        if(index>=0&&index< cart.size()){
            cart.remove(index);

        }
    }
    public ArrayList<Smartphone> getCart() {
        return new ArrayList<>(cart);
    }

    public void addPhone(Smartphone smartphone) {
        cart.add(smartphone);
    }
    public double calculateTotalBill(){
        double total=0;
        for(Smartphone smartphone: cart){
            total+= smartphone.getFinalPrice();
        }
        return total;

    }
}

