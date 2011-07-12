package com.apress.springrecipes.sequence;

public class SimpleSequenceGenerator implements SequenceGenerator {

    private String prefix;
    private String suffix;
    private int initial;
    private int counter;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public SimpleSequenceGenerator() {
        //nothing to do
    }

    public SimpleSequenceGenerator(String prefix, String suffix, int initial) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.initial = initial;
    }

    @Override
    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(prefix);
        buffer.append(initial + counter++);
        buffer.append(suffix);
        return buffer.toString();
    }

}
