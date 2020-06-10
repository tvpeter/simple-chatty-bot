public class PhoneBill {

    private int availableMinutes;
    private double cost;
    private int usedMinutes;
    private int id;

    public PhoneBill(int id){
        this.id = id;
        cost = 0;
        usedMinutes = 0;
        availableMinutes = 800;
    }

    public PhoneBill(){
        availableMinutes = 0;
        cost = 0;
        usedMinutes =0;
        id = 0;
    }

    public PhoneBill(int minutes, double cost, int usedMinutes, int id){
        this.availableMinutes = minutes;
        this.cost = cost;
        this.usedMinutes = usedMinutes;
        this.id = id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setAvailableMinutes(int minutes){
        this.availableMinutes = minutes;
    }

    public int getAvailableMinutes(){
        return this.availableMinutes;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public double getCost(){
        return this.cost;
    }

    public void setUsedMinutes(int usedMinutes){
        this.usedMinutes = usedMinutes;
    }

    public int getUsedMinutes(){
        return this.usedMinutes;
    }

    public double calculateOverage(){
        if(usedMinutes <= availableMinutes)
            return 0;
        double overageRate = 0.25;
        double overageMinutes = usedMinutes - availableMinutes;

        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;

        return taxRate * (cost + calculateOverage());
    }

    public double totalCost(){
        return cost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: "+ id);
        System.out.println("Base cost: "+ cost);
        System.out.println("Overage fee: $"+ String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"+String.format("%.2f", calculateTax()));
        System.out.println("Total: $"+String.format("%.2f", totalCost()));
    }
}
