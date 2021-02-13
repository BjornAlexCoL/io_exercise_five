package se.lexicon.g34.bl;

import se.lexicon.g34.bl.model.Car;
import se.lexicon.g34.bl.util.SerializationUtil;

import java.util.ArrayList;
import java.util.List;

/**
 *Java I/O and Serialization practices
 * 5. In Java create a class called Car with properties like regnumber, brand and model etc... The Car class must implement Serializable. To also fulfil the contract make a default constructor.
 * a. Create a List of Cars and add some objects into it.
 * b. Save the List of Cars to a file using ObjectOutputStream.
 * c. Read the List of Cars from file using ObjectInputStream.
 */
public class App 
{
    public static void main( String[] args ) {
        List<Car> cars=new ArrayList<>();
        cars.add(new Car("RMC848","Volvo","V70 Classic","Blue",2000));
        cars.add(new Car("KPP135","Volvo","245","Blue",1980));
        cars.add(new Car("FJT709","Volvo","PV","Black",1958));
        cars.add(new Car("JMM182","Volvo","245","Green",1976));
        cars.add(new Car("??????","Renault","Megane","Red",1999));

        SerializationUtil.serializeList(cars,"cars.ser");
        cars.stream().forEach(System.out::println);
        System.out.println("----------------------------------------------------------");
        List<Car> readCars=SerializationUtil.deserialize("cars.ser");
        readCars.stream().forEach(System.out::println);
    }
}
