public class Main {
    public static void main(String[]args){

        person mee = new person( "Muneeb", 26, false);

        System.out.printf("Hi, my name is %s \n",mee.name);
        System.out.printf("I am %s years old",mee.age);
        if (mee.happy) {
            System.out.println("I clap my hands");
        } else{
            System.out.println("I don't clap my hands");
        }

    }

}
