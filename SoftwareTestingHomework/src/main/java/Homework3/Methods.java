package Homework3;

import java.util.ArrayList;

public class Methods {
    private ArrayList<ApplicationData> applicationData;

    public Methods(){
        this.applicationData = new ArrayList<>();
        this.applicationData.add(new ApplicationData("John", "Williams", "12/04/2000", 4567865));
        this.applicationData.add(new ApplicationData("Oliver", "Miller", "07/23/2000", 456765));
        this.applicationData.add(new ApplicationData("Sophia", "Johnson", "10/12/2007", 234567));
    }

    public ArrayList<ApplicationData> getApplicationData(){
        return applicationData;
    }

    public ArrayList<ApplicationData> addNewApplication(ApplicationData application) {
        if (!applicationData.contains(application)) {
            applicationData.add(application);
        }
        return applicationData;
    }

    public ArrayList<ApplicationData> updateApplicationData(String name, int phoneNumber){
        for (int i = 0; i<applicationData.size(); i++){
            if (applicationData.get(i).getName().equals(name)){
                applicationData.get(i).setPhoneNumber(phoneNumber);
            }
        }
        return applicationData;
    }

    public ApplicationData findSpecificApplication(String name){
        for (int i = 0; i<applicationData.size(); i++){
            if (applicationData.get(i).getName().equals(name)){
                return applicationData.get(i);
            }
        }
        return null;
    }

}
