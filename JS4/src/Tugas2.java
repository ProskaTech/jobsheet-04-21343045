/**
 * Created by 21343045_Farraz Hadyan
 */
public class Tugas2 {
    public static void main(String[] args){
        int i = 10;
        int j = 23;
        int x = 5;
        int highest;
        
        highest = (j >= i)? j:i;
        highest = (x>=highest)? x:highest;

        System.out.println("Variable values...");
        System.out.println("Number 1 = " + i);
        System.out.println("Number 2 = " + j);
        System.out.println("Number 3 = " + x);
        System.out.println("Nilai tertingginya adalah angka = " + highest);
    }
}
