package ru.mirea.mahmoud.b.i.room.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAllUsers();
    @Insert
    void insertUsers(User... users);
    @Delete
    void delete(User user);
}
