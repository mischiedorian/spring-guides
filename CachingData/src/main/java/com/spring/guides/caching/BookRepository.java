package com.spring.guides.caching;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
