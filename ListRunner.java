import java.util.List;

class ListRunner{
    public static void main(String []a){
        List<String> words = List.of("Apple", "Bat", "Cat");
        System.out.println(words);
        System.out.println(words.size());
        System.out.println(words.get(1));
        System.out.println(words.contains("Madhu"));
        System.out.println(words.isEmpty());
        System.out.println(words.indexOf("Apple"));
        System.out.println(words.contains("Dog"));
        
    } 
}