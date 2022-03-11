

public class Datamatik {

    public static void main(String[] args) {                                                                            //3.i main method

        Teacher William = new Teacher("William",30,false);                                    //3.i Instane of Teacher
        Student Muneeb = new Student("Muneeb", 26, false, "B4");         //3.j Instane of student
        Student Kim = new Student("Kim", 28, false, "B4");               //3.j Instane of student

        System.out.println("The teachers name is "+William.getName());                                                  //3.k print name of teacher
        System.out.println("My name is "+Muneeb.getName()+" and my class fellows name is "                              //3.l print name, group of student
                +Kim.getName()+" and we are in group "+Muneeb.getDatamatikerTeam());
    }
}
