package Lecture.Lecture5.Ex002Phonebook.UI;
// переписана логика старой консоли ConsoleView
public class NewConsoleView extends ConsoleView {
    
    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();
    }

}
