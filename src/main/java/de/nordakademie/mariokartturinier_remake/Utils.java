package de.nordakademie.mariokartturinier_remake;

import java.util.HashMap;

/**
 * The type Utils.
 */
public class Utils {


    /**
     * Get free index int.
     *
     * @param <T>  the type parameter
     * @param hash the hash
     * @return the int
     */
    public static <T> int getFreeHashIndex(HashMap<Integer, T> hash){
        int outoutInt = -1;
        for (int i = 0; i < hash.size(); i++){
            if (hash.get(i) == null){
                outoutInt = i;
            }
        }
        if (outoutInt == -1){
            outoutInt=hash.size();
        }

        return outoutInt;

    }
}
