package com.apress.springrecipes.sequence;

import java.util.List;

public class ListSequenceGenerator implements SequenceGenerator {

    private String prefix;
    private int initial;
    private int counter;
    private List<Object> suffixes;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public void setSuffixes(List<Object> suffixes) {
        this.suffixes = suffixes;
    }

    @Override
    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(prefix);
        buffer.append(initial + counter++);
        for (Object suffix : suffixes) {
            buffer.append("-").append(suffix);
        }
        return buffer.toString();
    }

}
