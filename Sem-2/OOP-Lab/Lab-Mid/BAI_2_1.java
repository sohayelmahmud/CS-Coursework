// HospitalSystem
class Appointment {
    String doctorName;
    String department;
    double consultationFee;

    Appointment(String doctorName, String department, double consultationFee) {
        this.doctorName = doctorName;
        this.department = department;
        this.consultationFee = consultationFee;
    }

    void displayAppointment() {
        System.out.println("Doctor: " + doctorName);
        System.out.println("Department: " + department);
        System.out.println("Consultation Fee: Rs. " + consultationFee);
    }
}

class Patient {
    int patientId;
    String patientName;
    Appointment appointment;

    Patient(int patientId, String patientName, String doctorName, String department, double consultationFee) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.appointment = new Appointment(doctorName, department, consultationFee);
    }

    void displayDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        appointment.displayAppointment();
    }
}

class EmergencyPatient extends Patient {
    int emergencyLevel; // 1 to 5

    EmergencyPatient(int patientId, String patientName, String doctorName, String department,
            double consultationFee, int emergencyLevel) {
        super(patientId, patientName, doctorName, department, consultationFee);
        this.emergencyLevel = emergencyLevel;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Emergency Level: " + emergencyLevel);
    }
}

class HospitalManager {

    void increaseFee(Appointment a) {
        double newFee = a.consultationFee * 1.10; // increase by 10%
        if (newFee <= 10000) {
            a.consultationFee = newFee; // update existing object
        }
    }

    void displayPatient(Patient p) {
        p.displayDetails();
    }

    Patient findPatientWithHighestFee(Patient[] patients) {
        if (patients == null || patients.length == 0)
            return null;

        Patient highest = null;
        double maxFee = -1;

        for (Patient p : patients) {
            if (p != null) {
                double fee = p.appointment.consultationFee;
                if (fee > maxFee) {
                    maxFee = fee;
                    highest = p;
                }
            }
        }
        return highest;
    }
}

public class BAI_2_1 {
    public static void main(String[] args) {
        HospitalManager manager = new HospitalManager();
        Patient[] patients = new Patient[5];

        patients[0] = new Patient(1, "Ali", "Dr. Ahmed", "Cardiology", 3000);
        patients[1] = new Patient(2, "Sara", "Dr. Fatima", "Neurology", 5000);
        patients[2] = new Patient(3, "Rahim", "Dr. Khan", "Orthopedics", 4000);
        patients[3] = new EmergencyPatient(4, "Karim", "Dr. Ahmed", "Cardiology", 6000, 4);
        patients[4] = new EmergencyPatient(5, "Nadia", "Dr. Fatima", "Neurology", 8000, 5);

        System.out.println("=== All Patients ===");
        for (Patient p : patients) {
            manager.displayPatient(p);
            System.out.println("-------------------");
        }

        // increase fee of patient 1
        System.out.println("=== Increasing Fee of Patient 1 ===");
        manager.increaseFee(patients[0].appointment);
        manager.displayPatient(patients[0]);

        // find patient with highest fee
        System.out.println("=== Patient with Highest Fee ===");
        Patient highest = manager.findPatientWithHighestFee(patients);
        if (highest != null) {
            System.out.println("Name: " + highest.patientName);
            System.out.println("Consultation Fee: Rs. " + highest.appointment.consultationFee);
        }
    }
}