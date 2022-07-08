package Homework25;

public class Main {

    public static void main(String[] args) {
        Guru guru=new Guru();
        guru.setLogic(new Add());
        System.out.println("3+2= "+guru.doSmthing(3,2));

        guru=new Guru();
        guru.setLogic(new Substract());
        System.out.println("6-4= "+guru.doSmthing(6,4));

        guru=new Guru();
        guru.setLogic(new Multiple());
        System.out.println("4*3= "+guru.doSmthing(4,3));
    }
}
