package NewFeatures;

//only from java16
//make class as final
//make fields as final & private
//generate getter methods without any prefix
//generate constructor with fields mentioned inside record header
//toString,equals and hashcode methods are overrided
//extends not allowed,as it's already extended by Record class


public record PersonRecord(String name,String occupation) //extends
    implements Cloneable
{
    public static String name2="surya";
//    public  String name3="surya";

    //cannonical const

//    public PersonRecord(String name,String occupation){
//        if(name==null||occupation==null){
//            throw new IllegalArgumentException("Name and occupation cannot be null");
//        }
//        this.name=name;
//        this.occupation=occupation;
//    }
    public PersonRecord {
        if (name == null || occupation == null) {
            throw new IllegalArgumentException("Name and occupation cannot be null");
        }
    }
}
