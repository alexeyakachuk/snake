public class Main {
    public static void main(String[] args) {

        //printNumbers(1,3);
        //printReverse(4,6);
        getNumberSnake(14, 4);

    }

    public static void getNumberSnake(int size, int numberInRow) {
        int temp = 1;

        for (int i = 1; i <= size; ) {
            int tail;
            tail = numberInRow * temp;
            if (tail > size) {
                tail = size;
            }
            if (temp % 2 != 0) {
                printNumbers(i, tail);
            } else {
                printReverse(i, tail);
            }


            i = 1 + numberInRow * temp;
            temp++;


        }
    }


    //printNumbers(numberInRow * 2 + 1, numberInRow * 3);
    //printReverse(numberInRow * 3 + 1 , size);


    public static void printNumbers(int start, int end) {

        for (int i = start; i <= end; i++) {


            System.out.print(i + " ");


        }
        System.out.println();
    }

    public static void printReverse(int start, int end) {


        for (int i = end; i >= start; i--) {

            System.out.print(i + " ");

        }
        System.out.println();
    }

}
//1 2 3
//6 5 4
//7 8 9
//    10