package designpatterns.structural.decorator.icecream;

public class BlueCone implements IceCreamCone{
    @Override
    public int getCost() {
        return 15;
    }

    @Override
    public String getConstituent() {
        return "Blue Cone";
    }
}
