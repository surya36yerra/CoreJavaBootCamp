//package Preparation.Tests;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.Map;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class EmpRecordTest {
//
//    @Test
//    public void testEmpRecord() {
//        // Create a sample address map
//        Map<String, String> address = Map.of(
//            "City", "New York",
//            "State", "NY"
//        );
//
//        // Create an instance of EmpRecord
//        EmpRecord empRecord = new EmpRecord(1, "John Doe", 50000L, address);
//
//        // Verify the values
//        Assertions.assertEquals(1, empRecord.id());
//        Assertions.assertEquals("John Doe", empRecord.name());
//        Assertions.assertEquals(50000L, empRecord.salary());
//        Assertions.assertEquals(address, empRecord.address());
//    }
//}