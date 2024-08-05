package dev.pra.runnerz.run;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface RunRepository extends ListCrudRepository<Run, Integer> {

    List<Run> findAllByLocation(String location);

    @Modifying
    @Query("UPDATE Run SET title = :title, started_on = :started_on, completed_on = :completed_on, miles = :miles, location = :location WHERE id = :id")
    void update(
            @Param("title") String title,
            @Param("started_on")LocalDateTime started_on,
            @Param("completed_on") LocalDateTime completed_on,
            @Param("miles") Integer miles,
            @Param("location") String location,
            @Param("id") Integer id
    );
}
