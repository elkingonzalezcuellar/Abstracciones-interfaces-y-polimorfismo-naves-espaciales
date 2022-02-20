package spacevehicle;

/**
 * Representación de una nave tripulada con los atributos y metodos que hereda
 * de la clase SpaceVehicle y se agragegan otros propios de la clase.
 *
 * @author Elkin Estiven Gonzalez Cuellar
 */
public class MannedSpacecraft extends SpaceVehicle {

    /**
     * Representa los tripulantes actuales de la nave
     */
    public int numberOfCrewMembers;
    /**
     * Representa la capacidad maxima de tripulantes
     */
    private int crewCapacity;
    /**
     * Representa el objetivo que tienen los tripulante de la nave por ejemplo :
     * Misiones ,Mantenimiento,Investigación etc.
     */
    private String target;

    /**
     * Instancia un objeto MannedSpacecraft con su atributos por defecto
     */
    public MannedSpacecraft() {
    }

    /**
     * Instancia un objeto MannedSpacecraft con algunos de los atributos.
     */
    public MannedSpacecraft(String name, int id, int crewCapacity, int numberOfCrewMembers) {
        super(name, id);
        this.crewCapacity = crewCapacity;
        this.numberOfCrewMembers = numberOfCrewMembers;
    }

    /**
     * Instancia un objeto MannedSpacecraft con todos los atributos.
     *
     * @param crewCapacity
     * @param numberOfCrewMembers
     */
    public MannedSpacecraft(String name, int id, double weight, double thrust,
            double size, double height, boolean status, double power,
            String ownerCountry, String destination, String energySource, double speed,
            int crewCapacity, int numberOfCrewMembers) {

        super(name, id, weight, thrust, size, height, status, power, ownerCountry,
                destination, energySource, speed);

        this.crewCapacity = crewCapacity;
        this.numberOfCrewMembers = numberOfCrewMembers;
    }

    /**
     * Metodo que representa el objetivo especifico de una nave tripulada.
     */
    @Override
    public void Fuction() {
        System.out.println("Mi objetivo es llevar humanos al espacio");

    }

    /**
     * Sobrecarga del metodo Fuction donde se pide la misión especifica que
     * cumplen los tripulantes.
     *
     * @param target
     */
    public void Fuction(String target) {
        this.target = target;
        System.out.println("Transporto humanos al espacion que tienen la mision de: " + target);

    }

    /**
     * @return el numero actual de tripulante que tiene la nave
     */
    public int getNumberOfCrewMembers() {
        return numberOfCrewMembers;
    }

    /**
     * @param numberOfCrewMembers 
     */
    public void setNumberOfCrewMembers(int numberOfCrewMembers) {
        this.numberOfCrewMembers = numberOfCrewMembers;
    }

    /**
     * @param crewCapacity
     */
    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

}
