public class StringBuilderStringBufferDemo {
    public static void main (String [] args ){

        StringBuilder name1 = new StringBuilder("Belgin Sayan");
        StringBuffer name2 = new StringBuffer("Nurhan Birlik");

        System.out.println("Your name is " + name1);
        name1.replace(7,12,"Demir");
        System.out.println("Your new name is " + name1);
        System.out.println(name1.capacity());
        System.out.println(name1.length());
        System.out.println(name1.append("ler"));

        System.out.println("Your name is " + name2);
        name2.replace(7,13,"Demir");
        System.out.println("Your new name is " + name2);
        System.out.println(name2.capacity());
        System.out.println(name2.length());
        System.out.println(name2.append("ler"));
    }
}
