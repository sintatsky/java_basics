import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        float[] patientsTemperature = {
                (float) 40.0, (float) 34.2, (float) 39.8, (float) 36.4, (float) 36.6, (float) 36.9, (float) 35.5, (float) 37.8,
                (float) 33.2, (float) 34.2, (float) 40.0, (float) 38.1, (float) 37.4, (float) 38.2, (float) 38.5, (float) 38.4, (float) 36.9,
                (float) 37.1, (float) 38.1, (float) 33.2, (float) 32.3, (float) 35.3, (float) 37.2, (float) 34.7, (float) 34.5, (float) 36.5,
                (float) 39.4, (float) 39.8, (float) 38.1, (float) 38.2};


        final int NUMBER_OF_PATIENTS = 30;
        final int MIM_TEMP = 32;
        final int MAX_TEMP = 40;
        final float MIN_TEMP_OF_HEALTHY_PATIENT = (float) 36.2;
        final float MAX_TEMP_OF_HEALTHY_PATIENT = (float) 36.9;


    for (float i =0; i < patientsTemperature.length; i++){
        System.out.println("Температуры пациентов " + patientsTemperature[(int) i]);
      }


        float sum = 0;
        for (float num : patientsTemperature) {
            sum = sum + num;
        }
        System.out.println("Средняя температура: " + sum / NUMBER_OF_PATIENTS);


        int count = 0;
        for (int i = 0; i < patientsTemperature.length; i++) {
            if (patientsTemperature[i] > MIN_TEMP_OF_HEALTHY_PATIENT
                    && patientsTemperature[i] < MAX_TEMP_OF_HEALTHY_PATIENT) {
                count++;
            }
            System.out.println("Количество здоровых:  " + count);
        }

    }
}



