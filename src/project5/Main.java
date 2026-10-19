
package project5;

public class Main {

    public static void main(String[] args) {
       

        Package sPackage = new Package(
            "Elif Erdoğan", "123 Sokak", "Kahramanmaraş", "Akdeniz", "46000",
            "Berat Hasıl", "456 Cadde", "Ankara", "Ic Anadolu", "06000",
            10.0, 0.5);
          System.out.println("STANDART PACKAGE");
         sPackage.printPackageDetails();

        TwoDayPackage twoDayPackage = new TwoDayPackage(
            "Elif Erdoğan", "123 Sokak", "Kahramanmaraş", "Akdeniz", "46000",
            "Berat Hasıl", "456 Cadde", "Ankara", "Ic Anadolu", "06000",
            10.0, 0.5, 5.0
        );
        System.out.println("TWO DAY PACKAGE");
        twoDayPackage.printPackageDetails();

        OvernightPackage overnightPackage = new OvernightPackage(
            "Elif Erdoğan", "123 Sokak", "Kahramanmaraş", "Akdeniz", "46000",
            "Berat Hasıl", "456 Cadde", "Ankara", "Ic Anadolu", "06000",
            10.0, 0.5, 0.25
        );
        System.out.println("OVER NIGHT PACKAGE");
       overnightPackage.printPackageDetails();
        

        System.out.println("Standard Package Cost: " + sPackage.calculateCost());
        System.out.println("Two-Day Package Cost: " + twoDayPackage.calculateCost());
        System.out.println("Overnight Package Cost: " + overnightPackage.calculateCost());
    }
    
}
        
    
    
}
