package interface_practice_uber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UberDomainTest {
    @Test
    fun `Test that when user requests count of vehicles, given that they have 3 vehicles in repo, domain returns 3`() {
        val mockVehicleRepoWithThreeVehicles = object: VehicleRepoInterface {
            override fun fetchListOfVehicles(): List<String> {
                return listOf("ID1", "ID2", "ID3")
            }
        }

        val domain = UberDomain(mockVehicleRepoWithThreeVehicles)
        assertEquals(domain.getCountOfVehicles(), 3)

    }

    @Test
    fun `Test that when user requests count of vehicles, given that they have 0 vehicles in repo, domain returns 0`() {
        val mockVehicleRepoWithZeroVehicles = object:VehicleRepoInterface {
            override fun fetchListOfVehicles(): List<String> {
                return listOf()
            }
        }

        val domain = UberDomain(mockVehicleRepoWithZeroVehicles)
        assertEquals(domain.getCountOfVehicles(), 0)
    }
}