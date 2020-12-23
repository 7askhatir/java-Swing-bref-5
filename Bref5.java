/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bref.quez;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Bref5 implements ActionListener {
    
    
    String[] Question= { "JAVA est un langage",
                         "Toutes les classes héritent de la classe",
                         "Par convention une classe ",
                         "Est-ce que on peut avoir plusieurs constructeurs pour la même classe",
                         "BDans la ligne \"public class A implements B\", B est",
                         "Après la compilation, un programme écrit en\n" +
                         "JAVA, il se transforme en programme en bytecode Quelle )\n" +
                         " est l’extension du programme en bytecode ?",
                         "Class Test{ Public Test () { System.out.println(”Bonjour”);}\n" +
                        "public Test (int i) { this();\n" +
                        "System.out.println(”Nous sommes en ”+i+ ” !”);}; }\n" +
                        "qu’affichera l’instruction suivante?\n" +
                        "Test t1=new Test (2018);",
                         "Voici un constructeur de la classe Employee, y-at'il un problème Public void Employe(String n){ Nom=n;}",
                         "Pour spécifier que la variable ne pourra plus être\n" +
                         "modifiée et doit être initialisée dès sa déclaration,\n" +
                         "on la déclare comme une constante avec le mot réservé",
                         "Dans une classe, on accède à ses variables grâce au mot clé",
                         "calculerSalaire(int)\n" +
                         "calculerSalaire(int, double) La méthode calculerSalaire est :",
                         "Une classe qui contient au moins une méthode abstraite doit être déclarée abstraite. ",
                         "Est-ce qu’une classe peut implémenter plusieurs interfaces ?",
                         "La déclaration d'une méthode suivante :\n" +
                         "public void traitement() throws IOException précise que la méthode propage une exception contrôlée",
                         "class Test{\n" +
                            "public static void main (String[] args) {\n" +
                            "try {\n" +
                            "int a =10; System.out.println (\"a = \" + a );\n" +
                            "int b = 0 / a; System.out.println (\"b = \" + b); }\n" +
                            "catch(ArithmeticException e)\n" +
                            "{System.out.println (\"diviser par 0!\"); } finally\n" +
                            "{System.out.println (\"je suis à l’intérieur de finally\");}}}",
                        
                        };
    String[][] Repons={{"Compilé","Interprété","Compilé et interpreté",""},
                       {"Main","Object","AWT",""},
                       {"est en minuscule","commence par une majuscule","est en majuscules",""},
                       {"oui","non","",""},
                       {"Interfacce","Classe paren","Package",""},
                       {"aucun des choix",".JAVA",".Class",""},
                       {"aucun des choix","Bonjour Nous sommes en 2018 !","Nous sommes en 2018 !",""},
                       {"Vrai","Faux","",""},
                       {"aucun des choix","final","const",""},
                       {"aucun des choix","this","super",""},
                       {"aucun des choix","surchargée","redéfinie"," "},
                       {"Vrai","Faux","",""},
                       {"Vrai","Faux","",""},
                       {"Vrai","Faux","",""},
                       {"aucun des choix","a=10 b=0 Je suis à l’intérieur de finally","a=10 b=0\n diviser par 0! je suis à l’intérieur de finally"," "},
    };
    char[] Cas ={'1',
                 '2',
                 '3',
                 '1',
                 '1',
                 '2',
                 '2',
                 '2',
                 '1',
                 '1',
                 '2',
                 '2',
                 '2',
                 '1',
                 '2',
        
    };
        JFrame frame=new JFrame();
        JTextField textfield=new JTextField();
        JTextArea textarea=new JTextArea();
        JButton button1=new JButton();
        JButton button2=new JButton();
        JButton button3=new JButton();
        JButton button4=new JButton();
        int a;
        
        JLabel rep1= new JLabel();
        JLabel rep2= new JLabel();
        JLabel rep3= new JLabel();
        JLabel rep4= new JLabel();
        JButton next= new JButton();
        JButton next2= new JButton();
        JTextField nbr=new JTextField();
        JTextField per=new JTextField();
        int j;
        int toutle_q=Question.length;
        int porsontage;
    Bref5(int a){
        this.a=a;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(680,770);
        frame.getContentPane().setBackground(new Color(200,200,200));
        
        textfield.setBounds(0, 0,650,50);
        textfield.setBackground(new Color(25,25,25));
        textfield.setEditable(false);
        textfield.setFont(new Font("MV BOLI",Font.BOLD,35));
        textfield.setForeground(Color.yellow);
        /*textfield.setText("LV 1: : Question"+l.get(j).IQ);  */      
        textfield.setHorizontalAlignment(JTextField.CENTER);
        
        textarea.setBounds(0, 50,650,170);
        textarea.setBackground(new Color(25,25,25));
        textarea.setLineWrap(true);
        textarea.setEditable(false);
        textarea.setFont(new Font("MV BOLI",Font.BOLD,20));
        textarea.setForeground(Color.white);
        /*textarea.setText("Q "+l.get(j).IQ+": "+l.get(j).Question); */
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        
        button1.setBounds(0, 220, 100, 100);
        button1.setFont(new Font("MV BOLI",Font.BOLD,35));
        button1.setFocusable(false);
        button1.addActionListener(this);
        button1.setText("1");
        
        button2.setBounds(0, 320, 100, 100);
        button2.setFont(new Font("MV BOLI",Font.BOLD,35));
        button2.setFocusable(false);
        button2.addActionListener(this);
        button2.setText("2");
        
        button3.setBounds(0, 420, 100, 100);
        button3.setFont(new Font("MV BOLI",Font.BOLD,35));
        button3.setFocusable(false);
        button3.addActionListener(this);
        button3.setText("3");
        
        button4.setBounds(0, 520, 100, 100);
        button4.setFont(new Font("MV BOLI",Font.BOLD,35));
        button4.setFocusable(false);
        button4.addActionListener(this);
        button4.setText("4");
        
        rep1.setBounds(125, 220, 500, 100);
        rep1.setBackground(new Color(150,150,150));
        rep1.setFont(new Font("MV BOLI",Font.BOLD,25));
        rep1.setForeground(Color.BLACK);
        /*rep1.setText(l.get(j).Repons[0][1]);*/
        
        rep2.setBounds(125, 320, 500, 100);
        rep2.setBackground(new Color(150,150,150));
        rep2.setFont(new Font("MV BOLI",Font.BOLD,25));
        rep2.setForeground(Color.BLACK);
        /*rep2.setText(l.get(j).Repons[1][1]);*/
        
        rep3.setBounds(125, 420, 500, 100);
        rep3.setBackground(new Color(150,150,150));
        rep3.setFont(new Font("MV BOLI",Font.BOLD,25));
        rep3.setForeground(Color.BLACK);
        /*rep3.setText(l.get(j).Repons[2][1]);*/
        
        rep4.setBounds(125, 520, 500, 100);
        rep4.setBackground(new Color(150,150,150));
        rep4.setFont(new Font("MV BOLI",Font.BOLD,25));
        rep4.setForeground(Color.BLACK);
        /*rep4.setText(l.get(j).Repons[3][1]);*/
        
        next.setBounds(535, 630, 100, 100);
        next.setFont(new Font("MV BOLI",Font.BOLD,25));
        next.addActionListener(this);
        next.setText("Next");
        
        next2.setBounds(0, 630, 100, 100);
        next2.setFont(new Font("MV BOLI",Font.BOLD,25));
        next2.addActionListener(this);
        
        
        per.setBounds(225,325,200,100);
        per.setBackground(new Color(25,25,25));
        per.setForeground(Color.red);
        per.setFont(new Font("MV BOLI",Font.BOLD,25));
        per.setHorizontalAlignment(JTextField.CENTER);
        per.setEnabled(false);
        
        
        frame.add(next);
        frame.add(rep4);
        frame.add(rep3);
        frame.add(rep2);
        frame.add(rep1);
        frame.add(textarea);
        frame.add(textfield);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setLayout(null);
        frame.setVisible(true); 
        nextQ(this.a);
        
    }
    public void nextQ(int b){
        
        System.out.print(b);
     if(b+j>=b+5){
            per.setText(" "+porsontage+"%");
            
            if(b==0 &&porsontage >=40){
             next2.setText("LV2");frame.add(next2);
            }
            if(b==5 && porsontage >=60){
                next2.setText("LV3");frame.add(next2);
            }
            if(b==10 && porsontage >=80){
                next2.setText("FIN");frame.add(next2);
            }
            frame.add(per);
     }
     else{
        textfield.setText("LV"+((b/5)+1)+"- Question :"+(j+1));
        textarea.setText(Question[j+b]);
        rep1.setText(Repons[j+b][0]);
        rep2.setText(Repons[j+b][1]);
        rep3.setText(Repons[j+b][2]);
        rep4.setText(Repons[j+b][3]);
     }
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String str=ae.getActionCommand();

        switch(str){
            case "Next":porsontage+=0;j++;nextQ(a);
            break;
            case "1":if('1'==Cas[j+a])porsontage+=20;else porsontage+=0;j++;nextQ(a);break;        
            case "2":if('2'==Cas[j+a])porsontage+=20;else porsontage+=0;j++;nextQ(a);break;         
            case "3":if('3'==Cas[j+a])porsontage+=20;else porsontage+=0;j++;nextQ(a);break;           
            case "4":if('4'==Cas[j+a])porsontage+=20;else porsontage+=0;j++;nextQ(a);break;  
            case "LV2" :   new  Bref5(5);break;
            case "LV3" :  new Bref5(10);break;
            case "Fin" : JOptionPane.showMessageDialog(null, "You wiiin" , "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                              
                                                 
        }  
    }
        public static void main(String[] args) {

        Bref5 b1= new Bref5(0);
        
         
    }



}
