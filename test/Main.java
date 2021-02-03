import ru.hzerr.collections.list.ArrayHList;
import ru.hzerr.collections.list.HList;

public class Main {

    public static void main(String[] args) {
//        HMap<String, Double> hMap = new HashHMap<>();
//        hMap.getKIf(Objects::isNull, Double::valueOf);
        HList<Integer> numbers = ArrayHList.create(1, 2, 3, 4);
        HList<Integer> numbers2 = ArrayHList.create(1, 2, 3, 4);
        System.out.println("IDENTITY: " + numbers.equals(numbers2));
    }
}
