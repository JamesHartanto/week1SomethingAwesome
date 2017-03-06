/**
 * Created by JamesHartanto on 3/4/17.
 */
public class Elements {
    int value;
    String name;

    public Elements(String name, int value){
        this.name = name;
        this.value = value;
    }

    public static String twoElements(Elements element1, Elements element2) {
        int sum = element1.value + element2.value;

        if (sum == 0){
            return (element1.name + "1" + element2.name + "1");
        }else if (sum - element2.value == 0){
            return (element1.name + "1" + element2.name + "2");
        }else if (sum - 2*element2.value == 0){
            return (element1.name + "1" + element2.name + "3");
        }else if (sum - 3*element2.value == 0){
            return (element1.name + "1" + element2.name + "4");
        }else if (sum + element1.value == 0){
            return (element1.name + "2" + element2.name + "1");
        }else if (sum + 2*element1.value == 0){
            return (element1.name + "3" + element2.name + "1");
        }else if (sum + 3*element1.value ==0){
            return (element1.name + "4" + element2.name + "1");
        }else {
            return ("MAYBE the molecule does not exist");
        }
    }
}
