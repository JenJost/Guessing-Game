import java.util.Random; /// this helps generate a random number
import javax.swing.JOptionPane; // this is the input box

public class GuessANumber {

   
    public static void main(String[] args) {
        
        //This generates a random number between 1 and 10.
        Random number = new Random();
        int answer = number.nextInt(10);     
        
        //This prompts the user for the first guess and changes it to an int.
        String prompt = JOptionPane.showInputDialog("Guess a number between 1 and 10:");
        int guess = Integer.parseInt(prompt);
        
        //This compares the randomly generated number to the input
        while(guess != answer) {
            
        if(guess < answer) {
        prompt = JOptionPane.showInputDialog("Too Low. Guess again:");
        guess = Integer.parseInt(prompt);   
        } else {
        prompt = JOptionPane.showInputDialog("Too High. Guess again:");
        guess = Integer.parseInt(prompt); 
        }  
        
        }
        JOptionPane.showMessageDialog(null, "You got it!");
        
        System.exit(0);
       
    }
    
}
