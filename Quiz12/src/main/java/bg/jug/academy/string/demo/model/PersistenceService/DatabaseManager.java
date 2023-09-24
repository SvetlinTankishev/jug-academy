/*
Create a DatabaseManager component that injects a bg.jug.academy.string.demo.model.PersistenceService instance
 in the persistenceService field and implements the public void execute() method that calls persistenceService.execute()
*/
package bg.jug.academy.string.demo.model.PersistenceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseManager {
    @Autowired
    private bg.jug.academy.string.demo.model.PersistenceService persistenceService;

    public void execute() {
        persistenceService.execute();
    }
}
