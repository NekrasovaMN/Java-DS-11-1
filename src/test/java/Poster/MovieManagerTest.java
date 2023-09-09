package Poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test() {
        MovieManager manager = new MovieManager();

        String[] expected = {}; // Вывод пустого значения
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testaddMovieOne() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");


        String[] expected = {"Film 1"}; //Вывод одного фильма
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testaddMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");


        String[] expected = {"Film 1", "Film 2", "Film 3"}; //Вывод всех фильмов в порядке добавления
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testFindLastNull() {
        MovieManager manager = new MovieManager();

        String[] expected = {}; //Вывод пустого значения
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOne() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");


        String[] expected = {"Film 1"}; //Вывод одного фильма
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");


        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"}; //Вывод всех фильмов в обратном порядке
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastSome() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"}; //Вывод несколких фильмов в обратном порядке
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOverLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"}; //Вывод всех фильмов в обратном порядке
        // свыше лимита
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
