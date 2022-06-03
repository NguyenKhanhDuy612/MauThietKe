/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CreationalPattern.Bai2_BuilderPattern;

/**
 *
 * @author Admin
 */
public class MyStringBuilderMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder myStringBuilder = new MyStringBuilder.Builder()
                .addString("Duy", "cntt")
                .addFloat((float)7.5)
                .addBool(true)
                .builder();
        
        System.out.println(myStringBuilder.toString());
    }
    
}
