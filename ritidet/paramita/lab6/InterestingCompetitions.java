package ritidet.paramita.lab6;

import java.util.ArrayList;

public class InterestingCompetitions {
    public static void main(String[] args) {
        AFFChampionship aff2022 = new AFFChampionship("AFF 2022", "Thailand", "Vietnam");
        AFFChampionship aff2020 = new AFFChampionship("AFF 2020", "Thailand", "Indonesia");
        System.out.println(aff2022);
        System.out.println(aff2020);
        ArrayList<String> places = new ArrayList<String>();
        places.add("Hanoi");
        places.add("Bankok");
        aff2022.setPlace(places);
        ArrayList<String> sponsor = new ArrayList<String>();
        sponsor.add("Mitsubishi Electronics");
        aff2022.setSponsorship(sponsor);

        places.remove("Hanoi");
        places.add("Kallang");
        aff2020.setPlace(places);
        sponsor.remove("Mitsubishi Electronics");
        sponsor.add("Suzuki");
        sponsor.add("Yanmar");
        aff2020.setSponsorship(sponsor);
    }
   

}
