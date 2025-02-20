public class Points
{
    private String memberId; // id of the hotel customer
    private int totalPoints; // this year's points
    private int bonusPoints; // any bonus points given to this year's new member
    private String statusNow; // current(this year's)status
    private String statusNextYear; // following year's status
    private Visits[] allVisits = new Visits[366];//details of each visit
    // during this year
    int y; // number of visits this year
    public Points(String id) // constructor for new member
    {
        memberId = id;
        bonusPoints = 0;
        y = 0;
        statusNow = "Bronze";
    }
    //constructor for new member given bonus points (valid for current year only)
    public Points(String id, int bp) {
        memberId = id;
        bonusPoints = bp; // multiples of 1000 - maximum number is 5000
        y = 0;
        statusNow = "Bronze";
    }

    // all the accessor and mutator methods are present but not shown
    // TODO Implement the missing methods


    public Visits getAllVisits(int v){
        return allVisits[v];
    }

    public void addVisit(Visits v) {// adds a new Visit object to the array
        allVisits[y] = v;
        y = y + 1;
    }

    // isGold() {code missing}  TODO: Implement this method
    // calculateTotalPoints(){code missing} TODO: Implement this method
    // daysMissing(){code missing} TODO: Implement this method

    // For using in q11b
    // TODO Implement the missing methods if needed
    public String getMemberId() {
        return memberId;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }
}