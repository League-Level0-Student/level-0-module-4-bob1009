import javax.swing.JOptionPane;

public class jfk {
public static void main(String[] args) {
	
	String jeff =JOptionPane.showInputDialog("SELECT A RECIPE: how make rat stew, how to make worm stew, how to make grandma stew ");
	
	if(jeff.equals("how to make rat stew")){
		JOptionPane.showMessageDialog(null,"cook rat(dead or alive) in water, diced onions, carrots and celery and cook for 20 minutes ");
}
	if(jeff.equals("how to make worm stew")){
		JOptionPane.showMessageDialog(null,"cook worm(dead or alive) in water, diced onions, carrots and celery and cook for 20 minutes ");
			}
	
	if(jeff.equals("how to make grandma stew")){
		JOptionPane.showMessageDialog(null,"cook grandma(dead or alive) in water, diced onions, carrots and celery and cook for 20 minutes ");
	}
	else {
		JOptionPane.showMessageDialog( null, "thats not a recipe silly"); 
	}}}