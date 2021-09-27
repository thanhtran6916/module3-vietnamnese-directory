package controller;

import model.Word;

import java.util.HashMap;

public class WordManagement {
    private HashMap<String, Word> words = new HashMap<>();

    public HashMap<String, Word> getWords() {
        return words;
    }

    public void setWords(HashMap<String, Word> words) {
        this.words = words;
    }

    public Word search(String name) {
        return words.get(name);
    }

    public void add(Word word) {
        words.put(word.getName(), word);
    }

    public void edit(String name, Word word) {
        words.replace(name, word);
    }

    public void remove(String name) {
        words.remove(name);
    }

}
