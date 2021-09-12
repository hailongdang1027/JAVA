package rtu.mirea;

public class TestAuthor {
    public static void main(String[] args){
        Author author1 = new Author("Jack Grealish", "jack@gmail.com", 'M');
        Author author2 = new Author("Jane Dang", "jane@gmail.com", 'F');
        Author author3 = new Author("Unknown", "Unknown", 'U');
        System.out.println(author1.toString());
        System.out.println(author2.toString());
        System.out.println(author3.toString());
    }
}
