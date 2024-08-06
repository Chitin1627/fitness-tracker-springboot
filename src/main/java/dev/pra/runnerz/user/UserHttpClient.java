package dev.pra.runnerz.user;

import dev.pra.runnerz.run.Run;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface UserHttpClient {
    @GetExchange("/api/runs")
    List<User> findAll();

    @GetExchange("/{id}")
    User findById(@PathVariable Integer id);
}
