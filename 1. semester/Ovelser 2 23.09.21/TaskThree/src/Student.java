class Student {
    private String name;                //3.c
    private int age;                    //3.c
    private boolean isFemale;           //3.c
    private String datamatikerTeam;     //3.c

                                        //3.d,e constructor with parameters for each field
    public Student(String tmpName, int tmpAge, boolean tmpIsFemale, String tmpDatamatikerTeam) {
        this.name = tmpName;
        this.age = tmpAge;
        this.isFemale = tmpIsFemale;
        this.datamatikerTeam = tmpDatamatikerTeam;
    }

                                        //3.l method created to get and print name of instance
    public String getName() {
        return name;
    }
    public String getDatamatikerTeam() {
        return datamatikerTeam;
    }
}
