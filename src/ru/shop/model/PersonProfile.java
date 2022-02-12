package ru.shop.model;

public class PersonProfile {

    private String fio;
    private int moneyOnAccount;
    private String workPosition;

    public PersonProfile(String fio, int moneyOnAccount, String workPosition){
        this.fio = fio;
        this.moneyOnAccount = moneyOnAccount;
        this.workPosition = workPosition;
    }

    @Override
    public String toString() {
        return "PersonProfile{" +
                "fio='" + fio + '\'' +
                ", moneyOnAccount=" + moneyOnAccount +
                ", workPosition='" + workPosition + '\'' +
                '}';
    }
}
