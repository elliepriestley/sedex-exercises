package interface_practice_uber

class UberDomain(val vehicleRepo: VehicleRepoInterface) {

    fun getCountOfVehicles(): Int {
        return vehicleRepo.fetchListOfVehicles().count()
    }

}

interface VehicleRepoInterface {
    fun fetchListOfVehicles(): List<String>
}