import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FamilyTree tree = new FamilyTree();

        Human natasha = new Human("Наташа", Gender.Female, LocalDate.of(1987, 3, 22));
        Human pasha = new Human("Паша", Gender.Male, LocalDate.of(1985, 2, 15));
        tree.add(natasha);
        tree.add(pasha);
        Human nikita = new Human("Никита", Gender.Male, LocalDate.of(2004, 11, 2),
                natasha, pasha);
        tree.add(nikita);
        Human grandFather = new Human("Николай", Gender.Male, LocalDate.of(1957, 4, 15));
        grandFather.addChild(pasha);
        tree.add(grandFather);
        Human grandMother = new Human("Валерия", Gender.Female, LocalDate.of(1960, 3, 25));
        grandMother.addChild(pasha);
        tree.add(grandMother);
        System.out.println(tree);
    }

}