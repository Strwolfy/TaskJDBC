package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

//@Service
public class UserServiceImpl implements UserService  {
    public void createUsersTable() {
        System.out.println("Создаем таблицу");


    }

    public void dropUsersTable() {
        System.out.println("Удаляем таблицу");
    }

    public void saveUser(String name, String lastName, byte age) {
        System.out.println("Сохраняем таблицу");
    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        System.out.println("Получаем всех пользователей...");

        return null;
    }

    public void cleanUsersTable() {

    }
}
