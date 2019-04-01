package alex;
public class Phonebook1 {

    public static void main(String[] args) {


        entry[] initial = new entry[4];
        initial[0] = new entry();
        initial[1] = new entry();
        initial[2] = new entry();
        initial[3] = new entry();

        initial[0].name = "Bart0";
        initial[0].prenume = "JE0";
        initial[0].phone_number = "1235498358";

        initial[1].name = "Bart";
        initial[1].prenume = "JE";
        initial[1].phone_number = "1235498358";

        initial[2].name = "Bart1";
        initial[2].prenume = "Jhone";
        initial[2].phone_number = "074535498358";

        initial[3].name = "Gheorghe";
        initial[3].prenume = "Vasile";
        initial[3].phone_number = "0745350000";

        int x;
        x = 0;
        while (initial.length > x)
        {
            initial[x].list();
            x=x+1;
        }

    }
}