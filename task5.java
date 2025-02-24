public class task5 {

    public static class Book {
        private String title;
        private String author;
        private String ISBN;
        private boolean inCollection = false;

        public Book(String ISBN, String author, String title) {
            this.ISBN = ISBN;
            this.author = author;
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        private void addToCollection() {
            this.inCollection = true;
        }

        private void deleteFromCollection() {
            this.inCollection = false;
        }
    }


    public static void main(String[] args) {

        Book book_1 = new Book("9786589008194", "George Orwell", "1984");
        Book book_2 = new Book("9786555980004", "Oscar Wilde", "Portrait of Dorian Gray");

        book_1.addToCollection();
        book_2.addToCollection();
        book_2.deleteFromCollection();


    }
}
