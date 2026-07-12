package Arrays;

public class TekDiziliArray
{
    static void main(String[] args) {

        String[] days = {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma"};
        String[] weekendsDays = {"Cumartesi","Pazar"};

        for(int i = 0; i< days.length; i++){
            System.out.println(days[i]);
        }

        for(int i = 0; i< weekendsDays.length; i ++){
            System.out.println(weekendsDays[i]);
        }
    }

}
