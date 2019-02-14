/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luckBalance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Prestamo
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class LuckBalance {


public class Solution {

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n, k, a, b, totimp;
        n = scanner.nextInt();
        k = scanner.nextInt();
        int sum = 0;
        totimp = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();        
        for (int i=0; i<n; i++){ 
            a = scanner.nextInt();
            b = scanner.nextInt();
            sum += a; 
            
            if (b == 1){ 
                list.add(a);
                totimp++;
            } 
        }
        
        Collections.sort(list);
        
        while(totimp > k){
            sum = sum - (2 * list.get(0));
            list.remove(0);
            totimp--;
        }
        System.out.println(sum);
    }
}
    
}
