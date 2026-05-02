import java.util.Scanner;

class TravelAgencies {
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
    this.regNo = regNo;
    this.agencyName = agencyName;
    this.packageType = packageType;
    this.price = price;
    this.flightFacility = flightFacility;
    }

    public int getRegNo() { 
        return regNo; 
    }
    public String getAgencyName() { 
        return agencyName; 
    }
    public String getPackageType() { 
        return packageType; 
    }
    public int getPrice() { 
        return price;
     }
    public boolean isFlightFacility() { 
        return flightFacility; 
    }

    
    public void setRegNo(int regNo) { 
        this.regNo = regNo;
     }
    public void setAgencyName(String agencyName) {
         this.agencyName = agencyName; 
        }
    public void setPackageType(String packageType) { 
        this.packageType = packageType;
     }
    public void setPrice(int price) { 
        this.price = price; 
    }
    public void setFlightFacility(boolean flightFacility) { 
        this.flightFacility = flightFacility; 
    }
}

public class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TravelAgencies[] agencies = new TravelAgencies[n];

        for (int i = 0; i < n; i++) {
            int regNo = sc.nextInt();
            sc.nextLine(); // Consume newline
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            boolean flightFacility = sc.nextBoolean();
            
            agencies[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
        }

        int searchRegNo = sc.nextInt();
        sc.nextLine(); 
        String searchPackageType = sc.nextLine();

        int highestPrice = findAgencyWithHighestPackagePrice(agencies);
        System.out.println(highestPrice);

        
        TravelAgencies resultAgency = agencyDetailsForGivenIdAndType(agencies, searchRegNo, searchPackageType);
        
        if (resultAgency != null) {
            System.out.println(resultAgency.getAgencyName() + ":" + resultAgency.getPrice());
        }
    }

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
        int maxPrice = 0;
        for (TravelAgencies agency : agencies) {
            if (agency.getPrice() > maxPrice) {
                maxPrice = agency.getPrice();
            }
        }
        return maxPrice;
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) {
        for (TravelAgencies agency : agencies) {
            // Conditions: Flight facility true AND regNo matches AND packageType matches (Case Insensitive)
            if (agency.isFlightFacility() && 
                agency.getRegNo() == regNo && 
                agency.getPackageType().equalsIgnoreCase(packageType)) {
                return agency;
            }
        }
        return null;
    }
}