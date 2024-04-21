package lesson8.get_and_set;

public class NotePadMain {
    public static void main(String[] args) {
        NotePad notePad = new NotePad();
        /*notePad.name = "ApplePaper";
        notePad.countOfPages = 50;*/
        System.out.println(notePad.getCountOfPage());
        System.out.println(notePad.getName());
        notePad.setName("ApplePaper");
        notePad.setCountOfPages(50);
        System.out.println(notePad.getCountOfPage());
        System.out.println(notePad.getName());
    }
}
