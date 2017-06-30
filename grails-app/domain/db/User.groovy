package db
class User {
    String username;
    String password;
    String email;
    static constraints = {
        email email: true;
    }
}
