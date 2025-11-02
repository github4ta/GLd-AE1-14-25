public class Login {
    public static void Login(User user){
        boolean exists  =Users.isUserInList(user);
        if(exists){
            System.out.println("Пользователь," +  user.getPhoneNumber());
        }
        else {
            System.out.println("«Вы не были зарегистрированы, мы вас\n" +
                    "зарегистрировали. Повторите вход");
        }}


    public static void register(User user){
            boolean exists = false;
            for (int i = 0; i < Users.getAllUsers().size() ; i++) {
                User existingUser = Users.getAllUsers().get(i);

                if(existingUser.getPhoneNumber().equals(user.getPhoneNumber())){
                    exists = true;
                    break;
                }
            }
            if(exists){
                System.out.println("Пользователь с номером " + user.getPhoneNumber() + " уже зарегистрирован.");
            }
            else{
                Users.addUser(user);
                System.out.println("Вы зарегистрированы");
            }
                
            }
        }

