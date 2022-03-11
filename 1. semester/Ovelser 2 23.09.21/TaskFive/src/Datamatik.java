public class Datamatik {
    static Student[] students = new Student[]
            {   new Student("Muneeb",26,false,"B4"), new Student("Malene",34,true,"B2"),
                new Student("Mia",24,true,"B3"),
                new Student("Kim",27,false,"B4"),
                new Student("Jens",69,false,"B4"),
                new Student("Long",29,false,"B2"),
                new Student("Casper F",25,false,"B3"),
                new Student("Phil",27,false,"B2"),
                new Student("Denis",39,false,"B3"),
                new Student("Martin",28,false,"B2")   };                //5.a array of students

    public static void main(String[] args) {
        System.out.println(findStudentName(Integer.parseInt(args[0]), students));         //5.b function that takes int from args and array of students
        //System.out.println(findStudentIndex(args[0], students));                    //5.c function that takes String from args and array of students
    }

    static String findStudentName(int index, Student[] students){        //5.b function to find name of student with given index
        return 0>index || index > students.length ? "No student found" : students[index-1].getName() ;
    }

    static int findStudentIndex(String name, Student[] students){        //5.c function to return index of student with name(404 if not found)
        int index = 404;
        for (int i = 0 ; i < students.length ; i++) {
            if (students[i].getName().equals(name))
                index  = i;
        }
        return index != 404  ? index+1 : index;
    }
}
