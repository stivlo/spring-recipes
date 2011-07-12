package com.apress.springrecipes.sequence;

import java.util.Map;

public class MapSequenceGenerator implements SequenceGenerator {

    private String prefix;
    private int initial;
    private int counter;
    private Map<Object, Object> suffixes;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public void setSuffixes(Map<Object, Object> suffixes) {
        this.suffixes = suffixes;
    }

    @Override
    public String getSequence() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(prefix);
        buffer.append(initial + counter++);
        for (Map.Entry<Object, Object> entry : suffixes.entrySet()) {
            buffer.append("-").append(entry.getKey()).append("@").append(entry.getValue());
        }
        return buffer.toString();
    }

}
