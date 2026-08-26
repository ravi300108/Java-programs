class FarmAnimal {
    String animalName;
    String animalPlace;
    String animalFood;
    String animalSound;

    FarmAnimal(String animalName,String animalPlace,String animalFood,String animalSound) {
        this.animalName=animalName;
        this.animalPlace=animalPlace;
        this.animalFood=animalFood;
        this.animalSound=animalSound;
    }

    void showDetails() {
        System.out.println("Animal Name : "+animalName);
        System.out.println("Lives At    : "+animalPlace);
        System.out.println("Food        : "+animalFood);
        System.out.println("Sound       : "+animalSound);
        System.out.println();
    }
}

public class FarmAnimalDemo {
    public static void main(String[] args) {
        FarmAnimal cow=new FarmAnimal("Cow","Cowshed","Grass","Moo");

        FarmAnimal pig=new FarmAnimal("Pig","Pigsty","Vegetables","Oink");

        FarmAnimal horse=new FarmAnimal("Horse","Stable","Grass","Neigh");

        cow.showDetails();
        pig.showDetails();
        horse.showDetails();
    }
}
