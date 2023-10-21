package org.application;

import org.avelar.model.people.GenderEnum;
import org.avelar.model.pets.Cat;
import org.avelar.model.pets.Dog;
import org.avelar.model.people.Tutor;
import org.avelar.model.people.PetWalker;

import static org.avelar.model.people.GenderEnum.MAN;
import static org.avelar.model.people.GenderEnum.WOMAN;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Dog fisrtPet = new Dog("Brutus","10kg","BA875");
    private static Cat secpondPet = new Cat("Shiva", "5kg", "SP9876", "Sphinx");
    private static Tutor tutor1 = new Tutor("John", "11111111111", MAN,fisrtPet);
    private static Tutor tutor2 = new Tutor("Helena", "56478906544", WOMAN,secpondPet);
    private static PetWalker petwalker = new PetWalker("Adriano", "986000234", MAN);

    public static void main( String[] args )
    {
        System.out.println(tutor1.getName());
        System.out.println(tutor1.getPetInfo());
        tutor1.interact(fisrtPet);
    }
}
