import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class GUIWeather {
  private   JFrame frame;
  private   JButton find_location;
     JTextField write_your_ip;
  private JLabel response;
  private Location location;


    public GUIWeather(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1000 , 1000);
        //button to find your location
        find_location = new JButton("find");
        //textfield for you ip
        write_your_ip=new JTextField();
        response = new JLabel();

        write_your_ip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(location.s);
            }
        });


        find_location.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(location.s);
            }
        });





        //add to frame
        frame.add(response);
        frame.add(find_location);
        frame.add(write_your_ip);

        //setBounds
        write_your_ip.setBounds(100, 100, 200, 20);
        find_location.setBounds(150 , 150 , 100 , 20);
        response.setBounds(50 , 200 , 500, 500);






        frame.setVisible(true);
          }

}
