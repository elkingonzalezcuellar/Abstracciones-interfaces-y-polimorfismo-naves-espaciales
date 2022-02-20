package createships;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import spacevehicle.MannedSpacecraft;
import spacevehicle.Satelite;
import spacevehicle.ShuttleVehicle;
import spacevehicle.SpaceProbeMessenger;
import spacevehicle.SpaceProbeshipATV;
import spacevehicle.SpaceVehicle;
import spacevehicle.spaceProbeExploration;

/**
 * Clase principal que permite crear las naves , en ella se incluyen tres menus
 * menu principal , menu para escoger el tipo de nave que se quiere crear y menu
 * de tipos especificos de naves no tripuladas.
 *
 * @author Elkin Estiven Gonzalez Cuellar
 */
public class CreateShip {

    /**
     * Variable encargada de almacenar instancias de los tipos de naves
     * espaciales.
     */
    private ArrayList<SpaceVehicle> shipsCreated = new ArrayList<>();
    /**
     * Variable encargada de llevar un conteo de las naves instanciadas.
     */
    public int count = 7;
    Scanner in = new Scanner(System.in);

    /**
     * metodo principal que se ejecuta al inicar el programa,encargado de
     * instanciar la clase principal, se usa el metodo para instanciar naves por
     * defecto que hacen referencia a las nombradas en la lectura e inicia el
     * menu principal
     */
    public static void main(String[] args) {

        CreateShip newShip = new CreateShip();
        newShip.DefaultShips();
        newShip.MainMenu();

    }

