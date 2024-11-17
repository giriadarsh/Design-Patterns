package designpatterns.behavioural.strategy.after2;

public class Main {

    public static void main(String[] args) {
        PathCalculationStrategyRegistry registry = new PathCalculationStrategyRegistry();

        registry.register(TransportMode.CAR, new CarPathCalculationStrategy());
        registry.register(TransportMode.WALK, new WalkPathCalculationStrategy());
        registry.register(TransportMode.BIKE, new WalkPathCalculationStrategy());

        GoogleMaps googleMaps = new GoogleMaps(registry);
    }
}
