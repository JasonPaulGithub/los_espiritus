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
                .age(27)
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

    public static Book createTestBook() {
        return Book.builder()
                .isbn("78-1-2345-6789-1")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookA() {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic Prequel")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookB() {
        return Book.builder()
                .isbn("78-1-2345-6789-1")
                .title("The Shadow in the Attic")
                .authorId(2L)
                .build();
    }

    public static Book createTestBookC() {
        return Book.builder()
                .isbn("78-1-2345-6789-2")
                .title("The Shadow in the Attic Sequel")
                .authorId(3L)
                .build();
    }
}
