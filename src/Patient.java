import java.util.ArrayList;

public class Patient {
    final private String name;
    final private int id;
    final private int room;
    final private String Illness;
    private String status;
    private final ArrayList<Relative> relatives = new ArrayList<>();

    public Patient(String name, int id, int room, String illness, String status) {
        this.name = name;
        this.id = id;
        this.room = room;
        Illness = illness;
        this.status = status;
    }

    void addRelatives(Relative relative){
        relatives.add(relative);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getRoom() {
        return room;
    }

    public String getIllness() {
        return Illness;
    }

    public String getStatus() {
        return status;
    }
}
