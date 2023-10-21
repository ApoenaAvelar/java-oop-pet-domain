package org.avelar.model.pets;

public class PetBase implements Pet{

    private String name;
    private String weigh;
    private String registerId;
    private String race = "mixed-breed";

    public PetBase(String name, String weigh, String registerId) {
        this.name = name;
        this.weigh = weigh;
        this.registerId = registerId;
    }

    // constructor used when the Pet is a mixed-bree
    public PetBase(String name, String weigh, String registerId, String race) {
        this.name = name;
        this.weigh = weigh;
        this.registerId = registerId;
        this.race = race;
    }

    @Override
    public void walk(int distance) {

    }

    @Override
    public void play(int minutesToPlay) {

    }

    @Override
    public void eat(String food, int weight) {

    }

    @Override
    public void doPetShopping(PetShopServices service) {
        System.out.printf("The %S %s has used a pet shop service: %s", this.getClass().getName(),
                this.getName(), service.name());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeigh() {
        return weigh;
    }

    public void setWeigh(String weigh) {
        this.weigh = weigh;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void getPetInfo(){
        System.out.printf("Register: %s",this.getRegisterId());
        System.out.printf("Breed: %s",this.getRace());
        System.out.printf("Name: %s", this.getName());
        System.out.printf("Weigh: %s",this.getWeigh());
    }
}


