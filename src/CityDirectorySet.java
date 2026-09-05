import java.util.Set;
import java.util.TreeSet;

public class CityDirectorySet {

        public static void main(String[] args) {

            Set<String> cities = new TreeSet<>();

            cities.add("Muscat");
            cities.add("Nizwa");
            cities.add("Sohar");
            cities.add("Salalah");
            cities.add("Sur");
            cities.add("Ibri");

            IO.println("========== CITY DIRECTORY ==========");

            IO.println("Cities:");

            for (String city : cities) {
                IO.println(city);
            }

            String searchCity = "Nizwa";

            if (cities.contains(searchCity)) {
                IO.println("\n" + searchCity + " exists in the directory.");
            } else {
                IO.println("\n" + searchCity + " was not found.");
            }
            IO.println("Total Cities: " + cities.size());
        }
}
