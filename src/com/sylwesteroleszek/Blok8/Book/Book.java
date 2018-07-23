package com.sylwesteroleszek.Blok8.Book;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors = new Author[5];
    private int numAuthors = 0;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book(String name, double price, int qtyInStock) {
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public void addAuthor(Author author) {
        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null) {
                authors[i] = author;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qtyInStock=" + qtyInStock +
                '}';
    }

    public void printAuthors() {
        for (Author a : authors) {
            System.out.println(a);
        }
    }



    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}
