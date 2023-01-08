import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = getVehicle();

        /**
         * IMPERATIVE APPROACH
         */
        //List all cars
//        List<Vehicle> car = new ArrayList<>();
//        for (Vehicle vehicle : vehicleList) {
//            if (vehicle.getVehicleType() == VehicleType.CAR) {
//                car.add(vehicle);
//            }
//        }
//        car.forEach(System.out::println);


        /**
         * Declarative approach
         */
        List<Vehicle> collect = vehicleList
                .stream()
                .filter(vehicle -> vehicle.getVehicleType().equals(VehicleType.CAR))
                .toList();

        collect.forEach(System.out::println);

//
//        //SORT
//        List<Vehicle> sorted = vehicleList.stream()
//                .sorted(Comparator.comparing(Vehicle::getUsedYears))
//                .collect(Collectors.toList());
//
//        //ALL MATCH
//        boolean allMatch = vehicleList.stream()
//                .allMatch(vehicle -> vehicle.getUsedYears() < 10);
//        System.out.println(allMatch);
//
//        //ANY MATCH
//        boolean anyMatch = vehicleList.stream()
//                .anyMatch(vehicle -> vehicle.getUsedYears() < 10);
//        System.out.println(anyMatch);
//
//        //MAX
//        vehicleList.stream()
//                .max(Comparator.comparing(Vehicle::getUsedYears))
//                .ifPresent(vehicle -> System.out.println(vehicle));
//
//        //MIN
//        vehicleList.stream()
//                .min(Comparator.comparing(Vehicle::getUsedYears))
//                .ifPresent(vehicle -> System.out.println(vehicle));
//
//        //GROUP
//        Map<VehicleType, List<Vehicle>> group = vehicleList.stream()
//                .collect(Collectors.groupingBy(Vehicle::getVehicleType));
//
//        group.forEach((type, vehicle) ->{
//            System.out.println(type);
//            vehicle.forEach(System.out::println);
//            System.out.println();
//        });

    }

    private static List<Vehicle> getVehicle() {
        return List.of(
                new Vehicle("BMW", "2003", 20, VehicleType.CAR),
                new Vehicle("TOYOTA", "2009", 13, VehicleType.VAN),
                new Vehicle("BMW", "2009", 15, VehicleType.CAR),
                new Vehicle("AUDI", "2014", 7, VehicleType.VAN),
                new Vehicle("MCLAREN", "2006", 14, VehicleType.CAR),
                new Vehicle("WAX WAGON", "2005", 17, VehicleType.CAR)
        );
    }
}
