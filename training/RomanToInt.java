package training;

public class RomanToInt {
    public static int romanToInt(String s) {
        int out = 0;
        char[] buf = s.toCharArray();
        int[] convertedBuf = new int[buf.length];
        for (int i = 0; i < buf.length; i++) {

            switch (buf[i]) {
                case 'M':
                    convertedBuf[i] = 1000;
                    continue;
                case 'D':
                    convertedBuf[i] = 500;
                    continue;
                case 'C':
                    convertedBuf[i] = 100;
                    continue;
                case 'L':
                    convertedBuf[i] = 50;
                    continue;
                case 'X':
                    convertedBuf[i] = 10;
                    continue;
                case 'V':
                    convertedBuf[i] = 5;
                    continue;
                case 'I':
                    convertedBuf[i] = 1;

            }
        }
        if (convertedBuf.length != 1) {
            for (int x = 0; x < convertedBuf.length - 1; x++) {
                if (convertedBuf[x] == 0 && convertedBuf[convertedBuf.length - 2] != 0) {
                    continue;
                }
                if (convertedBuf[x] < convertedBuf[x + 1]) {
                    out += convertedBuf[x + 1] - convertedBuf[x];
                    convertedBuf[x + 1] = 0;
                    continue;
                }

                if (x != convertedBuf.length - 2) {
                    if (convertedBuf[x] >= convertedBuf[x + 1] && convertedBuf[x + 1] >= convertedBuf[x + 2]) {
                        out += convertedBuf[x + 1] + convertedBuf[x];
                        convertedBuf[x + 1] = 0;
                        continue;
                    } else if (convertedBuf[x + 1] < convertedBuf[x + 2]) {
                        out += convertedBuf[x];
                        convertedBuf[x] = 0;
                    }
                } else if (x + 1 == convertedBuf.length - 1) {
                    if (convertedBuf[x] >= convertedBuf[x + 1]) {
                        out += convertedBuf[x + 1] + convertedBuf[x];
                        convertedBuf[x + 1] = 0;
                    }
                }
            }
        } else return convertedBuf[0];
        return out;
    }
}


class DemoBoy extends RomanToInt {
    public static void main(String[] args) {
        String v = "ICXXICIV";
        System.out.println(romanToInt(v));
    }
}

