package training;

public class Arr {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int x1 = -456;

        if (x1 < 0){
            x1 = Math.abs(x1);
            throw new NumberFormatException("Format");
        }
        int counter = 0;

        String arr = Integer.toString(x1);

        int[] arr1 = new int[arr.length()];

        for (int x = arr1.length - 1 ; x >= 0; x--){


            stringBuilder.append(Character.getNumericValue(arr1[x] = arr.charAt(x)));
        }

        x1 = Integer.parseInt(stringBuilder.toString());

        System.out.println(x1);
    }
}
