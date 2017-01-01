package main;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		LinkedList<Character> direction = new LinkedList<Character>();
		LinkedList<Integer> distance = new LinkedList<Integer>();
		String input = "R5, R4, R2, L3, R1, R1, L4, L5, R3, L1, L1, R4, L2, R1, R4, R4, L2, L2, R4, L4, R1, R3, L3, L1, L2, R1, R5, L5, L1, L1, R3, R5, L1, R4, L5, R5, R1, L185, R4, L1, R51, R3, L2, R78, R1, L4, R188, R1, L5, R5, R2, R3, L5, R3, R4, L1, R2, R2, L4, L4, L5, R5, R4, L4, R2, L5, R2, L1, L4, R4, L4, R2, L3, L4, R2, L3, R3, R2, L2, L3, R4, R3, R1, L4, L2, L5, R4, R4, L1, R1, L5, L1, R3, R1, L2, R1, R1, R3, L4, L1, L3, R2, R4, R2, L2, R1, L5, R3, L3, R3, L1, R4, L3, L3, R4, L2, L1, L3, R2, R3, L2, L1, R4, L3, L5, L2, L4, R1, L4, L4, R3, R5, L4, L1, L1, R4, L2, R5, R1, R1, R2, R1, R5, L1, L3, L5, R2";
		int index = 0;
		
		// Fill lists
		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			if (c == 'R' || c == 'L'){
				direction.add(index, c);
			}
			else if (c == ','){
				index++;
			}
			else if (c == ' '){
				// do nothing
			}
			else {
				System.out.println(input.charAt(index));
				try{
					int currentValue = distance.get(index) * 10;
					int newValue = currentValue + (int)c.charValue();
					distance.add(index, newValue);
				} catch (IndexOutOfBoundsException e) {
					int currentValue = 0;
					int newValue = currentValue + (int)c.charValue();
					distance.add(index, newValue);
				}
			}
		}
		/*
		for (Integer dist : distance){
			System.out.println(dist.intValue());
		}
		*/
	}

}
