package sumitshaww.journalApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import sumitshaww.journalApp.entity.JournalEntry;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {

}
// mongo repository already provides us with the interface to interact with mongodb