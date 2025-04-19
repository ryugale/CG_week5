import java.util.PriorityQueue;
import java.util.Comparator;

public class HospitalTriageSystem {
   static class Patient {
       String name;
       int severity;

       Patient(String name, int severity) {
           this.name = name;
           this.severity = severity;
       }
   }

   public static void main(String[] args) {
       PriorityQueue<Patient> triageQueue = new PriorityQueue<>(new Comparator<Patient>() {
           @Override
           public int compare(Patient p1, Patient p2) {
               return Integer.compare(p2.severity, p1.severity);
           }
       });
       triageQueue.add(new Patient("John", 3));
       triageQueue.add(new Patient("Alice", 5));
       triageQueue.add(new Patient("Bob", 2));

       System.out.println("Treatment order:");
       while (!triageQueue.isEmpty()) {
           Patient patient = triageQueue.poll();
           System.out.println(patient.name + " (Severity: " + patient.severity + ")");
       }
   }
}