public class PhoneBillCalculator {
    public static void main(String[] args) {
        PhoneBill phoneBill = new PhoneBill(213242);

        phoneBill.setUsedMinutes(7800);
        phoneBill.printItemizedBill();
    }
}
