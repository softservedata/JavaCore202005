package libs;

public class Libs {
    public static void sum(int slog1, int slog2) {
        int tempRes = slog1 + slog2;
        System.out.println("Result from method = " + tempRes);
    }

    //    "345" - > 345
//    "34a5" -> 34
    public static int sum(String var1, int var2) {
        try {
            int tempResult = var2 + Integer.parseInt(var1);
            System.out.println("Result String + Int = " + tempResult);
            return tempResult;
        } catch (NumberFormatException e) {
            System.out.println("Error " + e);
            return 88888;
        } catch (Exception e) {
            System.out.println("Error " + e);
            return 99999;
        }
    }

    public int mult(int mnogitel, int mnogetel2) {
        int tempRes = mnogitel * mnogetel2;
        System.out.println("Result from method = " + tempRes);
        return tempRes;
    }

    public void printArray(int[] tempArray, int value) {
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] < value) {
                System.out.println(tempArray[i] + "Элемент меньше " + value);
            } else if (tempArray[i] == value) {
                System.out.println(tempArray[i] + "Элемент равен " + value);
            } else if (tempArray[i] > value) {
                System.out.println(tempArray[i] + "Элемент больше " + value);
            }

        }
    }

}
