public class SignUpManager {
    public void signUp(User user){
        AgeUserCheckService ageUserCheckService = new AgeUserCheckService();
        if (ageUserCheckService.checkUser(user)) {
            System.out.println("Kullanıcı kayıt oldu: " + user.getName());
        }
        else {
            System.out.println("Kullanıcı kayıt olamadı !");
        }


    }
}
