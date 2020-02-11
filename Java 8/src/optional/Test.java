package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

public class Test
{
   public static String getCarInsuranceName(Optional<Person> person) {
      return person.flatMap(Person::getCar).flatMap(Car::getInsurance)
            .map(Insurance::getName).orElse("Unknown");
   }

   public String getCarInsuranceName(Optional<Person> person, int minAge) {
      return person.filter(p -> p.getAge() >= minAge)
            .flatMap(Person::getCar)
            .flatMap(Car::getInsurance)
            .map(Insurance::getName)
            .orElse("Unknown");
   }

   public static int readDuration(Properties props, String name) {
      String value = props.getProperty(name);
      if (value != null) {
         try {
            int i = Integer.parseInt(value);
            if (i > 0) {
               return i;
            }
         }
         catch (NumberFormatException e) {}
      }
      return 0;
   }

   public Object readDurationOptional(Properties props, String name) {
      return Optional.ofNullable(props.getProperty(name)).map(Integer::parseInt).filter(i -> i > 0).orElse(0);
   }

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      Optional<Person> p = Optional.empty();

      Car newCar = null;
      Optional<Car> optCar = Optional.ofNullable(newCar);

      Car anotherCar = new Car();
      Optional<Car> optNewCar = Optional.of(anotherCar);

      Optional<Insurance> optInsurance = Optional.ofNullable(new Insurance());
      Optional<String> name = optInsurance.map(Insurance::getName);

      Optional<Insurance> optInsurance2 = Optional.empty();
      optInsurance2.filter(insurance -> "CambridgeInsurance".equals(insurance.getName()))
      .ifPresent(x -> System.out.println("ok"));

      Map<String, Object> testMap = new HashMap<>();
      Optional<Object> value = Optional.ofNullable(testMap.get("key"));

      Properties props = new Properties();
      props.setProperty("a", "5");
      props.setProperty("b", "true");
      props.setProperty("c", "-3");

      System.out.println(readDuration(props, "a"));
   }
}