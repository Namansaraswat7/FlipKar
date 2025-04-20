package design.flipkar;

import java.util.HashMap;
import java.util.Map;

public class BranchController {

   BranchService branchService = new BranchService();

    void addBranch(String branchName, String[] branchDetails) {
        branchService.addBranch(branchName,branchDetails);
    }

    void addVehicle(String branchName, String vehicleDetails) {
        branchService.addVehicle(branchName,vehicleDetails);
    }

    Map<String,Branch> getBranches() {
        return branchService.getBranches();
    }
}
