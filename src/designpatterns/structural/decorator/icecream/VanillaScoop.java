package designpatterns.structural.decorator.icecream;

public class VanillaScoop implements IceCreamCone{

    private IceCreamCone iceCreamCone;
    public VanillaScoop(IceCreamCone iceCreamCone){
        this.iceCreamCone = iceCreamCone;
    }

    @Override
    public int getCost() {
        return iceCreamCone.getCost() + 15;
    }

    @Override
    public String getConstituent() {
        return iceCreamCone.getConstituent() + " " + "Vanilla";
    }
}
