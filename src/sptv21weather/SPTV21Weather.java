/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21weather;

import java.util.Arrays;



/**
 *
 * @author Anatoli
 */
public class SPTV21Weather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] jaggedArray = new int[12][];
        jaggedArray[0] = new int[31];
        jaggedArray[1] = new int[28];
        jaggedArray[2] = new int[31];
        jaggedArray[3] = new int[30];
        jaggedArray[4] = new int[31];
        jaggedArray[5] = new int[30];
        jaggedArray[6] = new int[31];
        jaggedArray[7] = new int[31];
        jaggedArray[8] = new int[30];
        jaggedArray[9] = new int[31];
        jaggedArray[10] = new int[30];
        jaggedArray[11] = new int[31];
        
        int count = 0;
        for (int i = 0; i < jaggedArray.length; i++)
            for (int j = 0; j < jaggedArray[i].length; j++)
                jaggedArray[i][j] = count++;

        for (int[] row : jaggedArray) System.out.println(Arrays.toString(row));
    }
}
