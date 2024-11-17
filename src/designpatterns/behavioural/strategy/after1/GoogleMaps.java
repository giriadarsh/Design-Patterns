package designpatterns.behavioural.strategy.after1;

public class GoogleMaps {

    private PathCalculationStrategyFactory pathCalculationStrategyFactory = new PathCalculationStrategyFactory();
    public void findPath (String from,
                          String to,
                          TransportMode mode) {

        PathCalculationStrategy pathCalculationStrategy = pathCalculationStrategyFactory.getPathCalculationStrategyForMode(TransportMode.CAR);
        pathCalculationStrategy.calculatePath(from, to);
    }
}

// Single responsibility and open close principle is violated