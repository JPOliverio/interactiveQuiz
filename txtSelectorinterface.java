
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

public class txtSelectorinterface{

    String [] contents;
    int comboIndex;
    boolean selectCombo =false;
    JFrame txtFrame;

    
    txtSelectorinterface(){

    File dir = new File(System.getProperty("user.dir"));
    LinkedList<String> textFiles = new LinkedList<String>();
    for(File file: dir.listFiles()){
        if(file.getName().endsWith((".txt"))){
            textFiles.add(file.getName());
        }
    }

    contents = textFiles.toArray(new String[textFiles.size()]);

   
    txtFrame = new JFrame("Interactive Quiz");
    txtFrame.setSize(250,200);
    txtFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FlowLayout flowLay = new FlowLayout(FlowLayout.CENTER);
    flowLay.setHgap(100);
    txtFrame.setLayout(flowLay);

    JLabel txtLabel = new JLabel(" Plsease select a txt file and hit confirm ");
    txtFrame.add(txtLabel);

    JComboBox<String> comboBox = new JComboBox<String>(contents);
    txtFrame.add(comboBox);

    JButton txtButton = new JButton("Confirm");
    txtFrame.add(txtButton);
    txtFrame.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);


    txtButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            comboIndex = comboBox.getSelectedIndex();
            selectCombo = true;
            txtFrame.setVisible(false);
            txtFrame.dispose();
        }
     });
   


    txtFrame.setVisible(true);
    
}

public boolean getClickedCombo(){
    return selectCombo;
}

public String getTxtName(){
    return contents[comboIndex];
}
}
