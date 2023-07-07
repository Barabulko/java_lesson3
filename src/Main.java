import java.util.ArrayList;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task3();
        }

    public static void task3() {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for (Object o: list){
            System.out.println(o);
        }
        System.out.println("minimal = " + findMin(list));
        System.out.println("maximal = " + findMax(list));
        System.out.println("median = " + findMed(list));
        System.out.println("odd elements = " + removeEven(list));
        return;
    }

    public static int findMin(ArrayList<Integer> list){
        Integer min = list.get(0);
        for (Object o: list){
            if ((Integer) o < min){
                min = (Integer) o;
            }
        }
        return (min);
    }

    public static int findMax(ArrayList<Integer> list){
        Integer max = list.get(0);
        for (Object o: list){
            if ((Integer) o > max){
                max = (Integer) o;
            }
        }
        return (max);
    }

    public static Double findMed(ArrayList<Integer> list){
        Double med = 0.0;
        for (Object o: list){
            med+=(Integer) o;
        }
        Double res = (Double) (med/list.size());
        return (res);
    }

    public static ArrayList<Integer> removeEven(ArrayList<Integer> list){
        for (int i=0; i<list.size(); i++){
            if ((Integer) list.get(i)%2 == 0){
                list.remove(i);
            }
        }
        return (list);
    }

}
