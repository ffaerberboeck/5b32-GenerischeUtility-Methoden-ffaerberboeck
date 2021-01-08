package ffaerberboeck;
/**
 * Diese Klasse ändert ein Array
 * @author Finn Faerberboeck
 * @version 2021-06-01
 * @param <Array>
 */
public class GenericUtils <Array>{
    /**
     * Diese Methode vertauscht den letztn mit dem ersten Index eines Arrays und umgekehrt
     * @param ar            Das zu tauschende Array
     * @param <Array>       Der Datentyp des umzudrehendem Arrays
     * @return              Das umgedrehte Array
     */
    public static <Array> Array[] umdrehen(Array[] ar) {
        Array[] umgedreht = ar.clone();
        for(int z = 0; z < ar.length; z++) {
            if(z == 0) {
                umgedreht[0] = ar[ar.length - 1];
            }
            if(z == ar.length-1) {
                umgedreht[ar.length-1] = ar[0];
            }if(z != 0 && z != ar.length-1){
                umgedreht[z] = ar[z];
            }
        }
        return umgedreht;
    }
}
