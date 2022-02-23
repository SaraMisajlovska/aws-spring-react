package com.amigoscode.awsspringreact.config;

public enum Keys {
    ACCESS_KEY("AKIATVQ37WJKEU2KFWUI"),
    SECRET_KEY("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");

    private final String keys;

    Keys(String keys) {
        this.keys = keys;
    }

    public String getKeys() {
        return keys;
    }
}
