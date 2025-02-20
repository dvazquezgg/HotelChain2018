public class Main {

    public static void main(String[] args) {

        Points[] allPoints = new Points[10000]; // declared globally

        allPoints[0] = new Points("m100");
        allPoints[1] = new Points("m101",5000);
        allPoints[2] = new Points("m102",2000);

        Visits v1 = new Visits("h003", 3);
        Visits v2 = new Visits("h013", 1);
        Visits v3 = new Visits("h013", 2);
        Visits v4 = new Visits("h005", 6);

        allPoints[0].addVisit(v1);
        allPoints[0].addVisit(v2);
        allPoints[0].addVisit(v3);
        allPoints[0].addVisit(v4);
        allPoints[1].addVisit(v1);
        allPoints[1].addVisit(new Visits("h004",6));
    }

    public static void q11b(Points[] allPoints){
        System.out.println(allPoints[2].getMemberId());
        System.out.println(allPoints[0].getBonusPoints());
        System.out.println(allPoints[1].getAllVisits(1).getDays());
    }
}
