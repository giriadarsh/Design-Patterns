package designpatterns.behavioural.strategy.after2;

public class GoogleMaps {

    private PathCalculationStrategyRegistry pathCalculationStrategyRegistry ;

    public GoogleMaps(PathCalculationStrategyRegistry registry) {
        this.pathCalculationStrategyRegistry = registry;
    }

    public void findPath (String from,
                          String to,
                          TransportMode mode) {

        PathCalculationStrategy pathCalculationStrategy = pathCalculationStrategyRegistry.getStrategy(mode);
        pathCalculationStrategy.calculatePath(from, to);
    }
}

// Single responsibility and open close principle is violated