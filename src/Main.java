public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №12\n");

        // Task - created Reference book

        //Book #1
        System.out.println("Первая книга:");
        Author person = new Author("John ", "Wayne");
        Book book = new Book("Book 1", person, 2021);
        System.out.println("book.title = " + book.getTitle() + "\nbook.author = " + book.getAuthor() + "\nbook.publisher = " + book.getPublisher());

        //Book #2
        System.out.println("\nВторая книга:");
        Author personTwo = new Author("Michael ", "Jackson");
        Book bookTwo = new Book("Book 2", personTwo, 2022);
        System.out.println("book.title = " + bookTwo.getTitle() + "\nbook.author = " + bookTwo.getAuthor() + "\nbook.publisher = " + bookTwo.getPublisher());

        //Edit publisher from Book #2
        System.out.println("\nВторая книга - изменил год выпуска:");
        bookTwo.setPublisher(2024); // Меняю год публикации
        System.out.println("book.title = " + bookTwo.getTitle() + "\nbook.author = " + bookTwo.getAuthor() + "\nbook.publisher = " + bookTwo.getPublisher());

    }
}