import java.util.*;

class StackGeneric<T> {
    private T[] stack;
    int position = 0;

    @SuppressWarnings("unchecked")
    public StackGeneric(int size) {
        stack =  (T[]) new Object[size];
        position = 0;
    }

    public boolean push(T t) {
        if(position < stack.length) {
            stack[position++] = t;
            return true;
        } else return false;
    }

    public T pop() throws Exception {
        if(position > 0) {
            return stack[--position];
        }
        else throw new Exception("Empty set");
    }

    public int maxSize() {
        return stack.length;
    }
    public int size() {
        return position;
    }

}

public class StackGenericMain {
    public static void main(String[] args) throws Exception {
        StackGeneric<Integer> stackInt = new StackGeneric<Integer>(100);
        stackInt.push(23);
        stackInt.push(34);
        stackInt.push(456);
        System.out.println(stackInt.pop());
        StackGeneric<String> stackString = new StackGeneric<String>(20);
        stackString.push("napis");
        stackString.push("tu");
        stackString.push("jest");
        while(stackString.size() > 0) {
            System.out.print(stackString.pop() + " ");
        }
        System.out.println();
        Map<String, Integer> uczniowie = new HashMap<>();
        uczniowie.put("Jan", 15);
        uczniowie.put("Ania", 13);
        uczniowie.put("Iwona", 17);
        Set<String> keys = uczniowie.keySet();
        for(String imie: keys){
            System.out.println(imie + " ma " + uczniowie.get(imie) + " lat " + imie.hashCode());
        }
        List<String> sampleList = new ArrayList<>();
        sampleList.add("Marcin");
        sampleList.add("Adela");
        sampleList.add("Marek");
        sampleList.add("Magda");

        System.out.println("Iterowanie po liscie (foreach)");
        for(String item : sampleList) {
            System.out.println(item);
        }

        System.out.println("Iterowanie po liscie (for)");
        for(int index = 0; index < sampleList.size(); index++) {
            System.out.println(sampleList.get(index));
        }

    }
}
