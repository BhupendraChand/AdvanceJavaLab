
public class TestBean {
    public static void main(String[] args) {
        Student st = new Student();
        st.setId(12);
        st.setName("Bhupendra Chand");
        st.setSem("Sixth");
        
        System.out.println("Student Details");
        System.out.println("Id\tName\t\tSemester");
        System.out.println(st.getId()+"\t"+st.getName()+"\t"+st.getSem());
    } 
}
