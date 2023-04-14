
public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author hermannHesse = new Author("Hermann", "Hesse");
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1867);
        Book siddhartha = new Book("Сиддхартха", hermannHesse, 1922);


        System.out.println(warAndPeace.hashCode() == siddhartha.hashCode() ? "Хэш совпадает" : "Хэш не совпадает");
        System.out.println(((warAndPeace.equals(siddhartha)) ? "Обьекты равны" : "Объекты не равны"));
        System.out.println("siddhartha = " + siddhartha);
        System.out.println("levTolstoy = " + levTolstoy);


        System.out.println("warAndPeace.getNameBook() = " + warAndPeace.getNameBook());
        System.out.println("warAndPeace.getAuthor().get(lName/fName) = " + warAndPeace.getAuthor().getfName() + " " + warAndPeace.getAuthor().getlName());
        System.out.println("warAndPeace.getYear() = " + warAndPeace.getYear());
        warAndPeace.setYear(1870);
        System.out.println("Было 1867 , стало: " + warAndPeace.getYear());

        System.out.println("siddhartha.getNameBook() = " + siddhartha.getNameBook());
        System.out.println("siddhartha.getAuthor().get(lName/fName) = " + siddhartha.getAuthor().getfName() + " " + siddhartha.getAuthor().getlName());
        System.out.println("siddhartha.getYear() = " + siddhartha.getYear());

    }
}