package Lecture.Lecture5.Ex002Phonebook.Core.MVP;
// иерархию можно описывать через интерфейс
public interface View {
    String getFirstName();
    void setFirstName(String value);
    String getLastName(); // механизмы получения и описания фамилии
    void setLastName(String value);
    String getDescription(); // механизмы получения и описания "описания"
    void setDescription(String value);
    //
}
