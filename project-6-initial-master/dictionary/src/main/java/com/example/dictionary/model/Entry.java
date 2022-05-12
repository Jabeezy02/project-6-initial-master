package com.example.dictionary.model;

public class Entry implements Comparable<Entry>{

    private String word;
    private String definition;

    public Entry(){

    }

    public Entry(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Entry o) {
        return this.word.compareTo(o.word);
    }

    @Override
    public String toString() {
        return "Entry{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
