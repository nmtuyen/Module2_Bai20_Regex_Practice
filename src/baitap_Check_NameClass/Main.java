package baitap_Check_NameClass;

import bai1_ValidateEmail.EmailExample;

public class Main {
    private static EmailExample emailExample;
    public static final String[] validName = new String[] {"C0318G", "M0318G", "P0323A"};
    public static void main(String[] args) {
        NameClass nameClass = new NameClass();
        for (String name: validName){
            boolean isvalid = nameClass.validate(name);
            System.out.println("Name class "+ name + " isvalid "+ isvalid);
        }
    }
}
