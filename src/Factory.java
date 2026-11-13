public class Factory {
    //bring Birds into factory
    public Birds birdOrder1;
    public int randomNumber;


    //
    public static void main(String[] args) {
        Factory a = new Factory();
    }//end of psvm
    //new constructor
    public Factory() {

        randomNumber = (int)(Math.random() * 100) +1;

        //bringing info into factory, filling int variable
        birdOrder1 = new Birds(randomNumber);
        //using method to change numberOfBirds + 1
        birdOrder1.addBirds();
        //using method to change Species
        birdOrder1.changeSpecies();
        System.out.println("they ordered " + birdOrder1.numberOfBirds + " birds");
        System.out.println("it is " + birdOrder1.isParrot + " that the bird is a parrot");
        System.out.println("the bird species is a " + birdOrder1.Species);
    }//end of constructor Factory
}//end of file
