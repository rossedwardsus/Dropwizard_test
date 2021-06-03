package com.javaeeeee.dwstart;

import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.codahale.metrics.annotation.Timed;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.db.DataSourceFactory;
//import io.dropwizard.jdbi3.JdbiFactory;
import javax.validation.Valid;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

//MyDAO mydao = new MyDAO();

//import org.skife.jdbi.v2.sqlobject.Bind;
//import org.skife.jdbi.v2.sqlobject.SqlQuery;
//import org.skife.jdbi.v2.sqlobject.SqlUpdate;
//import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

import com.javaeeeee.dwstart.db.MyDao;

/*interface MyDao {

  //User user;

  @SqlUpdate("create table something (id int primary key, name varchar(100))")
  void createSomethingTable();


  @SqlUpdate("insert into something (id, name) values (:id, :name)")
  void insert(@Bind("id") int id, @Bind("name") String name);


  @SqlQuery("select name from something where id = :id")
  String findNameById(@Bind("id") int id);


  @SqlQuery("select email from users")
  public abstract List<User> getAllUsers();

  //void close();

}*/

@Path("/hello_json")
public class HelloJsonResource {

    //@Valid
    //@NotNull
    //private DataSourceFactory database = new DataSourceFactory();

    private Jdbi jdbi;
    public MyDao dao;

    //final MyDAO dao = database.onDemand(MyDAO.class);

    //HelloJsonResource(MyDAO mydao){
    HelloJsonResource(Jdbi jdbi){
        //this.database = database;
        this.dao = jdbi.onDemand(MyDao.class);
        //this.dao = mydao;
        this.jdbi = jdbi;
    }

    

    //public User user = new User();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting getJSONGreeting() {
    //public List<User> getJSONGreeting() {
        //MyDao dao = jdbi.onDemand(MyDao.class);
        //List<User> users = dao.getAllUsers();

        //System.out.println(users);

        //return new User(email);

        //return users;

        return new Greeting("Hello world get!");
    }

    public static class TestClass {

        @JsonProperty("name")
        public String name;

    }

    @POST
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting postJSONGreeting(TestClass test) {
        return new Greeting("Hello world post!" + test.name);
    }

    //curl -X POST -H "Content-Type: application/json" -d '{"name": "linuxize@example.com"}' http://localhost:8080/hello_json
}
