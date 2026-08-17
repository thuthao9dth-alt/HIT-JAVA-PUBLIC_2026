import java.util.ArrayList;

public class Store {
    private ArrayList<Smartphone> inventory;

    public Store() {
        inventory = new ArrayList<>();

    }
    public void addPhoneToStore(Smartphone smartphone) {
        inventory.add(smartphone);
    }
    public Smartphone search(String id) {
        for (Smartphone smartphone : inventory) {
            if (smartphone.getId().equals(id)) {
                return smartphone;
            }
        }
        return null;
    }

    public ArrayList<Smartphone> search(double minPrice, double maxPrice) {
        ArrayList<Smartphone> result = new ArrayList<>();
        for (Smartphone smartphone : inventory) {
            if (smartphone.getPrice() >= minPrice && smartphone.getPrice() <= maxPrice) {
                result.add(smartphone);
            }
        }
        return result;
    }

    public ArrayList<Smartphone> search(String keyword, boolean tenSanpham) {
        ArrayList<Smartphone> result = new ArrayList<>();
        for (Smartphone smartphone : inventory) {
            if (smartphone.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(smartphone);
            }
        }
        return result;
    }
    public void sellPhone(Customer customer, String phoneId){
        Smartphone smartphone =search(phoneId);
        if(smartphone != null && smartphone.getStock()>0){
            smartphone.setStock(smartphone.getStock()-1);
            customer.addPhone(smartphone);
        }
    }
    public double calculateInventoryValue() {
        double total = 0;
        for (Smartphone smartphone : inventory) {
            total += smartphone.getFinalPrice() * smartphone.getStock();
        }
        return total;
    }
}
