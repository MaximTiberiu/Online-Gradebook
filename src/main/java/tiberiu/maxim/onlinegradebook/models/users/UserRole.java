package tiberiu.maxim.onlinegradebook.models.users;

public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    SECRETARY("ROLE_SECRETARY"),
    TEACHER("ROLE_TEACHER"),
    STUDENT("ROLE_STUDENT");

    final String type;

    private UserRole(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
