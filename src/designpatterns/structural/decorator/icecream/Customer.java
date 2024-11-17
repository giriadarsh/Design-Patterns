package designpatterns.structural.decorator.icecream;

public class Customer {

    public static void main(String[] args) {
        IceCreamCone iceCreamCone =
                new VanillaScoop(
                        new ChocolateScoop(
                                new VanillaScoop(
                                        new OrangeCone()
                                )
                        )
                );
        System.out.println(iceCreamCone.getCost());
        System.out.println(iceCreamCone.getConstituent());

        // Chocobar: Blue Cone + 2 Choco Scoop
        // KesarPista: Blue Cone + 1 Vanilla

        IceCreamCone chocobar = new ChocolateScoop(new ChocolateScoop( new BlueCone()));
        IceCreamCone kesarPista = new VanillaScoop(new BlueCone());

        IceCreamCone chocoWithOneVanilla = new VanillaScoop(chocobar);
        System.out.println(chocoWithOneVanilla.getCost());
    }
}
