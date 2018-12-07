package com.patterns.factorymethodpattern;

public class OrderXMLDisplayService extends DisplayService {

    @Override
    protected XMLParser getParser() {
        return new OrderXMLParser();
    }
}
