package com.patterns.factorymethodpattern;

public abstract class DisplayService {

    public void display() {
        XMLParser xmlParser = getParser();
        String msg = xmlParser.parse();
        System.out.println(msg);
    }

    protected abstract XMLParser getParser();
}
