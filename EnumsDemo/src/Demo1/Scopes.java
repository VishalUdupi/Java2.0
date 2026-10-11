package Demo1;

public enum Scopes {
    Low("low"),
    Medium("medium"),
    High("high");

    private String description;

    Scopes(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
