package com.patterns.factorymethodpattern;

public class FeedbackXMLDisplayService extends DisplayService {

    @Override
    protected XMLParser getParser() {
        return  new FeedbackXML();
    }
}
