package project5;
public class Package {
    
    private String senderName;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private String senderZip;

    private String recipientName;
    private String recipientAddress;
    private String recipientCity;
    private String recipientState;
    private String recipientZip;

    private double weight;
    private double costPerOunce;

    public Package(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                   String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                   double weight, double costPerOunce) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZip = senderZip;

        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZip = recipientZip;

        this.weight = weight > 0 ? weight : 0.0;
        this.costPerOunce = costPerOunce > 0 ? costPerOunce : 0.0;
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }

    public double getWeight() {
        return weight;
    }

    public double getCostPerOunce() {
        return costPerOunce;
    }public void printPackageDetails() {
        System.out.println("--- Package Details ---");
        System.out.println("Sender: " + senderName);
        System.out.println("Sender Address: " + senderAddress + ", " + senderCity + ", " + senderState + " " + senderZip);
        System.out.println("Recipient: " + recipientName);
        System.out.println("Recipient Address: " + recipientAddress + ", " + recipientCity + ", " + recipientState + " " + recipientZip);
        System.out.println("Weight (ounces): " + weight);
        System.out.println("Cost Per Ounce: $" + costPerOunce);
        System.out.println("Total Cost: $" + calculateCost());
    }
}

    

