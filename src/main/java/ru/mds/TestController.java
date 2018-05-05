package ru.mds;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mds.component.DatabaseInitializer;

import java.io.IOException;

/**
 * @author MDS
 * @since 03.05.2018 (1.0)
 */
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {
  private final DatabaseInitializer databaseInitializer;

  @PostMapping("/initDb")
  void initDb() throws IOException {
    databaseInitializer.initDb("/create_tables.sql");
  }
}