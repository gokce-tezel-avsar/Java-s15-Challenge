import com.library.person.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kimsiniz: (reader/librarian/author)");
        String role = scanner.nextLine().toLowerCase();

        Person person = null ;
        if(role.equals("reader")){
            person = new Reader(1,"Gökçe", "Tezel","gokce@gmail.com", "12345", 4);
        }else if(role.equals("librarian")){
            person = new Librarian(1,"ayşe","tezel","ayse@gmail.com", "45678");
        }else if(role.equals("author")){
            person = new Author(1, "Paulo", "Coelho");
        }else {
            System.out.println("Geçersiz rol girdiniz.");
        }
        System.out.println("Hoşgeldin," + person.getFirstName());

        System.out.println("**********");

        System.out.print("Yapmak istediğiniz işlemi giriniz: ");
        List<Books> kitaplar = BookRepository.getSampleBooks();
        String input = scanner.nextLine().toLowerCase();

        if (input.equals("showbooks")) {
            System.out.println("Tüm Kitaplar:");
            for (Books kitap : kitaplar){
                System.out.println(kitap);
            }
        } else {
            System.out.println("Bilinmeyen işlem.");
        }
    }
}