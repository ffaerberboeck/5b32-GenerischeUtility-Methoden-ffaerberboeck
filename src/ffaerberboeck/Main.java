package ffaerberboeck;

/**
 * Die Main Klasse, welche die Stack Klasse testen soll
 * @author Finn Faerberboeck
 * @version 2021-05-01
 */
public class Main {
    public static void main(String[] args){
        //Hier wird die neue Methode Generics Utils mit einem String Array getestet
        String[] stringarray =new String[] {"Test1", "Test2", "Test3", "Test4", "Test5"};
        stringarray = GenericUtils.<String>umdrehen(stringarray);
        for(int z = 0; z < stringarray.length; z++) {
            System.out.println(stringarray[z]);
        }

        //Hier wird die neue Methode Generic Utils mit einem Char Array getestet
        Character[] chararray =new Character[] {'a', 'b', 'c', 'd', 'e'};
        chararray = GenericUtils.<Character>umdrehen(chararray);
        for(int z = 0; z < chararray.length; z++) {
            System.out.println(chararray[z]);
        }

    }
}
