/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

	
	
    public static int[] findWrongWayCow(final char[][] field) {
    	int cowIndex[] = new int[2];
    	int southFacing = 0;
    	int northFacing = 0;
    	int EastFacing = 0 ;
    	int westFacing = 0 ;
    	int northX=0;
    	int northY=0;
    	int southX=0;
    	int southY=0;
    	int westX=0;
    	int westY=0;
    	int eastX=0;
    	int eastY=0;
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        for (int i = 0; i<field.length; i++) {
        	for (int j = 0; j<field[i].length; j++) {
        		if (i<field.length-2 && field[i][j]=='c' && field[i+1][j]=='o') {
        			northFacing++;
        			northX=j;
        			northY=i;
        		}
        		else if (i>2 && field[i][j] == 'c' && field[i-1][j] == 'o') {
        			southFacing++;
        			southX=j;
        			southY=i;
        		}
        		else if (j<field[i].length-2 && field[i][j] == 'c' && field[i][j+1] == 'o') {
        			westFacing++;
        			westX=j;
        			westY=i;
        		}
        		else if (j>2 && field[i][j] == 'c' && field[i][j-1] == 'o') {
        			EastFacing++;
        			eastX=j;
        			eastY=i;
        		}
        	}
        }
        if (southFacing == 1) {
        	cowIndex = new int[]{southX, southY};
        	System.out.println(cowIndex[0] + " " + cowIndex[1]);
        	return cowIndex;
        }
        else if (northFacing ==1) {
        	cowIndex = new int[]{northX, northY};
        	System.out.println(cowIndex[0] + " " + cowIndex[1]);
        	return cowIndex;
        }
        else if (westFacing ==1) {
        	cowIndex = new int[]{westX, westY};
        	System.out.println(cowIndex[0] + " " + cowIndex[1]);
        	return cowIndex;
        }
        else if (EastFacing ==1) {
        	cowIndex = new int[]{eastX, eastY};
        	System.out.println(cowIndex[0] + " " + cowIndex[1]);
        	return cowIndex;
        }
        System.out.println("return null");
        return null;
    }
}
