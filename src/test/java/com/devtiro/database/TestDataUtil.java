package com.devtiro.database;

import com.devtiro.database.domain.Author;
import com.devtiro.database.domain.Book;

public class TestDataUtil {

    private TestDataUtil(){

    }

    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("author")
                .age(27)
                .build();
    }

    public static Author createTestAuthorA() {
        return Author.builder()
                .id(1L)
                .name("authorA")
                .age(51)
                .build();
    }

    public static Author createTestAuthorB() {
        return Author.builder()
                .id(2L)
                .name("authorB")
                .age(27)
                .build();
    }

    public static Author createTestAuthorC() {
        return Author.builder()
                .id(3L)
                .name("authorC")
                .age(27)
                .build();
    }

    public static Book createTestBook(final Author author) {
        return Book.builder()
                .isbn("78-1-2345-6789-1")
                .title("The Shadow in the Attic")
                .authorId(author)
                .build();
    }

    public static Book createTestBookA(final Author author) {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic Prequel")
                .authorId(author)
                .build();
    }

    public static Book createTestBookB(final Author author) {
        return Book.builder()
                .isbn("78-1-2345-6789-1")
                .title("The Shadow in the Attic")
                .authorId(author)
                .build();
    }

    public static Book createTestBookC(final Author author) {
        return Book.builder()
                .isbn("78-1-2345-6789-2")
                .title("The Shadow in the Attic Sequel")
                .authorId(author)
                .build();
    }
}
