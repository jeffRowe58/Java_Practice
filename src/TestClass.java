public class TestClass {
    public static void main(String[] args) {

//        try {
//            ExceptionStudy study = new ExceptionStudy();
//            System.out.println(Integer.parseInt(study.maybeAnInteger));
//            System.out.println(study.definitelyNotAnInteger);
//        } catch (NumberFormatException nfe) {
//            nfe.printStackTrace();
//        }

        ExceptionStudy study = new ExceptionStudy();
        study.multiCatch();
    }
}
