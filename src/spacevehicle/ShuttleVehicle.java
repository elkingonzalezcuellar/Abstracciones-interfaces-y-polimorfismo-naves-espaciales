/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacevehicle;

/**
 *
 * @author PC
 */
public class ShuttleVehicle extends SpaceVehicle {

    private double transportCapacity;
    private SpaceVehicle load;

    public ShuttleVehicle() {
    }

    public ShuttleVehicle(String name, int id, double transportCapacity) {
        super(name, id);
        this.transportCapacity = transportCapacity;
    }

    public ShuttleVehicle(String name, int id, double weight, double thrust,
            double size, double height, boolean status, double power, String ownerCountry,
            String destination, String energySource, double speed, double transportCapacity, SpaceVehicle load) {
        super(name, id, weight, thrust, size, height, status, power, ownerCountry, destination,
                energySource, speed);
        this.transportCapacity = transportCapacity;
        this.load = load;
    }

    @Override
    public void Fuction() {
        System.out.println("Mi objetivo es transportar una carga ");
    }

    public void PlacingCargoInOrbit() {
        System.out.println("La carga se ha lanzado con exito!");

    }

    /**
     * @return the name
     */
    public double getTransportCapacity() {
        return transportCapacity;
    }

    /**
     * @param name the name to set
     */
    public void setTransportCapacity(String transportCapacity) {
        this.name = transportCapacity;
    }
}
