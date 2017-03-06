//import javax.swing.JFrame;

public class GUI {
	public static void main(String[] args) {
	
	/*	JFrame myFrame = new JFrame("");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setTitle("Ultimate Decision Maker");
        myFrame.setLocation(200, 200);
        myFrame.setSize(250, 200);
        myFrame.setVisible(true);*/
        
       
       int options = new Decision_Maker().OC();
       int number = new Decision_Maker().RNG(options);
       String[] anArray = new String[number];
       new Decision_Maker();
       anArray = Decision_Maker.array().clone();
       
     
       
       System.out.println("RND = " + number);
       System.out.println("Opciones = " + options);
       System.out.println();
       System.out.println("You're going to eat in: " + anArray[number-1]);
       
		
	}

}
