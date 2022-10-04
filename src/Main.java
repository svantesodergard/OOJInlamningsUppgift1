import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        PlantHotel plantHotel = new PlantHotel("Greenest");

        plantHotel.addPlant(new Cactus("Igge", 0.2));
        plantHotel.addPlant(new PalmTree("Laura", 5.0));
        plantHotel.addPlant(new CarnivorousPlant("Meatloaf", 0.7));
        plantHotel.addPlant(new PalmTree("Putte", 1));

        while (true) {
            String nameOfPlant = JOptionPane.showInputDialog("Vilken växt ska matas?");
            if (nameOfPlant == null) {
                break;
            }
            try {
                String output = plantHotel.getPlant(nameOfPlant).requiredNutrientsString();
                JOptionPane.showMessageDialog(null, output);
            } catch (IllegalArgumentException exception) {
                JOptionPane.showMessageDialog(null, exception.getMessage());
            }
        }
    }
}