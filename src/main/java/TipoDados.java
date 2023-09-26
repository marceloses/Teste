/*
* Tipo Bit
* Double 64 Usado para processamento calculos matemáticos e estatisticos, valores decimais valores quebrados
* Float  32
* Long   64
* Int    32
* Short  16
* Byte   8
* Char   2
* String  ?
* Boolean ?
 */

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class TipoDados {
    public static void main(String[] args) {

        Double d = 10.04;
        Float f = 100.78755454545454f;
        Long l =  1095l; //coloca o "l" no final
        Integer i = 100;
        Short s = 10;
        Byte b = 19;

        System.out.println("Double Max" + Double.MAX_VALUE + " Double Min" + Double.MIN_VALUE);
        System.out.println("Float Max:0 " + Float.MAX_VALUE + "Float Min" + Float.MIN_VALUE);
        System.out.println("Long: Max:" + Long.MAX_VALUE + "Long Min " + Long.MIN_VALUE);
        System.out.println("Integer: Max:" + Integer.MAX_VALUE + "Integer Min" + Integer.MIN_VALUE);
        System.out.println("Short: Max" + Short.MAX_VALUE + "Shout: Min: "+ Short.MIN_VALUE);
        System.out.println("Byte: Max:" + Byte.MAX_VALUE + "Byte: Min:" + Byte.MIN_VALUE);

    }

}
