/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */ 

public class ASCIIArt {
	public static void main (String [] args) {
		
		tailwing(); 
		cockpit();
		System.out.println(""); 
		landinggearandbottom();
		label();
		
		}
	
	public static void tailwing() {
		
		System.out.println("             _|_");
		System.out.println("              |");
	}
	
	public static void wing() {
		
		System.out.print("___________");
	}
	
	public static void landinggearandbottom() {
		
		System.out.print("     ||");
		System.out.print("    \\_____/"); 
		System.out.print("    ||");
		System.out.println("");
		System.out.print("    /UU");
		System.out.print("               UU\\");
	}
	
	public static void cockpit() {
		
		System.out.print("            //|\\\\ ");
		System.out.println("");
		wing();
		System.out.print("/_____\\");; 
		wing();
		
	}
	
	public static void label() {
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Airplane"); 
	}
}