package components;

public enum Languages {
    RU("ru", "Войти"),
    KZ("kz", "Кіру");

    public final String code;
    public final String label;

    Languages(String code, String label) {
        this.code = code;
        this.label = label;
    }
}
