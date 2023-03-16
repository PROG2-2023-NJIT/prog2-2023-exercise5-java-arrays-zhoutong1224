package prog2.exercise5.flight.booking.system;
import java.time.LocalDate;
import java.util.Random;

public class FlightBooking {
    private String flightCompany;
    private LocalDate departingDate;
    private LocalDate returnDate;
    private int totalPassengers;
    private int childPassengers;
    private int adultPassengers;
    private double  departingTicketPrice;
    private double  returnTicketPrice;
    private double totalTicketPrice;
    BookingClass bookingClass;
    TripDestination tripDestination;
    TripSource tripSource;
    TripType tripType;
    Airport sourceAirport;
    Airport destinationAirport;
    int TripDate;
    int size=3;
    enum TripType{
        ONE_WAY,RETURN
    }
    enum BookingClass{
        FIRST,BUSINESS,ECONOMY
    }
    enum TripSource{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }
    enum TripDestination{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }
    enum Airport{
        NANJING_LUKOU_INTERNATIONAL_AIRPORT,BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
        SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT,OULU_AIRPORT,HELSINKI_AIRPORT,
        PARIS_CHARLES_DE_GAULLE_AIRPORT
    }
    public FlightBooking(){}
    public FlightBooking(int size) {
        this.size = size;
        passengerFullName=new String[size];
        passengerGender=new String[size];
        passengerAge=new int[size];
        ticketNumber=new String[size];
    }
    String [] passengerFullName = {"Matt Jive", "Sally Fields", "Posh Quattro"};
    String [] passengerGender = {"Male", "Female", "Other"};
    int[] passengerAge = {43, 32, 21};
    public void setBookingClass(String bookingClass){
        switch(bookingClass){
            case "1":
            this.bookingClass=BookingClass.FIRST;
            break;
            case "2":
            this.bookingClass=BookingClass.BUSINESS;
            break;
            case "3":
            this.bookingClass=BookingClass.ECONOMY;
            break;
            default:
            System.out.println("You have no such bookingClass");
            break;
           }
    }
    public BookingClass getBookingClass(){
             return this.bookingClass;
    }

    public void setTripDate(int tripDate) {
        this.TripDate = tripDate;
        }
    public int getTripDate() {
            return TripDate;
        }
    public String[] getTicketNumber()
    {

        return ticketNumber;
    }
    public String getPassengerFullName(int index)
    {

        return passengerFullName[index];
    }
    public void setTripSource(String tripSource){
            switch(tripSource){
            case "1":
            this.tripSource=TripSource.NANJING;
            this.sourceAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.tripSource=TripSource.BEIJING;
            this.sourceAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.tripSource=TripSource.SHANGHAI;
            this.sourceAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
            break;
            case "4":
            this.tripSource=TripSource.OULU;
            this.sourceAirport=Airport.OULU_AIRPORT;
            break;
            case "5":
            this.tripSource=TripSource.HELSINKI;
            this.sourceAirport=Airport.HELSINKI_AIRPORT;
            break;
            case "6":
            this.tripSource=TripSource.PARIS;
            this.sourceAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
            break;
            default:
            System.out.println("You have no such tripsource and you have no such airport");
            break;
          }
    }
    public TripSource getTripSource(){
        return this.tripSource;
    }
    public void setTripDestination(String tripSource , String tripDestination){
            switch(tripDestination){
            case "1":
            this.tripDestination=TripDestination.NANJING;
            this.destinationAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.tripDestination=TripDestination.BEIJING;
            this.destinationAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.tripDestination=TripDestination.SHANGHAI;
            this.destinationAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
            break;
            case "4":
            this.tripDestination=TripDestination.OULU;
            this.destinationAirport=Airport.OULU_AIRPORT;
            break;
            case "5":
            this.tripDestination=TripDestination.HELSINKI;
            this.destinationAirport=Airport.HELSINKI_AIRPORT;
            break;
            case "6":
            this.tripDestination=TripDestination.PARIS;
            this.destinationAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
            break;
            default:
            System.out.println("You have no such tripDestination and you have no such desitinationAirport");
            break;
              }
    }
    public TripDestination getTripDestination(){
        return tripDestination;
    }
    public LocalDate getDepartingDate()
    {

        return departingDate;
    }
    public LocalDate getReturnDate()
    {

        return returnDate;
    }
    public void setTotalTicketPrice() {
        this.totalTicketPrice = Math.abs (2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
    }
    public double getTotalTicketPrice() {
        return  Math.abs(2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
    }

    public void setDepartingTicketPrice(int child, int adult) {
        this.departingTicketPrice = departingTicketPrice;
    }
    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }

    public void setReturnTicketPrice(){
        this.returnTicketPrice=returnTicketPrice;
    }
    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }
    public void setTripType(String tripType) {
        switch(tripType){
            case "1":
            this.tripType=TripType.ONE_WAY;
            break;
            case "2":
            this.tripType=TripType.RETURN;
            break;
            default:
            System.out.println("You have no such tripType");
            }
    }
    public TripType getTripType(){
        return this.tripType;
    }
    public int getChildrenPassengers()
    {

        return childPassengers;
    }
    public int getAdultPassengers()
    {

        return adultPassengers;
    }
    public void setSourceAirport(String sourceAirport){
        switch(sourceAirport){
            case "1":
            this.sourceAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.sourceAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.sourceAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
            break;
            case "4":
            this.sourceAirport=Airport.OULU_AIRPORT;
            break;
            case "5":
            this.sourceAirport=Airport.HELSINKI_AIRPORT;
            break;
            case "6":
            this.sourceAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
            break;
            default:
            System.out.println("You have no such airport");
            break;
          }
    }
    public void setDestinationAirport(String tripSource , String tripDestination){
        switch(tripDestination){
        case "1":
        this.tripDestination=TripDestination.NANJING;
        this.destinationAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
        break;
        case "2":
        this.tripDestination=TripDestination.BEIJING;
        this.destinationAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
        break;
        case "3":
        this.tripDestination=TripDestination.SHANGHAI;
        this.destinationAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
        break;
        case "4":
        this.tripDestination=TripDestination.OULU;
        this.destinationAirport=Airport.OULU_AIRPORT;
        break;
        case "5":
        this.tripDestination=TripDestination.HELSINKI;
        this.destinationAirport=Airport.HELSINKI_AIRPORT;
        break;
        case "6":
        this.tripDestination=TripDestination.PARIS;
        this.destinationAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
        break;
        default:
        System.out.println("You have no such tripDestination and you have no such desitinationAirport");
        break;
          }
}
public TripDestination getDestinationAirport(){
    return tripDestination;
}
        
