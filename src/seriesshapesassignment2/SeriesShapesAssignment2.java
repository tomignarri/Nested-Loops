
package seriesshapesassignment2;

// Thomas Ignarri
// 2.1.2018
// Assignment 2: Series Shapes
// 
// Using nested loops, this program diplays arithmetic progression
// in different visual configurations.

public class SeriesShapesAssignment2 {

    public static void main(String[] args) {
        int j = 10; 
        for (int i = 77; i >= 14; i = i - 7){
            for (int x = j; x <= 9; x++) {
                System.out.print(i + " ");  
            }
            System.out.println(i);
            j = j - 1;
        }
        Task2();
        Task3();
    }
    
    public static void Task2() {
        int j = 1; 
        int y = 10;
        
        for (int i = 77; i >= 14; i = i - 7){
            for (int x = j; x <= 9; x++) {
                System.out.print("   ");
            }
            for (int x = y; x <= 9; x++) {
                System.out.print(i + " ");
            }
            System.out.println(i);
            j = j + 1;
            y = y - 1;     
        } 
    } 
    
    public static void Task3() {
        int j = 1; 
        int y = 10;
        
        for (int i = 77; i >= 14; i = i - 7){
            for (int x = j; x <= 9; x++) {
                System.out.print("   ");
            }
            for (int x = y; x <= 10; x++) {
                System.out.print(i + " " + i + " ");
            }
            System.out.println();
            j = j + 1;
            y = y - 1;     
        } 
    }
}
