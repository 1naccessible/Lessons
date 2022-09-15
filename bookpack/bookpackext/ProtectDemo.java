package bookpack.bookpackext;

public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java: a Beginners guide", "Schildt", 2014, "Osborn/McGraw-Hill");
        books[1] = new ExtBook("Java: The Complete Reference", "Schildt", 2014, "Osborn/McGraw-Hill");
        books[2] = new ExtBook("The Art of Java", "Schildt and Holmes", 2003, "Osborn/McGraw-Hill");
        books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On The Road", "Kerouac", 1955, "Viking");

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }

        System.out.println("Showning all books by Schildt");
        for (int i = 0; i< books.length; i++){
            if (books[i].getAuthor() == "Schildt"){
                System.out.println(books[i].getTitle());
            }
        }

        //books[0].title = "test title" Ошибка так как досуп закрыт
    }
}




