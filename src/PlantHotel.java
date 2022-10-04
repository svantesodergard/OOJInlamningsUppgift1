import java.util.ArrayList;

public class PlantHotel {
    private String name;

    private final ArrayList<Plant> plantsInHotel = new ArrayList<>();

    public PlantHotel(String name) {
        this.name = name;
    }

    public void addPlant(Plant plant) {
        this.plantsInHotel.add(plant);
    }

    public Plant getPlant(String nameOfPlantToFind) throws IllegalArgumentException {
        for (Plant plant : plantsInHotel) {
            if (plant.getName().equalsIgnoreCase(nameOfPlantToFind)) {
                return plant;
            }
        }
        throw new IllegalArgumentException("Du kan endast hämta växter som finns i hotellet");
    }
}
