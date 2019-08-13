
public
        class Main {

public static
        void main(String[] args) {

 int[] values = {8, 3, 7, 9, 1, 2, 4};
sort(values);
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

    for (int i = 0; i < array.length; i++) {
        if (smallest(array) == array[i]) {
            return i;
        }

    }
    return 0;
}

public static
        int indexOfTheSmallestStartingFrom(int[] array, int index) {

    for (int j = 0, y = index; j < array.length; j++, y++) {

        if (smallest(ParseArray(array, index)) == array[j]) {
            return j;
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
            int[] finalArray=new int[array.length];
            for (int i=0; i<array.length;i++){
                
                int y=indexOfTheSmallestStartingFrom(array,i);
                
                array=
                
                
                System.out.println(toString(finalArray));
            }
           
        
        
        
        
        
        
        
        }
        
        
public static
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
