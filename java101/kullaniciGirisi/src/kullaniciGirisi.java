import java.util.Scanner;

/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan program
 */
public class kullaniciGirisi {
    public static void main(String[] args) {
        String password = "sifre",username = "user",userName,userPassword, answer,newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        userPassword = input.nextLine();

        if(userPassword.equals(password) && userName.equals(username)) {
            System.out.println("Şifre doğru!");
        }
        else{
            System.out.println("Şifre yanlış! \nŞifrenizi sıfırlamak ister misiniz?\n evet için 'e' , hayır için 'h' basınız. ");
            answer = input.nextLine();

            switch (answer){
                case "h":
                    System.out.println("Şifre sıfırlanamadı! ");
                    break;
                case "e":
                    System.out.print("Yeni şifrenizi giriniz: ");
                    newPassword = input.nextLine();

                    if((!newPassword.equals(userPassword)) && (!newPassword.equals(password))){
                        password = newPassword;
                        System.out.println("Şifre oluşturuldu!\nYeni şifre:"+ password);
                    }else {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        newPassword =input.nextLine();
                    }
                    break;
                default:
                    System.out.print("Hatalı harf girdiniz!");

            }

        }

    }
}
