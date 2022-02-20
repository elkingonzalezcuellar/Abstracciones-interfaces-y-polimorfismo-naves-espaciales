package spacevehicle;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public abstract class SpaceVehicle {

    public String name;
    private int id = 7;
    private int id2 = 0;
    public double weight, thrust, size, height;
    public Date creationDate = new Date();
    public boolean status;
    private double power, speed;
    protected String ownerCountry, destination;
    private String energySource;
    Scanner in = new Scanner(System.in);

    public SpaceVehicle() {
    }

    public SpaceVehicle(String name, int id) {

    }

    public SpaceVehicle(String name, int id, double weight, double thrust,
            double size, double height, boolean status, double power,
            String ownerCountry, String destination, String energySource, double speed) {
        this.name = name;
        this.id = id;
        this.weight = weight;
        this.thrust = thrust;
        this.size = size;
        this.height = height;
        this.status = status;
        this.power = power;
        this.ownerCountry = ownerCountry;
        this.destination = destination;
        this.energySource = energySource;
        this.speed = speed;
    }

    public String toString() {
        return "\n" + "Nombre: " + name
                + " | id: " + id
                + " | Peso: " + weight
                + " | Empuje: " + thrust
                + " | Volumen: " + size
                + " | Altura: " + height
                + " | Estado: " + status
                + " | Potencia: " + power
                + " | Pais Propietario: " + ownerCountry
                + " | Destino : " + destination
                + " | Fuente de Energia: " + energySource
                + " | Fecha de creación: " + creationDate
                + " | Velocidad: " + speed
                + "\n";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the thrust
     */
    public double getThrust() {
        return thrust;
    }

    /**
     * @param thrust the thrust to set
     */
    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the power
     */
    public double getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(double power) {
        this.power = power;
    }

    /**
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * @return the ownerCountry
     */
    public String getOwnerCountry() {
        return ownerCountry;
    }

    /**
     * @param ownerCountry the ownerCountry to set
     */
    public void setOwnerCountry(String ownerCountry) {
        this.ownerCountry = ownerCountry;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the energySource
     */
    public String getEnergySource() {
        return energySource;
    }

    /**
     * @param energySource the energySource to set
     */
    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public abstract void Fuction();

    public void RequestDataShip() {

        System.out.println("Escribe el nombre de tu nave: ");
        setName(in.nextLine());
        System.out.println("Escribe el país o propietario de la nave:  ");
        setOwnerCountry(in.nextLine());
        System.out.println("¿Cual será su destino? ");
        setDestination(in.nextLine());
        System.out.println("Escribe el peso(kg): ");
        setWeight(in.nextDouble());
        System.out.println("¿Cuanto empuje tendrá?: ");
        setThrust(in.nextDouble());
        System.out.println("Escribe el volumen(m3)");
        setSize(in.nextDouble());
        System.out.println("Escribe la altura de tu nave: ");
        setHeight(in.nextDouble());
        System.out.println("Escribe la potencia de tu nave: ");
        setPower(in.nextDouble());

    }

}
