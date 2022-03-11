class Teacher {
    private String name;            //3.f
    private int age;                //3.f
    private boolean isFemale;       //3.f

                                    //3.g,h
    public Teacher(String tmpName, int tmpAge, boolean isFemale) {
        this.name = tmpName;
        this.age = tmpAge;
        this.isFemale = isFemale;
    }

                                    //3.k method created to get and print name of instance
    public String getName() {
        return name;
    }
}
