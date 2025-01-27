
public class GenericsRunner {

    static <C> C doSomething(C value){
        return value;
    }
    public static void main(String[] args)
    {

        String value = doSomething("madhu");
        int age = doSomething(23);
        System.out.println(value);
        System.out.println(age);

        ArrayListGenrics<Short> lst = new ArrayListGenrics<>();
        lst.add((short)21);
        lst.add((short)43);
        lst.add((short)22);
        System.out.println(lst);
        System.out.println(lst.get(1));

        ArrayListGenrics<Long> geList = new ArrayListGenrics<>();
        geList.add(21L);
        geList.add(23l);
        geList.add(25l);
        System.out.println(geList);
        System.out.println(geList.get(0));

        ArrayListGenrics<Integer> chList = new ArrayListGenrics<>();
        chList.add((int)'t');
        chList.add((int)'e');
        chList.add((int)'w');
        System.out.println(chList);
        System.out.println(chList.get(2));
    
    }    
}
