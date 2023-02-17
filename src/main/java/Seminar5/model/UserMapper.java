package Seminar5.model;

public class UserMapper {
    public String map(User user) {
        return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        if (line.contains("; ")) {
            String[] lines = line.split("; ");
            return new User(lines[0], lines[1], lines[2], lines[3]);
        }
        else {
            String[] lines = line.split(", ");
            return new User(lines[0], lines[1], lines[2], lines[3]);
        }
    }
    public String mapOld(User user) {
        return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }
    public String mapJson(User user) {
        return String.format("{\"id\":\"%s\", \"Name\":\"%s\", \"LastName\":\"%s\", \"Phone\":\"%s\"}", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());

    }
}
