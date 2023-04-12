
public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author hermannHesse = new Author("Hermann", "Hesse");
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1869);
        Book siddhartha = new Book("Сиддхартха", hermannHesse, 1922);


        System.out.println("warAndPeace.getNameBook() = " + warAndPeace.getNameBook());
        System.out.println("warAndPeace.getAuthor().get(lName/fName) = " + warAndPeace.getAuthor().getfName() + " " + warAndPeace.getAuthor().getlName());
        System.out.println("warAndPeace.getYear() = " + warAndPeace.getYear());
        warAndPeace.setYear(1870);
        System.out.println("Было 1869 , стало: " + warAndPeace.getYear());

        System.out.println("siddhartha.getNameBook() = " + siddhartha.getNameBook());
        System.out.println("siddhartha.getAuthor().get(lName/fName) = " + siddhartha.getAuthor().getfName() + " " + siddhartha.getAuthor().getlName());
        System.out.println("siddhartha.getYear() = " + siddhartha.getYear());

        System.out.println("warAndPeace.equals(siddhartha) = " + (warAndPeace.equals(siddhartha) ? "Строки равны" : "Строки не равны"));
        System.out.println("warAndPeace.hashCode() = " + warAndPeace.hashCode());
        System.out.println("siddhartha = " + siddhartha);

        System.out.println("levTolstoy.equals(hermannHesse) = " + (levTolstoy.equals(hermannHesse) ? "Строки равны" : "Строки не равны"));
        System.out.println("hermannHesse.hashCode() = " + hermannHesse.hashCode());
        System.out.println("levTolstoy = " + levTolstoy);
    }
}