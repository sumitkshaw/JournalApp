package sumitshaww.journalApp.controller;

import org.springframework.web.bind.annotation.*;
import sumitshaww.journalApp.entity.JournalEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        return true;
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long myId){
        return null;
    }
    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable long myId){
        return null;
    }
    @PutMapping
    public JournalEntry updateJournalById(@PathVariable Long id, @RequestBody JournalEntry myEntry){
        return null;
    }
}
