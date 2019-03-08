package homeWokr;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.Arrays.asList;

public class a {
    public static void main(String[] args) {

        ArrayList bList = new ArrayList<>();
        Collection<Integer> collectionList = new ArrayList<Integer>(asList(1,2,3,4,5));


        for (int i = 0 ; i <2; i++){
            bList.add(new B());
            bList.add(new C());
        }


        for (int i = 0 ; i <bList.size(); i++){
            System.out.println(bList.get(i));
        }

        System.out.println(bList);

        collectionList.addAll(bList);
        System.out.println(collectionList);


    }
}
class B{

}

class C{

}