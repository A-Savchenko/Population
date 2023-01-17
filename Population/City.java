
import java.util.Objects;

/**
 *	City data - the city name, state name, location designation,
 *				and population est. 2017
 *
 *	@author
 *	@since
 */
public class City implements Comparable<City> {
    private String state, name, designation;
    private int population;

    // constructor
    public City()
    {
        state = name = designation = "";
        population = 0;
    }

    /**	Compare two cities populations
     *	@param other		the other City to compare
     *	@return				the following value:
     *		If populations are different, then returns (this.population - other.population)
     *		else if states are different, then returns (this.state - other.state)
     *		else returns (this.name - other.name)
     */

    public int compareTo(City other)
    {
        if(this.population != other.population) return this.population - other.population;
        else if(!this.state.equals(other)) return this.state.compareTo(other.getState());
            else return this.name.compareTo(other.getName());
    }
    public int compareToByName(City other)
    {
        return this.name.compareTo(other.getName());
    }

    /**	Equal city name and state name
     *	@param other		the other City to compare
     *	@return				true if city name and state name equal; false otherwise
     */

    public boolean equals(City other)
    {
        return this.state.equals(other.getState());
    }

    public void setPopulation(int pop)
    {
        population = pop;
    }

    public void setState(String st)
    {
        state = st;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setDesignation(String d)
    {
        designation = d;
    }

    public String getName() { return name;}
    public int getPopulation() { return population; }
    public String getDesignation() { return designation;}
    public String getState() { return state; }

    @Override
    public String toString() {
        return String.format("%-22s %-22s %-12s %,12d", state, name, designation,
                population);
    }

}