    public void setTripDestination(Airport destinationAirport){
        if(destinationAirport.equals(sourceAirport)){
          this.destinationAirport=destinationAirport;
        }else{
          throw new IllegalArgumentException("Destination cannot be the same as source.");
        }
        }
        public Airport getDestinatiAirport(){
          return destinationAirport;
        }

    public void setDepartureDate(LocalDate departureDate) {
        String departingString = "2023-04-12";
        this.departingDate = LocalDate.parse(departingString);
    }

    public void setReturnDate(LocalDate returnDate) {
        String returningString = "2023-05-12";
        this.returnDate = departingDate.plusDays(2);
    }
    public void setPassengerFullName(int index,String passengerFullName)
    {

        this.passengerFullName[index] = passengerFullName;
    }
    public String getPassengerGender(int index)
    {
        return passengerGender[index];
    }
    public void setPassengerGender(int index,String passengerGender)
    {
        this.passengerGender[index]=passengerGender;
    }
    public int getPassengerAge(int index)
    {
        return passengerAge[index];
    }
    public void setPassengerAge(int index,int passengerAge)
    {
        this.passengerAge[index]=passengerAge;
    }
    
    public void setDepartingDate(LocalDate departingDate)
    {

        this.departingDate = departingDate;
    }

    public void setTotalTicketPrice(double totalTicketPrice)
    {

        this.totalTicketPrice = totalTicketPrice;
    }
    public void setChildPassengers(int childPassengers)
    {

        this.childPassengers = childPassengers;
    }
    public void setAdultPassengers(int adultPassengers)
    {

        this.adultPassengers = adultPassengers;
    }
    public void setTotalPassengers(int totalPassengers, int totalPassengers2){
        this.totalPassengers=childPassengers+adultPassengers;
        }
        public int getTotalPassengers() {
            return totalPassengers;
        }
   

    Random random = new Random();
    public String[] ticketNumber;
    public void setTicketNumber(int a) {
    
        switch (tripType) {
            case ONE_WAY:
                ticketNumber[a] = "11";
                break;
            case RETURN:
                ticketNumber[a] = "22";
                break;
        }
        switch (bookingClass) {
            case FIRST:
                ticketNumber[a] = ticketNumber[a] + "F";
                break;
            case BUSINESS:
                ticketNumber[a] = ticketNumber[a] + "B";
                break;
            case ECONOMY:
                ticketNumber[a] = ticketNumber[a] + "E";
                break;
        }
        for (int i = 0; i < 4; i++) {
            char f = (char) ((random.nextInt(26) + 65));
            ticketNumber[a] = ticketNumber[a] + f;
        }
        this.ticketNumber[a] = ticketNumber[a] + "DOM";
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
            this.ticketNumber[a] = ticketNumber[a] + "DOM";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
            this.ticketNumber[a] = ticketNumber[a] + "DOM";
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI) {
            this.ticketNumber[a] = ticketNumber[a] + "DOM";
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU) {
            this.ticketNumber[a] = ticketNumber[a] + "DOM";
        }
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.OULU) {
            this.ticketNumber[a] = ticketNumber[a] + "INT";
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.NANJING) {
            this.ticketNumber[a] = ticketNumber[a] + "INT";
        }
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.HELSINKI) {
            this.ticketNumber[a] = ticketNumber[a] + "INT";
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.NANJING) {
            this.ticketNumber[a] = ticketNumber[a] + "INT";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.OULU) {
            this.ticketNumber[a] = ticketNumber[a] + "INT";
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.BEIJING) {
            this.ticketNumber[a] = ticketNumber[a] + "INT";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
            this.ticketNumber[a] = ticketNumber[a] + "INT";
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.BEIJING) {
            this.ticketNumber[a] = ticketNumber[a] + "INT";
        }
    }
    

    
}
