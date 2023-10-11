import java.util.*;

public class Main {
    // Creating a list to store garden cases
    static List<Garden> gardens = new ArrayList<>();

    public static void main(String[] args) {
        // Adding 20 cases to the gardens list with different heights and widths and plants
        gardens.add(new Garden(1, 1, "Pine"));
        gardens.add(new Garden(3, 3, "Willow"));
        gardens.add(new Garden(5, 5, "Holly"));
        gardens.add(new Garden(10, 10, "Maple"));
        gardens.add(new Garden(13, 13, "Aspen"));
        gardens.add(new Garden(16, 16, "Apple"));
        gardens.add(new Garden(20, 20, "Oak"));
        gardens.add(new Garden(25, 25, "Almond"));
        gardens.add(new Garden(30, 30, "Olive"));
        gardens.add(new Garden(35, 35, "Birch"));
        gardens.add(new Garden(40, 40, "Cherry"));
        gardens.add(new Garden(45, 45, "Cedar"));
        gardens.add(new Garden(50, 50, "Cypress"));
        gardens.add(new Garden(55, 55, "Elm"));
        gardens.add(new Garden(60, 60, "Fir"));
        gardens.add(new Garden(65, 65, "Juniper"));
        gardens.add(new Garden(70, 70, "Larch"));
        gardens.add(new Garden(75, 75, "Linden"));
        gardens.add(new Garden(80, 80, "Mahogany"));
        gardens.add(new Garden(85, 85, "Palm"));


        // Creating a test case of 4x4 and testing the recommendPlant method
        // int queryHeight = 14;
        // int queryWidth = 12;

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the garden: ");
        double queryHeight = scanner.nextInt();
        System.out.print("Enter the width of the garden: ");
        double queryWidth = scanner.nextInt();
        System.out.print("Enter the plant in the garden: ");
        String queryPlant = scanner.next();

        // loop into the gardens and subtract the query height and width from the garden height and width
        for (Garden garden : gardens) {
            if (garden.tree.equals(queryPlant)) {
                queryHeight -= garden.height;
                queryWidth -= garden.width;
            }
        }
        recommendPlant(queryHeight, queryWidth);
    }

  // Creating a method to recommend a plant based on user's garden size and existing tree. using Euclidean Distance
    public static void recommendPlant(double queryHeight, double queryWidth) {
        // Creating a list to store the distances
        List<Double> distances = new ArrayList<>();

        // Looping into the garden list to calculate the Euclidean Distance
        for (Garden garden : gardens) {
            // Calculating the Euclidean Distance
            double distance = Math.sqrt(Math.pow(queryHeight - garden.height, 2) + Math.pow(queryWidth - garden.width, 2));
            // Adding the distance to the distances list
            distances.add(distance);
        }
        // find the minimum distance
        double minDistance = Collections.min(distances);
        // find the index of the minimum distance
        int minIndex = distances.indexOf(minDistance);

        // Returning the plant at the minimum index
        System.out.println("The recommended plant for your garden is: " + gardens.get(minIndex).tree +" Height: " + gardens.get(minIndex).height +" Width: " + gardens.get(minIndex).width);
    }

}
