package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

import java.util.Scanner;

public class IceCreamAppV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriceList pricelist = new PriceList(1, 2, 3);
        IceCreamCar iceCreamCar = new IceCreamCar(pricelist, new Stock(83,30,50,60));

        boolean again = true;
        while(again){
            System.out.println("Welcome to the Ice Cream Car! What would you like to order?");
            System.out.println("1. Cone \n2. Ice Rocket \n3. Magnum");
            System.out.println("or type 4 to exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("What flavors would you like in your cone?");
                    System.out.println("1. Banana \n2. Chocolate \n3. Vanilla \n4. Lemon \n5. Straciatella \n6. Mokka \n7. Pistachiooo");

                    int flavor1 = scanner.nextInt();
                    System.out.println("2nd Flavor:");
                    int flavor2 = scanner.nextInt();
                    System.out.println("3rd Flavor:");
                    int flavor3 = scanner.nextInt();
                    Cone.Flavor[] flavors = {Cone.Flavor.values()[flavor1 - 1], Cone.Flavor.values()[flavor2 - 1],Cone.Flavor.values()[flavor3 - 1]};
                    Cone cone = iceCreamCar.orderCone(flavors);
                    System.out.println("You have ordered a Cone with " + flavors[0] + ", " + flavors [1] + " and " + flavors[2] + " flavors");
                    cone.eat();
                    break;
                case 2:
                    IceRocket iceRocket = iceCreamCar.orderIceRocket();
                    System.out.println("You have ordered an Ice Rocket");
                    iceRocket.eat();
                    break;
                case 3:
                    System.out.println("What type of Magnum would you like?");
                    System.out.println("1. Classic MILKCHOCOLATE \n2. Classic WHITECHOCOLATE \n3. Classic BLACKCHOCOLATE \n4. Alpeanuts \n5. Romantic");

                    int magnumType = scanner.nextInt();
                    Magnum.MagnumType type = Magnum.MagnumType.values()[magnumType - 1];
                    iceCreamCar.orderMagnum(type);
                    System.out.println("You have ordered a Magnum " + type.toString());
                    break;
                case 4:
                    again = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
                }
            }

            System.out.println("Total profit for the Ice Cream Salon is: " + iceCreamCar.getProfit());
        }
}