package org.avelar.model.pets;

public interface Pet {
    public void walk(int distance);
    public void play(int minutesToPlay);
    public void eat(String food, int weight);
    public void doPetShopping(PetShopServices service);
    public void getPetInfo();

}
