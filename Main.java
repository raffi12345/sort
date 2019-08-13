public
        class sort {

public static
        void main(String[] args) {
// indexes:    0  1  2  3   4
    int[] values = {-1, 3, 1, 7, 4, 5, 2, 4, 3};
    int[] values2 = {-1, 6, 9, 8, 12};
    System.out.println(indexOfTheSmallestStartingFrom(values2, 1));
    System.out.println(indexOfTheSmallestStartingFrom(values2, 2));
    System.out.println(indexOfTheSmallestStartingFrom(values2, 4));
    System.out.println(indexOfTheSmallestStartingFrom(values, 7));

}

public static
        int smallest(int[] array) {

    int x = array[0];
    for (int i = 1; i < array.length; i++) {

        if (array[i] < x) {
            x = array[i];
        }

    }
    return x;
}

public static
        int indexOfTheSmallest(int[] array) {
    int y;
    for (int i = 0; i < array.length; i++) {
        if (smallest(array) == array[i]) {
            return i;
        }

    }
    return 0;
}

public static
        int indexOfTheSmallestStartingFrom(int[] array, int index) {
    int[] PA = ParseArray(array, index);
    for (int j = 0, y = index; j < array.length; j++, y++) {

        if (smallest(PA) == array[y]) {
            return y;
        }

    }

    return 0;

}

public static                                                   /////// remodels array to start from index of 0;;;
        int[] ParseArray(int[] array, int index) {
    int[] arrayParse = new int[array.length - index];
    for (int i = index, z = 0; i < array.length; i++, z++) {

        arrayParse[z] = array[i];

    }
    return arrayParse;

}

public static
        void swap(int[] array, int index1, int index2) {

    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;

}

public static
        void sort(int[] array) {

    for (int i = 0; i < array.length-1; i++) {

        int y = indexOfTheSmallestStartingFrom(array, i);

        swap(array, i, y);

 
    }

}

public static                               //useless
        String toString(int[] array) {

    String ArrR = "";
    for (int i = 0; i < array.length - 1; i++) {
        ArrR += array[i];
        ArrR += ", ";
    }
    ArrR += array[array.length - 1];

    return "[" + ArrR + "]";

}

}
