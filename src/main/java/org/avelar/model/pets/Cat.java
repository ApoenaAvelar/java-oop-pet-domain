package org.avelar.model.pets;

public class Cat extends PetBase{
    public Cat(String name, String weigh, String registerId) {
        super(name, weigh, registerId);
    }

    public Cat(String name, String weigh, String registerId, String race) {
        super(name, weigh, registerId, race);
    }

    public void speak(){
        System.out.printf("The cat %s meowed", this.getName());
    }

    @Override
    public void getPetInfo() {
        System.out.println("It's a cat.");
        super.getPetInfo();
    }
}
