class Dinosaur {

    // Fields
    private String speciesName;
    private int age;
    private int health;
    private int strength;
    private boolean isHungry;

    // Constructor
    public Dinosaur(String speciesName, int age, int health, int strength, boolean isHungry) {
        this.speciesName = speciesName;
        this.age = age;
        this.health = health;
        this.strength = strength;
        this.isHungry = isHungry;
    }

    // Feed method
    public void feedDinosaur() {
        isHungry = false;
        System.out.println(speciesName + " has been fed.");
    }

    // Roar method
    public void roar() {
        System.out.println(speciesName + " is roaring.");
    }

    // Getters and Setters
    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
    public String getSpeciesName() {
        return speciesName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }
    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
    public boolean isHungry() {
        return isHungry;
    }

    // Set the information of the assigned values for Rex, Nico and Erik
    public void printInfo() {
        System.out.println("name: " + speciesName);
        System.out.println("age: " + age);
        System.out.println("health: " + health);
        System.out.println("strength: " + strength);
        System.out.println("hungry: " + isHungry);
    }

    // Main
    public static void main(String[] args) {

        Dinosaur Axel = new Dinosaur("Turannosaurus Rex", 15, 100, 80, true);

        Dinosaur Nico = new Dinosaur("Nicosaurus", 12, 100, 50, false);



        // Assign values
        Axel.setSpeciesName("Axel");
        Axel.setAge(21);
        Axel.setHealth(2);
        Axel.setStrength(100);
        Axel.setHungry(true);

        // Print the information of the assigned values
        System.out.println("name: " + Axel.getSpeciesName());
        System.out.println("age: " + Axel.getAge());
        System.out.println("health: " + Axel.getHealth());
        System.out.println("strength: " + Axel.getStrength());
        System.out.println("Hungry?: " + Axel.isHungry());

        // Print for Nico
        Nico.printInfo();

        // Feed
        Axel.feedDinosaur(); // Feed Axel
        Nico.roar(); //Nico is raoaring

    }
}
