import currency.Dollar;
import libs.Libs;

import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;

import static libs.Libs.sum;

public class MainClass {
    public static void main(String arg[]) {
        System.out.println("Hello !");
        int var1;
        Integer var2 = 10;
        Integer var33 = var2;
        int rez;
        var1 = 5;
//        rez = var1 + var2;
//        System.out.println("Result = " + rez);
        sum(var1, var2);

        int var3 = 45;
//        int rez1 = var2 + var3;
//        System.out.println("Result 1 = " + rez1);
        sum(var2, var3);

//        int rez_3 = sum (String,int)
        String result = "test" + 4 ;
        int test1 = sum("3456" , 5) + 555;
//        sum(555,"12");
        System.out.println(sum("345", 5));

        System.out.println("---End---");

//        int rez_1 = sum (int,int);
////        String rez_2 = sum (String,String);
////        int rez_3 = sum (String,int)
////        rez_3 = multiplication (int,int);

        Libs objectLibs;
        objectLibs = new Libs();

        objectLibs.mult(5,6);
        objectLibs.mult(68,89);

        int[] month = {1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println("Array elemnt 2 = " + month[1]);
        System.out.println("Array elemnt 3 = " + month[2]);

        int[] month2 = new int[12];
        System.out.println(month2[0]);
//        month2[0]=1;
//        month2[1]=2;
//        month2[2]=3;

        for (int i = 0; i < month2.length; i++ ){
            month2[i] = i ;
            System.out.println(month2[i]);
        }

//        Далее вывести в Цикле в консоль :
//        Если элемент массива меньше 10 то Значение элемента + фразу "Элемент меньше десяти"
//        Если элемент равен 10 - то Значение элемента + фразу "Элемент равен десяти"
//        Если элемент массива больше 10 то Значение элемента + фразу " Элемент больше десяти"

       objectLibs.printArray(month,10);
        objectLibs.printArray(month,5);

        String var111 = "test";


        String var = new String("test");
        String var222 = "test";
//        var.equals("test4444");
        String varString = new String("test");
        System.out.println(!var.equals(varString));
        System.out.println(!(var == varString));

//        0 0 0
//        0 0 0
//        0 0 0
        int[][] ourArrayArray = {{1},{1,1,1},{1,1,1}};

        int[][] ourArrayArrayNew = new int[3][3];
        for (int i = 0; i < ourArrayArrayNew.length; i++) {
            for (int j = 0; j < ourArrayArrayNew[i].length; j++) {
                ourArrayArrayNew[i][j] = 1;
                System.out.print(ourArrayArrayNew[i][j] + " ");
            }
            System.out.println("");
        }
//        0 0 0 0      0 0 0 0
//        0 0 0 0      0 0 0 0
//        0 0 0 0      0 0 0 0


        String[][][] arrArrArr = new String[2][3][4];
        for (int i = 0; i < arrArrArr.length; i++) {
            for (int j = 0; j < arrArrArr[i].length; j++) {
                for (int k = 0; k < arrArrArr[i][j].length; k++) {
                    arrArrArr[i][j][k] = "#" + (i + j + k);
                    System.out.print(arrArrArr[i][j][k] + " ");
                }
                System.out.println("");
            }
            System.out.println();
        }

        ArrayList<String> listArray = new ArrayList<>();
        listArray.add("test1");
        System.out.println(listArray);
        listArray.add("test2");
        System.out.println(listArray);
        System.out.println(listArray.get(1));

        ArrayList<String> listArray2 = new ArrayList<>();
        listArray2.add("list2-1");
        System.out.println(listArray2);

        listArray.addAll(listArray2);
        System.out.println(listArray);

        for (String element : listArray) {
            System.out.println(element);
        }
        for (int i = 0; i < listArray.size(); i++) {
            System.out.println(listArray.get(i));
        }

        ArrayList<ArrayList<String>> listArrayArray;
        listArrayArray = new ArrayList<>();
        listArrayArray.add(new ArrayList<String>());
        System.out.println(listArrayArray);
        listArrayArray.get(0).add("line0-0");
        listArrayArray.add(new ArrayList<String>());
        listArrayArray.add(new ArrayList<String>());
        System.out.println(listArrayArray);
        listArrayArray.get(0).add("line0-1");
        System.out.println(listArrayArray);
        listArrayArray.get(2).add("line2-0");
        listArrayArray.get(2).add("line2-1");

        System.out.println(listArrayArray.get(2).get(1));
        System.out.println("---------------");
        for (ArrayList<String> line: listArrayArray) {
            for (String element: line ) {
                System.out.print(element + ";");
            }
            System.out.println("");
        }

        listArrayArray.add(listArray2);
        System.out.println(listArrayArray);

        listArray2.add("New Element");
//        listArrayArray.add(listArray2);
        System.out.println(listArrayArray);

        HashMap<String,String> ourMap = new HashMap<>();

        ourMap.put("login","testLogin");
        ourMap.put("pass","999");
        System.out.println(ourMap);
        System.out.println(ourMap.get("pass"));

        ourMap.put("login", "newLogi");
        System.out.println(ourMap);


        Dollar dollar = new Dollar(8);

        System.out.println(dollar.getKursNBU());

        dollar.setKursNBU(20);

        System.out.println(dollar.getKursNBU());


    }



}
