package mtg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MTG extends JFrame{
    private JTextField player1Name, player1Health, player2Name, player2Health, randomNum;
private JButton incrementP1, decrementP1, incrementP2, decrementP2, randomNumGen;
private GridLayout grid1;
int player1health = 20, player2health = 20, num;
String player1healthS = String.valueOf(player1health), player2healthS = String.valueOf(player2health), randomNumS = String.valueOf(num);
    public MTG(){
        super("Magic The Gathering Application");
        Container container = getContentPane();
        grid1 = new GridLayout(5, 2, 5, 5);
        container.setLayout(grid1);
        
        incrementP1 = new JButton("P1+");
        GUI gooey = new GUI();
        incrementP1.addActionListener(gooey);
        container.add(incrementP1);
        
        incrementP2 = new JButton("P2+");
        incrementP2.addActionListener(gooey);
        container.add(incrementP2);
        
        player1Name = new JTextField("Player 1");
        player1Name.setFont((new Font("Times New Roman", Font.BOLD, 32)));
        player1Name.setEditable(true);
        container.add(player1Name);
        
        player2Name = new JTextField("Player 2");
        player2Name.setFont((new Font("Times New Roman", Font.BOLD, 32)));
        player2Name.setEditable(true);
        container.add(player2Name);
        
        player1Health = new JTextField(player1health);
        player1Health.setFont((new Font("Times New Roman", Font.BOLD, 32)));
        player1Health.setText(player1healthS);
        player1Health.setEditable(false);
        container.add(player1Health);
        
        
        player2Health = new JTextField(player2healthS);
        player2Health.setText(player2healthS);
        player2Health.setFont((new Font("Times New Roman", Font.BOLD, 32)));
        player2Health.setEditable(false);
        container.add(player2Health);
        
        
        
        decrementP1 = new JButton("P1-");
        decrementP1.addActionListener(gooey);
        container.add(decrementP1);
        
        
        
        decrementP2 = new JButton("P2-");
        decrementP2.addActionListener(gooey);
        container.add(decrementP2);
        
        randomNumGen = new JButton("Roll for highest");
        randomNumGen.addActionListener(gooey);
        container.add(randomNumGen);
        
        randomNum = new JTextField("Gambling is wrong.");
        randomNum.setEditable(false);
        container.add(randomNum);
        
        setSize(500, 500);
        setVisible(true);
    }
    
    private class GUI implements ActionListener{
        public void actionPerformed (ActionEvent actionEvent){
            if (actionEvent.getSource()==incrementP1){
                player1health++;
                player1healthS = String.valueOf(player1health);
                player1Health.setText(player1healthS);
        }
            else if (actionEvent.getSource() == decrementP1){
                player1health--;
                player1healthS = String.valueOf(player1health);
                player1Health.setText(player1healthS);
            }
            
            else if (actionEvent.getSource()==incrementP2){
                player2health++;
                player2healthS = String.valueOf(player2health);
                player2Health.setText(player2healthS);
        }
            else if (actionEvent.getSource() == decrementP2){
                player2health--;
                player2healthS = String.valueOf(player2health);
                player2Health.setText(player2healthS);
            }
            else if(actionEvent.getSource()== randomNumGen){
               num = (int) (Math.random()*101);
               randomNumS = String.valueOf(num);
               randomNum.setText(randomNumS);
            }
        }
        
    }
    
    
    public static void main(String[] args) {
        
       MTG application = new MTG();
       application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
