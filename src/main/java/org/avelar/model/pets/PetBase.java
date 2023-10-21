package org.avelar.model.pets;

public class PetBase implements Pet{

    private final String petKind;
    private String name;
    private String weigh;
    private String registerId;
    private String breed = "mixed-breed";

    public PetBase(String name, String weigh, String registerId) {
        this.name = name;
        this.weigh = weigh;
        this.registerId = registerId;
        this.petKind  = this.getClass().getSimpleName();
    }

    // constructor used when the Pet is a mixed-bree
    public PetBase(String name, String weigh, String registerId, String breed) {
        this.name = name;
        this.weigh = weigh;
        this.registerId = registerId;
        this.breed = breed;
        this.petKind  = this.getClass().getSimpleName();
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
        return breed;
    }

    public void setRace(String race) {
        this.breed = race;
    }

    @Override
    public String toString() {
        return petKind + " " +
                "name='" + name + '\'' +
                ", weigh='" + weigh + '\'' +
                ", registerId='" + registerId + '\'' +
                ", race='" + breed + '\'' +
                '}';
    }


}


