import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//import org.json.JSONObject;
public class Location {

    private GUIWeather guiWeather = new GUIWeather();

   private String l ;


    public String getL() {
        return l;
    }

//    public String setIp(String ip)throws NullPointerException {
//        this.ip = ip;
//        return ip;
//
//    }


    public String getS() {
        return s;
    }

    String s = "name";


    public void get_location() throws IOException {
        s=guiWeather.write_your_ip.getText();
        String urlString= "http://api.ipinfodb.com/v3/ip-city/?key=c7711a0e1ff0cb1c1033bc11bb41d8cb31595ae70722eeac36698b8e70ae8922&ip=" +s+"&format=json";
        URL url = new URL(urlString);

        //make connection
        URLConnection urlc = url.openConnection();

        //use post mode
        urlc.setDoOutput(true);
        urlc.setAllowUserInteraction(false);

        //send query
        PrintStream ps = new PrintStream(urlc.getOutputStream());
        ps.print(url);
        ps.close();

        //get result
        BufferedReader br = new BufferedReader(new InputStreamReader(urlc
                .getInputStream()));
         l = null;
        while ((l=br.readLine())!=null) {
            System.out.println(l);
        }
        br.close();
    }
}
