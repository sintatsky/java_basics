
public class Main {
    public static void main(String[] args) {


        float[] patientsTemperature = new float[30];

        final int NUMBER_OF_PATIENTS = 30;
        final float MIN_TEMP = 32;
        final float MAX_TEMP = 40;
        final float MIN_TEMP_OF_HEALTHY_PATIENT = (float) 36.2;
        final float MAX_TEMP_OF_HEALTHY_PATIENT = (float) 36.9;


        for (float i = 0; i < patientsTemperature.length; i++) {
            patientsTemperature[(int) i] = ((float) (Math.random() * (MAX_TEMP - MIN_TEMP) + MIN_TEMP));

            System.out.println("Температура пациента:\t " + String.format("%.1f",patientsTemperature[(int) i]));
        }


        float sum = 0;
        for (float num : patientsTemperature) {
            sum = sum + num;
        }
        System.out.println("\nСредняя температура: \t" + String.format("%.1f" , (sum / NUMBER_OF_PATIENTS)) + "\n" );



        for (int i = 0; i < patientsTemperature.length; i++) {
            int count = 0;
            if (patientsTemperature[i] > MIN_TEMP_OF_HEALTHY_PATIENT
                    && patientsTemperature[i] < MAX_TEMP_OF_HEALTHY_PATIENT) {
                count++;
            }

            System.out.println("Количество здоровых:  \t" + count);
        }

    }
}


