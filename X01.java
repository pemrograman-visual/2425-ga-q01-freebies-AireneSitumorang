// 12S24035 -JOSUA SIANTURI
// 12S24058 - AIRENE SITUMORANG

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double harga;
        boolean stop;
        double totalharga;
        double kecil;

        totalharga = 0;
        stop = true;
        kecil = 1000;
        while (stop == true) {
            harga = Double.parseDouble(input.nextLine());
            if (harga == 0) {
                stop = false;
            } else {
                if (kecil < harga) {
                } else {
                    kecil = harga;
                }
                totalharga = totalharga + harga;
            }
        }
        if (totalharga > 100) {
            totalharga = totalharga - kecil;
        } else {
            totalharga = totalharga;
        }
        System.out.println(toFixed(totalharga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
