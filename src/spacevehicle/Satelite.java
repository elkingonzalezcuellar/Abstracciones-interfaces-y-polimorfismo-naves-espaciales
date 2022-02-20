/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacevehicle;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Satelite extends SpaceVehicle implements UnmannedSpacecraft {

    private ArrayList<String> data = new ArrayList<>();

    public Satelite() {
    }

    public Satelite(String name, int id, double weight, double thrust, double size, double height, boolean status, double power, String ownerCountry, String destination, String energySource, double speed) {
        super(name, id, weight, thrust, size, height, status, power, ownerCountry, destination, energySource, speed);
    }

    @Override
    public void Fuction() {
        System.out.println("Estudio cuerpos celestes");
    }

    @Override
    public void study() {
        String totalData = "";
        System.out.println("Analizando datos...");
        for (int i = 0; i <= data.size(); i++) {
            System.out.println(data.get(i));
            totalData += data.get(i);
        }
        
        System.out.println(totalData);
    }

    @Override
    public ArrayList<String> getData() {
        return data;
    }

    @Override
    public void setData(String imagen) {
        this.data.add(imagen);

    }

    public void toOrbit(String celestialObject) {

        System.out.println("Soy" + getName() + "y orbito alrededor de :" + celestialObject
                + "a una velocidad de :" + getSpeed());
    }

}
