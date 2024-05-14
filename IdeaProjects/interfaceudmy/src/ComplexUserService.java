public class ComplexUserService implements IUserCheckService{

    @Override
    public boolean checkUser(User user){
        if (user.getAge() >=18 && user.getName().startsWith("Mu")){
            return true;
        }
        return false;

    }
}
