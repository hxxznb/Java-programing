public class task13 {
    public static void main(String[] args) {
        String hexNumber = "AB8C";
        int decimalValue = hexToDecimal(hexNumber);
        System.out.println("Hexadecimal number: " + hexNumber);
        System.out.println("Decimal value: " + decimalValue);
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= 'a' && ch <= 'f') {
            return 10 + ch - 'a';
        } else {
            return ch - '0';
        }
    }
}
