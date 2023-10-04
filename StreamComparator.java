import java.util.Comparator;
public class StreamComparator implements Comparator<StudyGroup>{
    
    @Override 
    public int compare(StudyGroup o1,StudyGroup o2){
        return Integer.compare(o1.NumberofPersons, o2.NumberofPersons);

    }
}
