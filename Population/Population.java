import java.util.Scanner;
import java.util.ArrayList;
/**
 *	Population - <description goes here>
 *
 *	Requires FileUtils and Prompt classes.
 *
 *	@author	Artem Savchenko
 *	@since	1/12/23
 */
public class Population {

    private ArrayList<City> cities;
    private final String DATA_FILE = "usPopData2017.txt";

    public Population()
    {
        cities = new ArrayList<>();
    }


    /**	Prints the introduction to Population */
    public void printIntroduction() {
        System.out.println("   ___                  _       _   _");
        System.out.println("  / _ \\___  _ __  _   _| | __ _| |_(_) ___  _ __ ");
        System.out.println(" / /_)/ _ \\| '_ \\| | | | |/ _` | __| |/ _ \\| '_ \\ ");
        System.out.println("/ ___/ (_) | |_) | |_| | | (_| | |_| | (_) | | | |");
        System.out.println("\\/    \\___/| .__/ \\__,_|_|\\__,_|\\__|_|\\___/|_| |_|");
        System.out.println("           |_|");
        System.out.println();
    }

    /**	Print out the choices for population sorting */
    public void printMenu() {
        System.out.println("1. Fifty least populous cities in USA (Selection Sort)");
        System.out.println("2. Fifty most populous cities in USA (Merge Sort)");
        System.out.println("3. First fifty cities sorted by name (Insertion Sort)");
        System.out.println("4. Last fifty cities sorted by name descending (Merge Sort)");
        System.out.println("5. Fifty most populous cities in named state");
        System.out.println("6. All cities matching a name sorted by population");
        System.out.println("9. Quit");
    }
    public static void main(String[] args) {
        Population p = new Population();
        p.runner();
    }
    public void runner()
    {
        printIntroduction();
        readTxt();
        printMenu();
        boolean gameOn = true;
        while(gameOn){
            int choice = Prompt.getInt("Enter your selection ");
            if(choice == 9) {
                gameOn = false;
                continue;
            }
            long startMillisec = System.currentTimeMillis();

            if(choice == 1) SortMethods.selectionSort(cities);
            if(choice == 2) SortMethods.selectionSort(cities, "DSC");
            if(choice == 3) SortMethods.insertionSort(cities);
            if(choice == 4) SortMethods.bubbleSort(cities);
            if(choice == 5) 
            {
			SortMethods.insertionSort(cities, "DSC");
            String stateName = Prompt. getString("Enter state name (ie. Alabama) ");
            int counter=0;
                for (int i = 0; i < cities.size(); i++)
                {
                    if (cities.get(i).getState().equals(stateName))
                    {
                        System.out.println(cities.get(i));
                        counter++;
                        if (counter==50) i = cities.size();
                    }
                }
                continue;
            }

            if(choice == 6)
            {
                SortMethods.insertionSort(cities, "DSC");
                String cityName = Prompt.getString("Enter city name ");
                System.out.println("\nAll cities matching a name sorted by population"); 
                int counter=0;
                header();
                for (int i = 0; i < cities.size(); i++)
                {
                    if (cities.get(i).getName().equals(cityName))
                    {
                        System.out.printf("%3d: %-3s\n",counter+1,cities.get(i));
                        counter++;
                        if (counter==50) i = cities.size();
                    }
                }
                continue;
            }

            long endMillisec = System.currentTimeMillis();
            for (int i = 0; i<50; i++) System.out.println(cities.get(i));
            System.out.println(String.format("The time taken for the sort: %s milliseconds.", endMillisec-startMillisec));
        }
    }
    public void header()
    {
		System.out.printf("     %-22s %-22s %-12s %12s\n", "State", "City", "Type", "Population"); 
	}
    public void readTxt()
    {
        FileUtils fu = new FileUtils();
        Scanner sc = fu.openToRead("usPopData2017.txt");
        while(sc.hasNext())
        {
 
            String line = sc.nextLine();
            String [] arr = line.split("\t");
            City newCity = new City();
            newCity.setState(arr[0]);
            newCity.setPopulation(Integer.parseInt(arr[3]));
            newCity.setDesignation(arr[2]);
            newCity.setName(arr[1]);

            cities.add(newCity);
        }
    }

}
