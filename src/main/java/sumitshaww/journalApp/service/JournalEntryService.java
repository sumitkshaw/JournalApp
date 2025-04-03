package sumitshaww.journalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sumitshaww.journalApp.entity.JournalEntry;
import sumitshaww.journalApp.repository.JournalEntryRepository;

@Service
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){

        journalEntryRepository.save(journalEntry);
    }
}

// controller --> service ---> repository
// best practice