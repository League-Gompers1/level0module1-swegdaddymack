package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
public static void main(String[] args) {
	int number;
	Random ran = new Random();
	number = ran.nextInt(100);
	System.out.println();
	if(number ==100){
		JOptionPane.showMessageDialog(null,"Yes");
	}
	int random;
	for (int i=0; i<100; i++) {
	String ans= JOptionPane.showInputDialog("Guess my number");
	int guess = Integer.parseInt(ans);
	if (guess > number) {JOptionPane.showMessageDialog(null, "it's too high");}
	else if (guess < number) {JOptionPane.showMessageDialog(null, "it's too low");}
	else{ JOptionPane.showMessageDialog(null, "You're right");
		i = 100;}
	}
		
		
		
	}	
}
