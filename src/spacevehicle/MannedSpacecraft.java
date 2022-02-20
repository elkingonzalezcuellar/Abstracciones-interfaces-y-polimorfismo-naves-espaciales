/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacevehicle;

/**
 *
 * @author PC
 */
public class MannedSpacecraft extends SpaceVehicle {

    public int numberOfCrewMembers;
    private int crewCapacity;
    private String target;

    public MannedSpacecraft() {
    }

    public MannedSpacecraft(String name, int id, int crewCapacity, int numberOfCrewMembers) {
        super(name, id);
        this.crewCapacity = crewCapacity;
        this.numberOfCrewMembers = numberOfCrewMembers;
    }

    public MannedSpacecraft(String name, int id, double weight, double thrust,
            double size, double height, boolean status, double power,
            String ownerCountry, String destination, String energySource, double speed,
            int crewCapacity, int numberOfCrewMembers) {

        super(name, id, weight, thrust, size, height, status, power, ownerCountry,
                destination, energySource, speed);

        this.crewCapacity = crewCapacity;
        this.numberOfCrewMembers = numberOfCrewMembers;
    }

    @Override
    public void Fuction() {
        System.out.println("Mi objetivo es llevar humanos al espacio");

    }

    public void Fuction(String target) {
        this.target = target;
        System.out.println("Transporto humanos al espacion que tienen la mision de: " + target);

    }

    public int getNumberOfCrewMembers() {
        return numberOfCrewMembers;
    }

    /**
     * @param id the id to set
     */
    public void setNumberOfCrewMembers(int numberOfCrewMembers) {
        this.numberOfCrewMembers = numberOfCrewMembers;
    }

    /**
     * @param id the id to set
     */
    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

}
