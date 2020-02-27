/*
 * Varun Chandra
 * CSE 360
 * ID: 1214474794
 */
package cse360assign2;
public class SimpleList {
	
	private int[] list;
	private int count;
	
	public SimpleList() {
		int[] list = new int[10];
		int count = 0;
	}
	
	public void add(int num) {
		int temp;
		int increase = (int) 0.5*list.length;
		for (int i=0; i<list.length; i++) {
			count++;
		}
		if (count<list.length) {
			num = list[0];
			for (int i=0; i<list.length-1; i++) {
				list[i]=list[i-1];
			}
			int length= list.length+increase;
			count++;
		}
		else {
			temp = list[list.length-1];
		}		
	}
	
	public void remove(int num) {
		for (int i=0; i<list.length; i++) {
			if(list[i]==num)
				list[i]=list[i+1];
		}
	}
	
	public int count() {
		for (int i=0; i<list.length; i++) {
			count++;
		}
		return count;
	}
	
	public String toString() {		
		return list.toString();
	}
	
	public int search(int num) {
		int index=0;
		for (int i=0; i<list.length; i++) {
			if(list[i]==num) {
				index = i;
				return index;
			}
		}
		return -1;
	}
}//end of class