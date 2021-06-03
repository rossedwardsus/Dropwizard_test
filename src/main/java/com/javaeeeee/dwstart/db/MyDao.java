package com.javaeeeee.dwstart.db;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

import com.javaeeeee.dwstart.core.User;

public interface MyDao {

  //User user;

  /*@SqlUpdate("create table something (id int primary key, name varchar(100))")
  void createSomethingTable();


  @SqlUpdate("insert into something (id, name) values (:id, :name)")
  void insert(@Bind("id") int id, @Bind("name") String name);


  @SqlQuery("select name from something where id = :id")
  String findNameById(@Bind("id") int id);*/


  //@SqlQuery("select email from users")
  //public abstract List<User> getAllUsers();

  //void close();

}

//final MyDAO dao = database.onDemand(MyDAO.class);