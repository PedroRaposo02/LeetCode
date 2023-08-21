package Utils;

import java.util.Arrays;

public class ArrayUtils  {
    
    public static <T> void printArray(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length -1) {
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static <T> void printArray(T[] array, int start, int end) {
        System.out.print("[");
        for (int i = start; i < end; i++) {
            if (i != end -1) {
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static <T> void printArray(T[] array, int start) {
        System.out.print("[");
        for (int i = start; i < array.length; i++) {
            if (i != array.length -1) {
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static <T> void printArray(T[] array, int start, int end, String separator) {
        System.out.print("[");
        for (int i = start; i < end; i++) {
            if (i != end -1) {
                System.out.print(array[i] + separator);
            }
            else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static <T> void printArray(T[] array, String separator) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length -1) {
                System.out.print(array[i] + separator);
            }
            else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static <T> void printArray(T[] array, int start, String separator) {
        System.out.print("[");
        for (int i = start; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + separator);
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static <T> void printArray(T[][] array) {
        Arrays.stream(array).forEach(a -> Arrays.toString(a));   
    }


    /*
     * Primitive arrays : int
     */

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static void printArray(int[] array, int start, int end) {
        System.out.print("[");
        for (int i = start; i < end; i++) {
            if (i != end - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static void printArray(int[] array, int start) {
        System.out.print("[");
        for (int i = start; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    /*
     * Primitive arrays : char
     */

    public static void printArray(char[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static void printArray(char[] array, int start, int end) {
        System.out.print("[");
        for (int i = start; i < end; i++) {
            if (i != end - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static void printArray(char[] array, int start) {
        System.out.print("[");
        for (int i = start; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static <T> void printIntMatrix(int[][] array) {
        Arrays.stream(array).forEach(a -> Arrays.toString(a));   
    }

    public static boolean equals(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }

            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
    

}
