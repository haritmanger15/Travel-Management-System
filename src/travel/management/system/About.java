package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {
    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    About() {
        setLayout(null);
        JButton b1 = new JButton("Exit");
        b1.setBounds(180, 430, 120, 20);
        setFont(new Font("RALEWAY", Font.BOLD, 180));
        b1.addActionListener(this);
        add(b1);

        String about = "                                    About the Project          \n  "
                + "\n  This Project is Created By Harit Mengar     "
                + "\n        "
                + "\nThe objective of the Travel and Tourism Management System project is "
                + "to automate the processes and activities of a travel agency. The purpose "
                + "is to design a system that enables users to perform all operations related "
                + "to travel with efficiency and ease.\n\n"
                + "This application provides seamless access to information related to travel "
                + "destinations, helping users track and manage their tours effortlessly. "
                + "Additionally, it offers comprehensive information about travel agencies, "
                + "making the entire travel planning process more convenient.\n\n"
                + "Key Advantages of the Project:"
                + "\nAccurate and reliable information"
                + "\nStreamlines manual tasks"
                + "\nReduces the need for extensive documentation"
                + "\nProvides up-to-date information"
                + "\nUser-friendly interface with helpful warnings"
                + "\nDetailed traveler information management"
                + "\nBooking confirmation notifications";

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);
        t1.setFont(new Font("RALEWAY", Font.BOLD, 16));
        add(t1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project");
        l1.setBounds(170, 10, 180, 80);
        l1.setForeground(Color.red);
        l1.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(l1);

        setBounds(300, 120, 500, 550);

        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // dispose();
        setVisible(false);
    }

    public static void main(String[] args) {
        new About();
    }

}
