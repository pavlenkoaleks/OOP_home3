
public class StudyGroup implements Comparable<StudyGroup> {
    public String name;
    public int NumberofPersons;
    

    public StudyGroup(String name, int NumberofPersons) {
        this.name = name;
        this.NumberofPersons = NumberofPersons;
    }

    public String getName() {
        return name;
    }

    public int getNumberofPersons() {
        return NumberofPersons;
    }
    
    @Override 
    public int compareTo(StudyGroup o){
        return Integer.compare(this.NumberofPersons, o.NumberofPersons);

    }






   

    @Override
    public String toString() {
        return "Group  " +
                "Name:" + name + "  " +
                "NumberofPersons: " + NumberofPersons +"\n";
    }
}