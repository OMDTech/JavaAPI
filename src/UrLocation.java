import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UrLocation {

    public UrLocation(Location location) {
        this.location = location;
    }

    private Location location =new Location();

    public static void main(String[] args) throws IOException {
        GUIWeather gui = new GUIWeather();
        try  {

        }catch (Exception e){
            System.err.println(e.getMessage());
        }


    }
}

