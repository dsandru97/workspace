package tests;
public class Chick {
 private String name = "Fluffy";
 { System.out.println("setting field");} // de ce nu merge fara {}?
 public Chick() {
	 name = "Tiny";
	 System.out.println("setting constructor");
 }
 public static void main(String[] args) {
	 Chick chick = new Chick();
	 System.out.println(chick.name); 
	 } 
 }