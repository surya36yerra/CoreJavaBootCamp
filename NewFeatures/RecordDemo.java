package NewFeatures;

import java.lang.reflect.RecordComponent;

public class RecordDemo {
    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord("John", "Doctor");
        System.out.println(personRecord.name());
        System.out.println(personRecord.occupation());


        Class personClass = personRecord.getClass();
        System.out.println(personClass.isRecord());
        RecordComponent[] recordComponentArray = personClass.getRecordComponents();
        for (RecordComponent rc : recordComponentArray) {
            System.out.println(rc.toString());

        }
    }
}
