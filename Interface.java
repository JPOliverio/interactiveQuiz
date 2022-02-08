import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Container;

public class Interface {
    JFrame frame;
    JTextArea textArea;
    int solutionKey;
    JTextArea qOneText, qTwoText, qThreeText, qFourText, qFiveText,
    qSixText, qSevenText, qEightText, qNineText, qTenText;
    Container contentPane;


    Interface(){
        
        frame = new JFrame("Interactive Quiz");
        frame.setSize(550,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        JScrollPane paneTextArea = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        //frame.add(textArea);

        contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        paneTextArea.setPreferredSize(new DimensionUIResource(500,100));
        contentPane.add(paneTextArea);

        JButton buttonOne = new JButton();
        contentPane.add(buttonOne); 
        JTextArea qOneText = new JTextArea(" lets go mounitan mamas i like to eat giant gnats");
        contentPane.add(qOneText);

        JButton buttonTwo = new JButton();
        contentPane.add(buttonTwo);
        JTextArea qTwoText = new JTextArea(" question two");
        contentPane.add(qTwoText);

        JButton buttonThree = new JButton();
        contentPane.add(buttonThree);
        JTextArea qThreeText = new JTextArea(" question Three");
        contentPane.add(qThreeText);

        JButton buttonFour = new JButton();
        contentPane.add(buttonFour);
        JTextArea qFourText = new JTextArea(" question Four");
        contentPane.add(qFourText);

        JButton buttonFive = new JButton();
        contentPane.add(buttonFive);
        JTextArea qFiveText = new JTextArea(" question Five");
        contentPane.add(qFiveText);

        JButton buttonSix = new JButton();
        contentPane.add(buttonSix);
        JTextArea qSixText = new JTextArea(" question Six");
        contentPane.add(qSixText);

        JButton buttonSeven = new JButton();
        contentPane.add(buttonSeven);
        JTextArea qSevenText = new JTextArea(" question Seven");
        contentPane.add(qSevenText);

        JButton buttonEight = new JButton();
        contentPane.add(buttonEight);
        JTextArea qEightText = new JTextArea(" question Eight");
        contentPane.add(qEightText);

        JButton buttonNine = new JButton();
        contentPane.add(buttonNine);
        JTextArea qNineText = new JTextArea(" question Nine");
        contentPane.add(qNineText);

        JButton buttonTen = new JButton();
        contentPane.add(buttonTen);
        JTextArea qTenText = new JTextArea(" question Ten");
        contentPane.add(qTenText);



        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, paneTextArea, 0, SpringLayout.HORIZONTAL_CENTER, contentPane);

        layout.putConstraint(SpringLayout.WEST, buttonOne, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonOne, 10, SpringLayout.SOUTH, paneTextArea);
        layout.putConstraint(SpringLayout.WEST, qOneText, 15, SpringLayout.EAST, buttonOne);
        layout.putConstraint(SpringLayout.NORTH, qOneText, 15, SpringLayout.SOUTH, paneTextArea);

        layout.putConstraint(SpringLayout.WEST, buttonTwo, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonTwo, 10, SpringLayout.SOUTH, buttonOne);
        layout.putConstraint(SpringLayout.WEST, qTwoText, 15, SpringLayout.EAST, buttonTwo);
        layout.putConstraint(SpringLayout.NORTH, qTwoText, 15, SpringLayout.SOUTH, buttonOne);

        layout.putConstraint(SpringLayout.WEST, buttonThree, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonThree, 10, SpringLayout.SOUTH, buttonTwo);
        layout.putConstraint(SpringLayout.WEST, qThreeText, 15, SpringLayout.EAST, buttonThree);
        layout.putConstraint(SpringLayout.NORTH, qThreeText, 15, SpringLayout.SOUTH, buttonTwo);

        layout.putConstraint(SpringLayout.WEST, buttonFour, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonFour, 10, SpringLayout.SOUTH, buttonThree);
        layout.putConstraint(SpringLayout.WEST, qFourText, 15, SpringLayout.EAST, buttonFour);
        layout.putConstraint(SpringLayout.NORTH, qFourText, 15, SpringLayout.SOUTH, buttonThree);

        layout.putConstraint(SpringLayout.WEST, buttonFive, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonFive, 10, SpringLayout.SOUTH, buttonFour);
        layout.putConstraint(SpringLayout.WEST, qFiveText, 15, SpringLayout.EAST, buttonFive);
        layout.putConstraint(SpringLayout.NORTH, qFiveText, 15, SpringLayout.SOUTH, buttonFour);

        layout.putConstraint(SpringLayout.WEST, buttonSix, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonSix, 10, SpringLayout.SOUTH, buttonFive);
        layout.putConstraint(SpringLayout.WEST, qSixText, 15, SpringLayout.EAST, buttonSix);
        layout.putConstraint(SpringLayout.NORTH, qSixText, 15, SpringLayout.SOUTH, buttonFive);

        layout.putConstraint(SpringLayout.WEST, buttonSeven, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonSeven, 10, SpringLayout.SOUTH, buttonSix);
        layout.putConstraint(SpringLayout.WEST, qSevenText, 15, SpringLayout.EAST, buttonSeven);
        layout.putConstraint(SpringLayout.NORTH, qSevenText, 15, SpringLayout.SOUTH, buttonSix);

        layout.putConstraint(SpringLayout.WEST, buttonEight, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonEight, 10, SpringLayout.SOUTH, buttonSeven);
        layout.putConstraint(SpringLayout.WEST, qEightText, 15, SpringLayout.EAST, buttonEight);
        layout.putConstraint(SpringLayout.NORTH, qEightText, 15, SpringLayout.SOUTH, buttonSeven);

        layout.putConstraint(SpringLayout.WEST, buttonNine, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonNine, 10, SpringLayout.SOUTH, buttonEight);
        layout.putConstraint(SpringLayout.WEST, qNineText, 15, SpringLayout.EAST, buttonNine);
        layout.putConstraint(SpringLayout.NORTH, qNineText, 15, SpringLayout.SOUTH, buttonEight);

        layout.putConstraint(SpringLayout.WEST, buttonTen, 15, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, buttonTen, 10, SpringLayout.SOUTH, buttonNine);
        layout.putConstraint(SpringLayout.WEST, qTenText, 15, SpringLayout.EAST, buttonTen);
        layout.putConstraint(SpringLayout.NORTH, qTenText, 15, SpringLayout.SOUTH, buttonNine);

        frame.setVisible(true);

    }

// this line updates the interface with the new question
    public void updateInterface(String question, String[] choices, int solution, int numberOfChoices){
        frame.setVisible(false);
        solutionKey = solution;

                // this section updaes the question
                textArea.setText(question);

        // this section resets the text fields
        if(choices[0]!=null){ qOneText.setText(choices[0]);
            }else if(choices[1]!=null){qTwoText.setText(choices[1]); 
                }else if(choices[2]!=null){qThreeText.setText(choices[2]); 
                 }else if(choices[3]!=null){qFourText.setText(choices[3]); 
                    }else if(choices[4]!=null){qFiveText.setText(choices[4]);
                        }else if(choices[5]!=null){qSixText.setText(choices[5]);
                            }else if(choices[6]!=null){qSevenText.setText(choices[6]);
                                }else if(choices[7]!=null){qEightText.setText(choices[7]);
                                    }else if(choices[7]!=null){qNineText.setText(choices[8]);
                                        }else if(choices[9]!=null){qTenText.setText(choices[9]);
                                        }

    }
    
}
