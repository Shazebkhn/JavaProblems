package org.shazeb.Arrays;

import java.util.HashMap;
import java.util.Map;

public class maxStockProfit {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,4,1};//{5,4,3,2,1};
        System.out.println(maxProfit(num));
    }

    static int maxProfit(int[] stocks){
        if (stocks.length <=1) return 0;

        int min =stocks[0], max= stocks[0];
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(stocks[0], 0);

        for(int i=1; i< stocks.length; i++){
            mp.put(stocks[i],i);
            if(stocks[i]>max){
                max=stocks[i];
            }
            if(stocks[i]<min && mp.get(max)>=i){
                min = stocks[i];
            }
        }
        return max-min;
    }
}

