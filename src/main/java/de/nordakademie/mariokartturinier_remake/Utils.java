package de.nordakademie.mariokartturinier_remake;

import java.util.HashMap;

public class Utils {



    public static <T> int getFreeIndex(HashMap<Integer, T> hash){
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
