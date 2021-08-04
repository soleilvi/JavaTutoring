package Session1;
// Session1.StringFormat.java
/*
Formats the given title, author, pages, year, and price of a book.
By Soleil Vivero
*/

public class StringFormat {
    public static void main(String[] args) {
        String title = "The Shallows: What the Internet is Doing to Our Brains", author = "Nicholas Carr",
                titleF = "Title:", authorF = "Author:", pagesF = "Pages:", yearF = "Year:", priceF = "Price:",
                d = "$";
        int pages = 321, year = 2010;
        float price = 15.29f;

        String formatString = String.format("%-10s%-55s\n%-10s%-55s\n%-10s%-55d\n%-10s%-55d\n%-10s%-1s%-55.2f",
                                             titleF, title, authorF, author, pagesF, pages, yearF, year,
                                             priceF, d, price);
        System.out.println(formatString);
    }
}
