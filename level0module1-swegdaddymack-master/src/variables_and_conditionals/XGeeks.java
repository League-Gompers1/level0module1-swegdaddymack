package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
String joshuasPower = "inspiration";
String danielsPower = "hacking";
String ebukasPower = "endurance";
String christophersPower = "reading";
String jesusPower = "speed";
String jasonsPower = "smarts";
String alfredosPower = "gaming";
String chrisPower = "math";
        // 2. Ask the user to enter a name. Store their answer in a variable.
String name =JOptionPane.showInputDialog("Enter a Name");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
if(name.equals("daniels")){
JOptionPane.showMessageDialog(null,"Daniel's superpower is "+danielsPower);
}else if(name.equals("ebukas")){
JOptionPane.showMessageDialog(null,"Ebuka's superpower is "+ebukasPower);
    }else if(name.equals("christophers")){
JOptionPane.showMessageDialog(null,"Christopher's superpower is "+christophersPower);
}else if(name.equals("jesus")){
	JOptionPane.showMessageDialog(null,"Jesus's superpower is "+jesusPower);
}else if(name.equals("jasons")){
	JOptionPane.showMessageDialog(null,"Jasons's superpower is "+jasonsPower);
}
}
}