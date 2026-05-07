//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Based upon the provided tests in GuildLogTest.java implement GuildLog.java with a focus being centered on immutable lists entry lists
//and passing the provided tests.

package edu.oop.guild.log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class GuildLog {

    private static final GuildLog INSTANCE = new GuildLog();

    private final List<String> entries = new ArrayList<>();

    private GuildLog() {}

    public static GuildLog getInstance() {
        return INSTANCE;
    }

    public void record(String entry) {
        Objects.requireNonNull(entry, "entry must not be null");
        entries.add(entry);
    }

    public List<String> entries() {
        return Collections.unmodifiableList(entries);
    }

    public int size() {
        return entries.size();
    }

    public void clear() {
        entries.clear();
    }
}
