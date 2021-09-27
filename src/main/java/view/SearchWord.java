package view;

import controller.WordManagement;
import model.Word;


public class SearchWord {
    public static WordManagement words = new WordManagement();

    public static String run(String name) {
        words.add(new Word("run", "Chi hanh dong chay"));
        words.add(new Word("walker", "Chi hanh dong di lai"));
        words.add(new Word("eat", "Chi hanh dong an"));
        words.add(new Word("speak", "Chi hanh dong noi chuyen"));
        Word word = words.search(name);
        if (word == null) {
            return "Khong co tu nay";
        } else {
            String result = word.getDescription();
            return result;
        }
    }
}
