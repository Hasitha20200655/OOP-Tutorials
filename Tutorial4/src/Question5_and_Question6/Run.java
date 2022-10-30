package Question5_and_Question6;

public class Run {
    public static void main(String[] args) {
        CreditCard crd1 = new CreditCard("John mech",449039,458473633);
        DriverLicense dl1 = new DriverLicense("jhon mech", 2024);
        Passport p1 = new Passport("John mech", "Ohio", 2024);

        System.out.println("Is Expired" + dl1.isExpired());
        System.out.println("Is Expired" + p1.isExpired());

        System.out.println("\nCredit card \n\n" + crd1.format() + "\n\nDrivers License\n\n" + dl1.format() + "\n\nPassport\n\n" + p1.format());
    }
}
