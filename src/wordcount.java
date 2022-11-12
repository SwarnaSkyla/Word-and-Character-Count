import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wordcount extends JFrame implements ActionListener {

    JTextArea textarea;
    JButton button1,button2;
    wordcount(){
        super("Words given");
        textarea=new JTextArea();
        textarea.setBounds(50,50,300,300);

        button1=new JButton("Word");
        button1.setBounds(50,350,150,40);
        button2=new JButton("Character");
        button2.setBounds(200,350,150,40);

        button1.addActionListener(this);
        button2.addActionListener(this);

        add(button1);
        add(button2);
        add(textarea);

        setSize(500,500);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        wordcount wordchar=new wordcount();
    }

    public void actionPerformed(ActionEvent e){
        String text=textarea.getText();
        if(e.getSource()==button1){
            String words[]=text.split("\\s");
            JOptionPane.showMessageDialog(this,"Total words: "+words.length);
        }
        if(e.getSource()==button2){
            JOptionPane.showMessageDialog(this,"Total characters including space: "+text.length());
        }
    }
}