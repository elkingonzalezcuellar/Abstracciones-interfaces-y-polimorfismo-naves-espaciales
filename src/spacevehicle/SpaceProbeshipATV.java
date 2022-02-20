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
public class SpaceProbeshipATV extends SpaceVehicle implements UnmannedSpacecraft {

    private ArrayList<String> data = new ArrayList<>();

    public SpaceProbeshipATV() {
    }

    public SpaceProbeshipATV(String name, int id, double weight, double thrust, double size, double height, boolean status, double power, String ownerCountry, String destination, String energySource, double speed, String temperature) {
        super(name, id, weight, thrust, size, height, status, power, ownerCountry, destination, energySource, speed);
        this.data.add(temperature);
    }

    @Override
    public void Fuction() {

        System.out.println("Mi función es abastecer, limpiar y regular periódicamente la elevación de la EEI.");

    }

    @Override
    public ArrayList<String> getData() {
        return data;
    }

    @Override
    public void setData(String imagen) {
        this.data.add(imagen);
    }

    public void supply() {
        System.out.println("Mi función es llevar suministros ");
        System.out.println("Entregando alimentos...");
        System.out.println("Entregando combustible...");
    }

    public void clean() {
        System.out.println("Mi función es limpiar la nave");
        System.out.println("Limpiando....");

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

}
