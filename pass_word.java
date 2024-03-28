import java.util.Scanner;
class pass_word{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=s.nextLine();
        int vowel=0,consonant=0,special=0,digit=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                ch=Character.toLowerCase(ch);
                if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                }
                else
                  consonant++;
                }
            
            else if(ch>='0' && ch<='9')
                digit++;
            else
               special++;
            }
            System.out.println("VOWELS:"+vowel);
            System.out.println("CONSONANT:"+consonant);
            System.out.println("DIGIT:"+digit);
            System.out.println("SPECIAL:"+special);

        }
        }
    
