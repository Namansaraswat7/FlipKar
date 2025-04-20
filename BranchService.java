package design.flipkar;

import java.util.*;

public class BranchService {

    Map<String,Branch> branchMap = new HashMap<>();


    public void addBranch(String branchName, String[] branchDetails) {

        Branch branchObj = createBranchFromBranchDetails(branchName,branchDetails);

        branchMap.put(branchObj.getName(),branchObj);

        //System.out.println(branchMap);
        System.out.println("Branch name => " + branchName + ",  Branch vehicle list =>>>" +   branchMap.get(branchName).getVehicleList());
        System.out.println("*************************");

    }

    private Branch createBranchFromBranchDetails(String branchName, String[] branchDetails) {

        Branch branch = new Branch();
        branch.setName(branchName);

        List<Vehicle> vehicleList = getVehiclesToAdd(branchDetails);
        branch.setVehicleList(vehicleList);

        return branch;
    }

    private List<Vehicle> getVehiclesToAdd(String[] branchDetails) {

        List<Vehicle> vehicleList = new ArrayList<>();

        for(String branchDetail : branchDetails) {

            String[] branchDetailSplit = branchDetail.split(" ");

            // “1 suv for Rs.12 per hour”
            // [“3 sedan for Rs.11 per hour”, “3 bikes for Rs.30 per hour”, “4 hatchback for Rs.8 per hour”]

            // this logic is hardcoded as per consistent input type as above
            Integer noOfVehicles = Integer.parseInt(branchDetailSplit[0]);
            String vehicleType = branchDetailSplit[1].toUpperCase();
            int price = Integer.parseInt(branchDetailSplit[3].substring(3));

            Vehicle vehicle = new Vehicle(vehicleType,price);

            for(int i =0; i < noOfVehicles; i++){
                vehicleList.add(vehicle);
            }
        }

        return vehicleList;
    }

    public void addVehicle(String branchName, String vehicleDetails) {
        Branch branch = branchMap.get(branchName);

        List<Vehicle> vehicleList = getVehiclesToAdd(new String[]{vehicleDetails});
        List<Vehicle> existingVehicleList = branch.getVehicleList();
        existingVehicleList.addAll(vehicleList);
        System.out.println(branchMap.get(branchName).getVehicleList());
        System.out.println("##################################");
    }

    Map<String,Branch> getBranches() {
        return branchMap;
    }

}
