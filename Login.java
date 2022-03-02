import javax.swing.*;
import java.awt.*;

public class Login {
    public static void main(String[] args){
        // Create JFrane
        JFrame frame = new JFrame();
        frame.setSize(1380,730);
        frame.setTitle("Login form with java");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0000225));
        // change Icon image
        ImageIcon icon = new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());

        // create JPanel
        JPanel panel = new JPanel();
        panel.setBounds(40,50,1280,600);
        panel.setBorder(BorderFactory.createLineBorder(Color.white,5));
        panel.setBackground(Color.white);

        // insert Image doctors
        JLabel lblImage = new JLabel();
        ImageIcon img = new ImageIcon("img13.png");
        // create label that holds image

        lblImage.setIcon(img);


        //lblImage.setHorizontalAlignment(JLabel.LEFT);
        lblImage.setBounds(50,50,500,600);

        // label form
        JLabel  labelLogin = new JLabel();
        labelLogin.setText("Login Form With Java");
        labelLogin.setBounds(500,40,500,100);
        labelLogin.setFont(new Font("verdana",Font.BOLD,40));
        labelLogin.setForeground(new Color(0x0000252));

        // user JLabel
        JLabel userLabel = new JLabel();
        userLabel.setText("Username");
        userLabel.setForeground(Color.blue);
        userLabel.setFont(new Font("verdana",Font.BOLD,32));
        userLabel.setBounds(500,130,200,100);


        // Email JLabel
        JLabel emailLabel = new JLabel();
        emailLabel.setText("Email");
        emailLabel.setForeground(Color.blue);
        emailLabel.setFont(new Font("verdana",Font.BOLD,32));
        emailLabel.setBounds(500,200,200,100);



        // Email JLabel
        JLabel passwordLabel = new JLabel();
        passwordLabel.setText("Password");
        passwordLabel.setForeground(Color.blue);
        passwordLabel.setFont(new Font("verdana",Font.BOLD,32));
        passwordLabel.setBounds(500,270,200,100);

        // textField => userText JTextField
        JTextField userText = new JTextField();
        JTextField emailText = new JTextField();
        JTextField passText = new JTextField();

        // formatting all fields

        userText.setBorder(BorderFactory.createEtchedBorder());
        userText.setBackground(Color.lightGray);
        userText.setForeground(Color.red);
        userText.setFont(new Font("verdana",Font.BOLD,25));
        userText.setBounds(800,160,300,40);

        emailText.setBorder(BorderFactory.createEtchedBorder());
        emailText.setBackground(Color.lightGray);
        emailText.setForeground(Color.red);
        emailText.setFont(new Font("verdana",Font.BOLD,25));
        emailText.setBounds(800,230,300,40);

        passText.setBorder(BorderFactory.createEtchedBorder());
        passText.setBackground(Color.lightGray);
        passText.setForeground(Color.red);
        passText.setFont(new Font("verdana",Font.BOLD,25));
        passText.setBounds(800,300,300,40);

        // button Login with JButton
        JButton button = new JButton();
        // button formatting
        button.setText("Login");
        button.setFocusable(false);
        button.setBackground(new Color(0x0000252));
        button.setForeground(Color.white);
        button.setFont(new Font("verdana",Font.BOLD,32));
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setBounds(630,400,300,40);
        // addActionListener into the button
        button.addActionListener(e -> {
            String username = userText.getText();
            String email = emailText.getText();
            String password = passText.getText();

            if (username.equals("") || email.equals("") || password.equals("")){
                JOptionPane.showMessageDialog(null,"All fields are required.","Error",JOptionPane.ERROR_MESSAGE);
                userText.setText(null);
                emailText.setText(null);
                passText.setText(null);
            }
            else{
                JOptionPane.showMessageDialog(null,"Successfully login welcome.","Admin",JOptionPane.ERROR_MESSAGE);
            }
        });


        // light
        JButton btnLight = new JButton();
        btnLight.setBackground(Color.white);
        btnLight.setFont(new Font("verdana",Font.BOLD,20));
        btnLight.setBounds(990,30,20,20);
        btnLight.setBorder(BorderFactory.createEtchedBorder());
        btnLight.setVisible(false);

        // Adding darkButton
        //Image of dark icon
        ImageIcon darkIcon = new ImageIcon("moon.png");
        // create button as darkLabel
        JButton darkBtn = new JButton();
        darkBtn.setIcon(darkIcon);
        darkBtn.setBounds(980,10,50,50);
        darkBtn.setFocusable(false);
        darkBtn.setBackground(Color.white);
        darkBtn.setBorder(BorderFactory.createEmptyBorder());
        darkBtn.setVisible(true);
        darkBtn.addActionListener(e -> {
            panel.setBackground(Color.darkGray);
            labelLogin.setForeground(Color.white);
            userLabel.setForeground(Color.orange);
            emailLabel.setForeground(Color.orange);
            passwordLabel.setForeground(Color.orange);
            button.setBackground(Color.orange);
            darkBtn.setBackground(Color.darkGray);
            darkBtn.setVisible(false);
            btnLight.setVisible(true);


        });
        btnLight.addActionListener(e -> {

            panel.setBackground(Color.white);
            userLabel.setForeground(Color.blue);
            emailLabel.setForeground(Color.blue);
            passwordLabel.setForeground(Color.blue);
            button.setBackground(Color.orange);
            btnLight.setVisible(false);
            darkBtn.setVisible(true);
            darkBtn.setBackground(Color.white);
            labelLogin.setForeground(new Color(0x0000252));
            button.setBackground(new Color(0x0000252));

        });

        // Requirements to import

        //jFrame
        //JPanel
        //aadActionListener
        //JButton
        //JOptionPane
        //ImageIcon
        //Color of JFrame
        //BorderLayout
        //setFocusable


        frame.setLayout(null);
        frame.add(panel);
        frame.add(lblImage);
        panel.add(lblImage);
        panel.setLayout(null);
        frame.add(labelLogin);
        panel.add(labelLogin);
        panel.add(userLabel);
        panel.add(emailLabel);
        panel.add(passwordLabel);

        panel.add(userText);
        panel.add(emailText);
        panel.add(passText);

        panel.add(button);

        panel.add(darkBtn);
        panel.add(btnLight);
        frame.setVisible(true);
    }
}
