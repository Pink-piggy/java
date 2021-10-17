package haha;

public class test3_24 {
	public static void main(String [] args){
		String []num = {"Ace","1","2","3","4","5",
				"6","7","8","9","10","Jack","Queen","King"};
		String []colors = {"Diamonds","Hearts","Spades","Clubs"};
		
		int c = (int)(Math.random() * 4);
		int n = (int)(Math.random() * 14);
		
		System.out.println("The Card you picked is " + num[n] + " of " +colors[c]+".");
	}
}
