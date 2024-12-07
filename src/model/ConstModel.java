package model;

public enum ConstModel {
    ASK_COORDINATE("Please enter starting coordinate for your ship: ");

    private final String str;

    ConstModel(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
