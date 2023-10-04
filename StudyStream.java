import java.util.Iterator;

public class StudyStream extends Stream {
    
   @Override
   public Iterator<StudyGroup> iterator(){
       Iterator<StudyGroup> it = new Iterator<StudyGroup>(){
           private int index=0;
           @Override
          public boolean hasNext() {
           return index < stream.size();
    }
          @Override
          public StudyGroup next() {
            return stream.get(index++);

          }

    };
    return it;
   }
    
}
