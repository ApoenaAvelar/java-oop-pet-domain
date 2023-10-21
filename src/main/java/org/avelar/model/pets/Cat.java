package org.avelar.model.pets;



public class Cat extends PetBase{
    public Cat(String name, String weigh, String registerId) {
        super(name, weigh, registerId);
    }

    public Cat(String name, String weigh, String registerId, String breed) {
        super(name, weigh, registerId, breed);
    }

    public void speak(){
        System.out.printf("The cat %s meowed \n", this.getName());
    }


}
