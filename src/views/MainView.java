package views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    private JTabbedPane tabsMain;
    private JPanel panelMain;
    private JPanel panelSearch;
    private JPanel panelFindReplace;
    private JPanel panelSearchSouth;
    private JPanel panelSearchNorth;
    private JTextArea textAreaSearch;
    private JScrollPane scrollSearch;
    private JTextField textFieldSearch;
    private JButton buttonSearch;
    private JLabel labelSearch;
    private JScrollPane scrollFindReplace;
    private JTextArea textAreaFindReplace;
    private JPanel panelFindReplaceNorth;
    private JTextField inputFind;
    private JTextField inputReplace;
    private JLabel labelFind;
    private JLabel labelReplace;
    private JPanel panelFindReplaceSouth;
    private JButton buttonFindReplace;

    public MainView() {
        setContentPane(panelMain);
        setTitle("Text Tools");
        setSize(500, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getSearchTerm(){
        return textFieldSearch.getText();
    }

    public String getSearchText(){
        return textAreaSearch.getText();
    }

    public String getFindTerm(){ return inputFind.getText(); }

    public String getReplaceTerm(){ return inputReplace.getText(); }

    public String getFindReplaceText() { return textAreaFindReplace.getText(); }

    public void displayError(String error){
        JOptionPane.showMessageDialog(this, error);
    }

    public void attachSearchListener(ActionListener listener){
        buttonSearch.addActionListener(listener);
    }

    public void attachFindReplaceListener(ActionListener listener){
        buttonFindReplace.addActionListener((listener));
    }
}
