// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixi
        String[][] alphabet = {{"a", "b", "c"}, {"f", "e", "f"}};
        alphabet[0][1] = "f";
        System.out.println(alphabet[0][1]);
        for (int i = 0; i < alphabet.length; i++) {
            for (int x = 0; x < alphabet[0].length; x++) {
                System.out.println(alphabet[i][x]);
            }
        }
        int[][] intList = {{1, 2, 3},{4, 5, 6}};
        intList[0][1] = intList[0][0] + intList[0][1];
        System.out.println(intList[0][1]);
        for (int i = 0; i < intList.length; i++) {
            for (int x = 0; x < intList[0].length; x++) {
                System.out.println(intList[i][x]);
            }
        }

        Double[][] doubleList={{1.0,1.1,1.2},{1.3,1.4,1.5}};
        doubleList[1][0]+=1;
        System.out.println(doubleList[0][1]);
        for (int i = 0; i < doubleList.length; i++) {
            for (int x = 0; x < doubleList[0].length; x++) {
                System.out.println(doubleList[i][x]);
            }
        }

        boolean[][] booleanList= new boolean[3][3];
        booleanList[1][2]=true;
        for (int i = 0; i < booleanList.length; i++) {
            for (int x = 0; x < booleanList[0].length; x++) {
                System.out.println(booleanList[i][x]);
            }
        }

        Person eaton=new Person("eaton");
        Person toshi=new Person("toshi");
        Person nelson=new Person("Nelson");
        Person sajjid=new Person("sajjid");
        Person[][] people={{toshi, eaton},{nelson, sajjid}};
        people[1][1]=eaton;
        System.out.println(people[1][1]);
        for(int i=0;i<people.length;i++){
            for(int x=0;x<people[0].length;x++){
                System.out.println(people[i][x]);
            }
        }

    }
}
