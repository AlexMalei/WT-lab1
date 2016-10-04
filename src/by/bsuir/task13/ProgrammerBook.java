package by.bsuir.task13;

import by.bsuir.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public int hashCode() {
        return super.hashCode() + 31 * level + ((language == null) ? 0 : language.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)){
            ProgrammerBook programmerBook = (ProgrammerBook) obj;
            if (language == null){
                if (programmerBook.language != null){
                    return false;
                }
            }else if (!language.equals(programmerBook.language)){
                    return false;
            }
            if (!(level == programmerBook.level)){
                return false;
            }
            return true;
        }
        return false;

    }


    @Override
    public String toString() {
        return super.toString() + " language:" + language + " level:" + level;
    }
}
