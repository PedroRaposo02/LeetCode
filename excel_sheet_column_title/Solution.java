package excel_sheet_column_title;

public class Solution {
    /*
     * Given an integer columnNumber, return its corresponding column title as it
     * appears in an Excel sheet.
     */

    public String convertToTitle(int columnNumber) {
        if (columnNumber == 0) {
            return "";
        }
        else if (columnNumber < 27) {
            return Character.toString(columnNumber + 0x40);
        }
        else if (columnNumber % 26 == 0) {
            return convertToTitle(columnNumber / 26 - 1) + "Z";
        }
        else {
            return convertToTitle(columnNumber / 26) + convertToTitle(columnNumber % 26);
        }
    }
}
