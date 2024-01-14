package org.application;

import org.avelar.model.pets.Cat;
import org.avelar.model.pets.Dog;
import org.avelar.model.people.Tutor;
import org.avelar.model.people.PetWalker;

import static org.avelar.model.people.GenderEnum.MAN;
import static org.avelar.model.people.GenderEnum.WOMAN;
import static org.avelar.model.petShop.PetShopServices.SALON;


public class App 
{
    private static final Dog firstPet = new Dog("Brutus","10kg","BA875");
    private static final Cat secondPet = new Cat("Shiva", "5kg", "SP9876", "Sphinx");
    private static final Tutor tutor1 = new Tutor("John", "11111111111", MAN,firstPet);
    private static final Tutor tutor2 = new Tutor("Helena", "56478906544", WOMAN,secondPet);
    private static final PetWalker petwalker = new PetWalker("Adriano", "986000234", MAN);

    public static void main( String[] args )
    {
        System.out.println("Tutor's name: " + tutor1.getName());
        System.out.println(tutor1.getPetInfo());
        tutor1.doPetShopping(SALON);

        System.out.println("Tutor's name: " + tutor2.getName());
        System.out.println(tutor2.getPetInfo());
        System.out.println("Pet walker: " + petwalker.getName());
        petwalker.hireService(firstPet);
        petwalker.hireService(secondPet);
        petwalker.getPetList();

        firstPet.speak();
        secondPet.speak();
    }
}
