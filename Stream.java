import java.util.ArrayList;
import java.util.List;

public abstract class Stream implements Iterable<StudyGroup> {
    

    public List<StudyGroup> stream;
    int index;
    public Stream(){
        stream = new ArrayList<>();
        index = 0;

    }

    public void addComponent(StudyGroup group){
        stream.add(group);

    }
   
    



}
