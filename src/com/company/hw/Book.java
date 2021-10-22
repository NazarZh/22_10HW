package com.company.hw;

public class Book {
    public static final int PAGES = 400;
    public static final int CHAPTERS = 20;
    public static final String NAME = "\"Someone's adventure\"";
    private int pageWhereIAm;
    public boolean b;

    public Book(int page){
        this.pageWhereIAm = page;
    }

    public int getPageWhereIAm() {
        return pageWhereIAm;
    }

    public void setPageWhereIAm(int pageWhereIAm) {
        this.pageWhereIAm = pageWhereIAm;
    }
}
