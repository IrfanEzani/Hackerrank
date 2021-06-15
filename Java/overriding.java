

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }

}

public class overriding {

    public static void main(String[] args) {
        Sports sports = new Sports();
        Soccer soccer = new Soccer();

        String result = sports.getName();
        System.out.println(result);
        sports.getNumberOfTeamMembers();

        String result2 = soccer.getName();
        System.out.println(result2);
        soccer.getNumberOfTeamMembers();
    }
}