    /**
     * Metodo encargado de mostrar el menu principal y ejecutar una opcion
     * seleccionada por el usuario.
     */
    public void MainMenu() {
        /**
         * Variable encargada de la ejecución en bucle del programa
         */
        int flag = 0;
        /**
         * Variable correspondiente al numero de opcion escogida por el usuario
         */
        int selection = 0;

        do {
            do {

                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Porfavor seleccione una opción:");
                System.out.println("    1. Crear nave.");
                System.out.println("    2. Mostrar naves creadas.");
                System.out.println("    3. Salir.");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                selection = in.nextInt();

                if (selection >= 1 && selection <= 3) {
                    flag = 1;
                } else {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            } while (flag == 0);

            if (selection == 1) {

                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                MenuCreateShip();
            } else if (selection == 2) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(getShipsCreated());

            } else if (selection == 3) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("¡Gracias!, vuelva pronto.");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                flag = 2;
            }
        } while (flag != 2);
    }

    /**
     * Metodo encargado de mostrar el menu donde se seleeciona el tipo de nave
     * que se quiere crear.
     */
    public void MenuCreateShip() {

        int flag = 0;
        int selection = 0;

        do {
            do {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Porfavor seleccione una opción:");
                System.out.println("    1. Crear nave tripulada.");
                System.out.println("    2. Crear nave  no tripulada.");
                System.out.println("    3. Crear nave lanzadera");
                System.out.println("    4. Menu Principal");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                selection = in.nextInt();

                if (selection >= 1 && selection <= 4) {
                    flag = 1;
                } else {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            } while (flag == 0);

            if (selection == 1) {
                count++;
                SpaceVehicle typeOneShip = new MannedSpacecraft();
                typeOneShip.RequestDataShip();
                typeOneShip.Fuction();
                typeOneShip.setId(count);
                setShipsCreated(typeOneShip);
            } else if (selection == 2) {
                UnmannedMenu();
            } else if (selection == 3) {
                count++;
                SpaceVehicle typeSixShip = new ShuttleVehicle();
                typeSixShip.RequestDataShip();
                typeSixShip.Fuction();
                typeSixShip.setId(count);
                setShipsCreated(typeSixShip);

            } else if (selection == 4) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                flag = 2;
            }
        } while (flag != 2);

    }

    /**
     * Metodo encargado de mostrar los diferentes tipos de naves no tripuladas
     * que el usuario puede crear.
     */
    public void UnmannedMenu() {
        int flag = 0;
        int selection = 0;

        do {
            do {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Porfavor seleccione una opción:");
                System.out.println("    1. Satelite.");
                System.out.println("    2. Sonda Mensajera");
                System.out.println("    3. Sonda para : Estación Espacial Internacional");
                System.out.println("    4. Sonda de exploración");
                System.out.println("    5. Volver");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                selection = in.nextInt();

                if (selection >= 1 && selection <= 5) {
                    flag = 1;
                } else {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            } while (flag == 0);

            if (selection == 1) {
                count++;
                SpaceVehicle typeTwoShip = new Satelite();
                typeTwoShip.RequestDataShip();
                typeTwoShip.Fuction();
                typeTwoShip.setId(count);
                setShipsCreated(typeTwoShip);

            } else if (selection == 2) {
                count++;
                SpaceVehicle typeThreeShip = new SpaceProbeMessenger();
                typeThreeShip.RequestDataShip();
                typeThreeShip.Fuction();
                typeThreeShip.setId(count);
                setShipsCreated(typeThreeShip);
            } else if (selection == 3) {
                count++;
                SpaceVehicle typeFourShip = new SpaceProbeshipATV();
                typeFourShip.RequestDataShip();
                typeFourShip.Fuction();
                typeFourShip.setId(count);
                setShipsCreated(typeFourShip);
            } else if (selection == 4) {
                count++;
                SpaceVehicle typeFiveShip = new spaceProbeExploration();
                typeFiveShip.RequestDataShip();
                typeFiveShip.Fuction();
                typeFiveShip.setId(count);
                setShipsCreated(typeFiveShip);
            } else if (selection == 5) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                flag = 2;
            }
        } while (flag != 2);
    }

    /**
     * @return El arreglo dinamico que contiene la naces espaciales que han
     * sidos creadas.
     */
    public ArrayList<SpaceVehicle> getShipsCreated() {
        return shipsCreated;
    }

    /**
     * @param shipsCreated the shipsCreated to set
     */
    public void setShipsCreated(ArrayList<SpaceVehicle> shipsCreated) {
        this.shipsCreated = shipsCreated;
    }

    public void setShipsCreated(SpaceVehicle name) {
        this.shipsCreated.add(name);
    }

    /**
     * Se crean la naves por defecto que fueron mencionadas en la literuatura
     */
    public void DefaultShips() {
        SpaceVehicle Apolo = new MannedSpacecraft("Apolo", 7, 727.5, 183.16, 331.6, 4.17, false, 600, "EEUU", "Luna", "combustible", 360, 9, 4);
        SpaceVehicle defaultMannedSpacecraft = new MannedSpacecraft("Skylab", 1, 77.5, 383.1, 351.6, 11.1, false, 600, "EEUU", "Titan", "combustible", 350, 9, 3);
        SpaceVehicle defaultSatelite = new Satelite("Sputnik", 2, 83, 66.1, 267.3, 6.84, false, 150, "Rusia", "Extratosfera Terreste", "Celdas FotoVoltaicas", 170);
        SpaceVehicle defaultShuttle = new ShuttleVehicle("Saturno V", 3, 2900, 3500, 765.6, 100, false, 1567.81, "EEUU", "Luna", "combustible", 6850, 118, Apolo);
        SpaceVehicle defaultMessenger = new SpaceProbeMessenger("Pionero x", 4, 258.54, 56.1, 180.43, 1.76, true, 187.43, "pais", "Jupiter", "gasolian", 14000);
        SpaceVehicle defaultATV = new SpaceProbeshipATV("ATV", 5, 329.1, 0.2, 25.65, 0.73, true, 187.545, "International", "EEI", "monometilhidracina", 37.5, "Normal");
        SpaceVehicle defaultExploration = new spaceProbeExploration("Vikingo 1", 6, 457.54, 272.9, 159.3, 1.2, true, 81.4, "pais", "Marte", "Hidracina", 0);

        Apolo.setCreationDate(new Date(66, 9, 27));
        defaultMannedSpacecraft.setCreationDate(new Date(73, 5, 12));
        defaultSatelite.setCreationDate(new Date(57, 9, 4));
        defaultShuttle.setCreationDate(new Date(67, 3, 10));
        defaultMessenger.setCreationDate(new Date(72, 9, 130));
        defaultATV.setCreationDate(new Date(98, 9, 7));
        defaultExploration.setCreationDate(new Date(75, 4, 16));

        setShipsCreated(defaultMannedSpacecraft);
        setShipsCreated(defaultSatelite);
        setShipsCreated(defaultShuttle);
        setShipsCreated(defaultMessenger);
        setShipsCreated(defaultATV);
        setShipsCreated(defaultExploration);
        setShipsCreated(Apolo);

    }

}
