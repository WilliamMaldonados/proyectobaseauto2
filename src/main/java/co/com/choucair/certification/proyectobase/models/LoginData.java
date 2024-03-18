package co.com.choucair.certification.proyectobase.models;

public class LoginData {

    public static class UserCredentials {
        private final String user;
        private final String password;

        public UserCredentials(String email, String password) {
            this.user = email;
            this.password = password;
        }

        public String getUser() {
            return user;
        }

        public String getPassword() {
            return password;
        }
    }



}

