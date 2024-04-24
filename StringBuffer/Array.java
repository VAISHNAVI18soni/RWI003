package StringBuffer;

public class Array {

    public static void main(String[] args) {
        System.out.println("Finding duplicate elements in an array");
        String a[] = {"337", "4", "3", "2", "2", "2", "2", "34", "5"};

        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i].equals(a[j])) {
                    System.out.println("Duplicate found: " + a[i]);
                }
            }
        }
    }
}

