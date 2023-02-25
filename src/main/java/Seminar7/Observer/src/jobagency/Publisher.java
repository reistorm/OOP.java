package Seminar7.Observer.src.jobagency;

// Это интерфейс рассылки наблюдателям
// Он может регистрировать наблюдателей, избавляться от них, и рассылать им всем сообщения
public interface Publisher {
    void registerObserver(Observer observer); // наблюдатель подписывается на изменения
    void removeObserver(Observer observer);// наблюдатель отписывается
    void sendOffer(String nameCompany, int salary); // рассылает офферы
}
