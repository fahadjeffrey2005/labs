/*
 
    Create a ServiceRequest class with fields request (String) and sr_date (DD-MMM-YEAR format). Create an array of requests. Implement displayByMonth(ServiceRequest[] sr) as a static method to list requests grouped by month.
 
 */
class ServiceRequest {
    String request;
    String sr_date;

    ServiceRequest(String request, String sr_date) {
        this.request = request;
        this.sr_date = sr_date;
    }

    public static void displayByMonth(ServiceRequest[] sr) {

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun",
                           "Jul","Aug","Sep","Oct","Nov","Dec"};

        for (int i = 0; i < months.length; i++) {
            System.out.println("\nMonth: " + months[i]);

            boolean found = false;

            for (int j = 0; j < sr.length; j++) {
                String[] parts = sr[j].sr_date.split("-");
                String m = parts[1];

                if (m.equalsIgnoreCase(months[i])) {
                    System.out.println(sr[j].request + " | " + sr[j].sr_date);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No requests");
            }
        }
    }

    public static void main(String[] args) {
        ServiceRequest[] sr = {
            new ServiceRequest("Install Software", "12-Jan-2025"),
            new ServiceRequest("Network Issue", "25-Feb-2025"),
            new ServiceRequest("Repair", "10-Jan-2025"),
            new ServiceRequest("Reset Password", "05-Mar-2025")
        };

        displayByMonth(sr);
    }
}
