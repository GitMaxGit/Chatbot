public class Relative {
    final private String name;
    final private int id;
    final private int patientId;

    public Relative(String name, int id, int patientId) {
        this.name = name;
        this.id = id;
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPatientId() {
        return patientId;
    }
}
