package Seminar3.repository;

import Seminar3.data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    E findByFio(String fio);
}
