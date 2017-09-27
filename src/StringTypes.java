
public class StringTypes {
    public static void main(String [] args){

        String s1 = "My name is Ali";

        char c = s1.charAt(1);
        System.out.println(c);

        String s2 = s1.concat(" Demir");
        System.out.println(s2);

        boolean b = s1.equals("My name is Mehmet");
        System.out.println(b);

        int i= s1.indexOf("Ali");
        System.out.println(i);

        int i1 = s1.lastIndexOf("is");
        System.out.println(i1);

        String s3 = s1.toLowerCase();
        System.out.println(s3);

        String s4 = s1.toUpperCase();
        System.out.println(s4);

        String s5 = s1.replace("Ali", "Ahmet");
        System.out.println(s5);

        String s6 = s1.substring(5);
        System.out.println(s6);

        String s7 = s1.substring(5,12);
        System.out.println(s7);

        String s8 = s1.trim();
        System.out.println(s8);
    }
}
