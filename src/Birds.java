public class Birds {
        //variables
        public int numberOfBirds;
        public boolean isParrot;
        public String Species;
//constructor
    public Birds(int birdNumber){

        numberOfBirds = birdNumber;
        isParrot = false;
        Species = "Parakeet";

    }//end of Shoes constructor
//PrintInfo
        public void PrintInfo(){

        System.out.println("They ordered " + numberOfBirds + " shoes");
        System.out.println("It is " + isParrot + " that the shoes are kid size");
        System.out.println("The brand type is " + Species);

    }//end of PrintInfo
//add 1 to numberOfBirds
    public void addBirds(){

        numberOfBirds++;

    }
//change Species
    public void changeSpecies(){

        Species = "blue parakeet";

    }

    }//end of file

