/**
 
 A municipal corporation wants to manage citizen complaint records.
 Create a class ServiceRequest with complaint (String) and date
 (String) in format DD-MMM-YYYY. Create a custom exception
 InvalidDateException that is thrown if the date format is invalid
 (month part must be a valid 3-letter month like JAN, FEB etc.).
 Implement a static method extractMonth(String date) that extracts
 the month from the date string. Implement a static method
 displayByMonth(ServiceRequest[] sr) that groups complaints month-wise,
 counts complaints per month and identifies the month with maximum
 complaints. In main(), create array of at least 5 ServiceRequest
 objects, read from user, handle InvalidDateException, and call
 displayByMonth().
 
 */
