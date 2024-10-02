import java.util.Scanner;
public class temparature_coverter {
    public static double conCeltoFaren(double celsius){
        return (celsius * 9/5) + 32;
    }
    public static double conFarentoCel(double Fahrenheit){
        return (Fahrenheit - 32) * 5/9;
    }
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter the temparature: ");
        double temparature = sk.nextDouble();
        System.out.println("Enter the unit of measurement(C for celsius, F for fahrenheit):");
        String unit = sk.next().toUpperCase();

        double convertedTemparature;

        if(unit.equals("C")){
            convertedTemparature = conCeltoFaren(temparature);
            System.out.println("The converted temparature is: "+ convertedTemparature+ "F");
        }
        else if(unit.equals("F")){
            convertedTemparature = conFarentoCel(temparature);
            System.out.println("The converted temparature is: "+ convertedTemparature+ "C");
        }
        else{
            System.out.println("Invalid unit of measurement. please use 'C' for Celsius and 'F' for Fahrenheit");
        }
    }
}