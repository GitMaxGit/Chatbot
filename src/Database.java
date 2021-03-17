import java.util.HashMap;

public class Database {
    private final HashMap<Integer, Patient> patients;
    private final HashMap<Integer, Patient> relatives;
    private int patientCounter;
    private int relativeCounter;

    public Database(){
        patients = new HashMap<>();
        relatives = new HashMap<>();
        patientCounter = 0;
        relativeCounter = 0;
        Patient david = new Patient("David", patientCounter, 23, "Headache", "released");
        Patient anna = new Patient("Anna", patientCounter, 12, "Broken leg", "hospitalized");
        Relative simon = new Relative("Simon", relativeCounter++, 0);
        Relative jonas = new Relative("Jonas", relativeCounter++, 0);
        patients.put(patientCounter++, david);
        patients.put(patientCounter++, anna);
        patients.get(0).addRelatives(simon);
        patients.get(0).addRelatives(jonas);
    }

    public int getPatientCounter() {
        return patientCounter;
    }

    public HashMap<Integer, Patient> getPatients() {
        return patients;
    }

    public HashMap<Integer, Patient> getRelatives() {
        return relatives;
    }
}


