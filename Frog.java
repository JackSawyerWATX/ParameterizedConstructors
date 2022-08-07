public class Frog extends Amphibian{
    //Frogs live an average of 2-10 years in the wild. Therefore, each frog can have a different length of life.
    int lifeCycle;
   
   //parameterized Frog constructor
    public Frog(String name, String color, int lifeCycle) {
     super(name, color);
     this.lifeCycle = lifeCycle;
    }
   
   //method to get the results of the values of my object
    public void whatAmI() {
     System.out.println("I am a " + super.name 
       + " my colors consist of " + super.color + " and I generally live about " 
       + this.lifeCycle + " years!");
    }
   }