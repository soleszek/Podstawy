package com.sylwesteroleszek.Blok8.Book;

public class Main {

    public static void main(String[] args) {
        Author sylwesterO = new Author("Sylwester Oleszek", "sylwester.oleszek@gmail.com", 'm');
        Author marekW = new Author("Marek Wyleżoł", "marek.wyleżoł@gmail.com", 'm');
        Author katarzynaO = new Author("Katarzyna Oleszek", "arkadia@nadzory-archeologiczne.ple", 'k');
        Author[] authors = {sylwesterO, marekW, katarzynaO};

        Book doktorat = new Book("Metoda wspomagania projektowania naczyń szklanych", 25, 50);
        doktorat.addAuthor(sylwesterO);
        doktorat.addAuthor(marekW);
        doktorat.addAuthor(katarzynaO);
        doktorat.printAuthors();
        System.out.println(doktorat.toString());
    }
}
