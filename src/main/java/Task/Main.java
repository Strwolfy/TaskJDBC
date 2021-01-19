package Task;

import Task.model.User;
import Task.service.UserServiceImpl;
import Task.service.UserService;
import Task.util.Util;

import java.sql.SQLException;
import java.util.List;

public class Main {


    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();

        // создание таблицы
        userService.createUsersTable();

        // добавление 4-х пользователей
        userService.saveUser("Alexey", "Trubov", (byte) 45);
        userService.saveUser("Oleg", "Sergeev", (byte) 32);
        userService.saveUser("Evgeniy", "Prigozhin", (byte) 53);
        userService.saveUser("Andrey", "Shevtsov", (byte) 27);

        // вывод всех пользователей
        List<User> userList =  userService.getAllUsers();

        // очистка таблицы
        userService.cleanUsersTable();

        //удаление таблицы
        userService.dropUsersTable();

    }
}
