import java.util.Scanner;

class count{

  public static void main(String args[]) {
    String x;
    Scanner Scan=new Scanner(System.in);
    System.out.println("Enter a statement:");
    x=Scan.nextLine();

    int vowels = 0, consonants = 0, digits = 0, spaces = 0;

    x = x.toLowerCase();
    for (int i = 0; i < x.length(); ++i) {
      char ch = x.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        ++vowels;
      }

      else if ((ch >= 'a' && ch <= 'z')) {
        ++consonants;
      }
      
      else if (ch >= '0' && ch <= '9') {
        ++digits;
      }
      
      else if (ch == ' ') {
        ++spaces;
      }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    System.out.println("Digits: " + digits);
    System.out.println("White spaces: " + spaces);
  }
}