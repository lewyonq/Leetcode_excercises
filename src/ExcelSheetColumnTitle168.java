/*

 */
public class ExcelSheetColumnTitle168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }

    public static String convertToTitle(int columnNumber) {
        // 10-base system to 26-base system
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 26) {
            int r = columnNumber % 26;

            if (r == 0) {
                r = 26;
            }
            sb.append((char) (r + 64));
            columnNumber -= r;
            columnNumber /= 26;
        }
        sb.append((char)(columnNumber + 64));

        return sb.reverse().toString();
    }
}
