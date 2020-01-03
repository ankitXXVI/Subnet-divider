package subnetDivider;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SubnetDivider {

	public static void main(String[] args) {
		
		String IPV4Add = "0.0.0.0";
		String NetMask = "/0";
		double Subnet;
		int BitsLent = 0;
		byte operator = 2;
		int ncounter = 1;
		int MagicNum = 128;
		int newMask;
		Pattern ipPattern = Pattern.compile("[0-9]*.[0-9]*.[0-9]*.[0-9]*");
		Pattern maskPattern = Pattern.compile("/[0-9]*");
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce your IPV4 Network address:");
		if(in.hasNext(ipPattern)) {
			IPV4Add = in.nextLine();
		}
		else {
			System.out.println("Invalid IP!");
			restart(args, in);
		}
		
		String[] stringIPAddr = IPV4Add.split("\\.");
		int[] ipAddr = new int[4];
		for(int i = 0; i < 4; i++) {
		    ipAddr[i] = Integer.parseInt(stringIPAddr[i]);
		}
		System.out.println("");
		System.out.println("Introduce your Network Mask prefix length:");
		if(in.hasNext(maskPattern)){
			NetMask = in.nextLine();
		}
		else {
			System.out.println("Invalid Mask!");
			restart(args, in);
		}
		
		System.out.println("");
		System.out.println("How many subnets do you require?");
		Subnet = in.nextDouble();
		System.out.println("");
		
		while((Math.pow(operator, ncounter)) <= Subnet || (Math.pow(operator, ncounter)) < (Subnet * 2)) {
			BitsLent = ncounter;	
			ncounter++;
		}
		
		newMask = ((Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent));
		
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 1) {	
			MagicNum = 128;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 2) {	
			MagicNum = 64;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 3) {	
			MagicNum = 32;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 4) {	
			MagicNum = 16;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 5) {	
			MagicNum = 8;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 6) {	
			MagicNum = 4;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 7) {	
			MagicNum = 2;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 8) {	
			MagicNum = 1;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 9) {	
			MagicNum = 128;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 10) {	
			MagicNum = 64;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 11) {	
			MagicNum = 32;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 12) {	
			MagicNum = 16;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 13) {	
			MagicNum = 8;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 14) {	
			MagicNum = 4;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 15) {	
			MagicNum = 2;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 16) {	
			MagicNum = 1;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 17) {	
			MagicNum = 128;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 18) {	
			MagicNum = 64;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 19) {	
			MagicNum = 32;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 20) {	
			MagicNum = 16;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 21) {	
			MagicNum = 8;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 22) {	
			MagicNum = 4;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 23) {	
			MagicNum = 2;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 24) {	
			MagicNum = 1;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 25) {	
			MagicNum = 128;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 26) {	
			MagicNum = 64;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 27) {	
			MagicNum = 32;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 28) {	
			MagicNum = 16;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 29) {	
			MagicNum = 8;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 30) {	
			MagicNum = 4;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 31) {	
			MagicNum = 2;
		}
		if(Integer.parseInt(NetMask.substring(1, NetMask.length())) + BitsLent == 32) {	
			MagicNum = 1;
		}

		for(int i = 0; i < Subnet; i++) {
	        System.out.print("Subnet " + i + " Net Address: " +
	                ipAddr[0] + "." + ipAddr[1] + "." + ipAddr[2] + "." + ipAddr[3] + "/" + newMask + " to ");
	        nextAddr(ipAddr, MagicNum);
	        System.out.println(ipAddr[0] + "." + ipAddr[1] + "." + ipAddr[2] + "." + ipAddr[3] + "/" + newMask);
	        increment(ipAddr);
	        System.out.println("");
	    }		
		restart(args, in);
	}
	
	private static void nextAddr(int[] number, int MagicNum) {
		if(number[3] == 0) {
			number[3] = (MagicNum - 1);
		}
		else {
			number[3] = number[3] + (MagicNum - 1);
		}
	}
	
	private static void increment(int[] number) {
	    int carry = 1;
	    for(int i = 3; i >= 0; i--) {
	        number[i] = number[i] + carry;
	        if(number[i] == 256) {
	            carry = 1;
	            number[i] = 0;
	        } else {
	        	carry = 0;
	        }
	    }
	}
	
	private static void restart(String[] args, Scanner in) {
		System.out.println("");
		System.out.println("Press <Enter> to try again");
		if(in.nextLine() != null) {
			in.nextLine();
			clearScreen();
			main(args);
		}	
	}
	
	private static void clearScreen() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}