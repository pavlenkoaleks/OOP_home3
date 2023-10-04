import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {
    

    public static void main(String[] args) {
       StudyGroup group1= new StudyGroup("чебурашки",330);
       StudyGroup group2= new StudyGroup("телепузики",30);
       StudyGroup group3= new StudyGroup("птерадактели",15);
       StudyGroup group4= new StudyGroup("яйцеголовые",189);
       

        Stream stream = new StudyStream();
       stream.addComponent(group1);
       stream.addComponent(group2);
       stream.addComponent(group3);
       stream.addComponent(group4);

       for (var studygr: stream){
        System.out.println(studygr);
       }

      List<StudyGroup> list = new ArrayList<>();
      list.add(group1);
       list.add(group2);
        list.add(group3);
         list.add(group4);

      //Collections.sort(list);
      list.sort(new StreamComparator());
      System.out.println(list);





        
        }



}
