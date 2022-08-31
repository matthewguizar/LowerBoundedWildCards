import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main{

    //super makes it a lower bounded wildcard
    public static void showAll(List<? super Number> list){
        for (Object num : list){ //using object class since i is the parent of every class
            //using object because the wild card has no type (casting to object)
            System.out.println(num);
        }
    }


    public static void main(String[] args) {

        //Lower bounded wild cards allow the use any super/parent class
        List<? super Integer> l1 = new ArrayList<Integer>();
        List<? super Integer> l2 = new ArrayList<Number>();
        List<? super Integer> l3 = new ArrayList<Object>();

        //how to read items using lower bounded wildcard
        List<Serializable> list = new ArrayList<>(); //works because Number class implements serializable interface
        list.add("matthew");
        showAll(list);

        //insert items works with super not extends keyword (lowerbounded)
        List<? super Number> nums = new ArrayList<>();
        nums.add(23);
        nums.add(23.1);
        nums.add(23.0f);
    }
}