public class Main {
    public static class person {
        String name = "Muneeb";
        int age = 26;
        boolean happy = false;
    }

    public static void main(String[]args){
        person mee = new person();

        System.out.printf("Hi, my name is %s\n",mee.name);
        System.out.printf("I am %s years old%n",mee.age);
        if (mee.happy) {
            System.out.println("I clap my hands");
        } else{
            System.out.println("I don't clap my hands");
        }

    }

}
