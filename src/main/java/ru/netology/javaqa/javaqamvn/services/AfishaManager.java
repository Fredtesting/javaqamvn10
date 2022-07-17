package ru.netology.javaqa.javaqamvn.services;

public class AfishaManager {
    private String[] movies = new String[0];
    private  int limit;

    public AfishaManager(int limit) {
        this.limit = limit;
    }
    public AfishaManager() {
        limit =10;
    }

    public void add(String addedFilm) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = addedFilm;
        movies = tmp;
    }

    public String[] findALL() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        String[] filmLimit = new String[resultLength];
        for (int i = 0; i < filmLimit.length; i++) {
            filmLimit[i] = movies[movies.length - i - 1];
        }
        return filmLimit;
    }

}
