//Kyle Greer

import java.io.*;

public class M8A1 {
    public static void main(String[] args) {

        //opens the input and output files for reading and writing
        try {
            BufferedReader br = new BufferedReader(new FileReader("pay.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"));

            // Skip the header and write the header in the output
            br.readLine();
            bw.write("EmpID,PayRate,HoursWorked,WeeklyPay\n");


            String line;
            while ((line = br.readLine()) != null) {

                //Splitting the line with commas
                String[] p = line.split(",");

                //Extracting the values from CSV
                String id = p[0];
                double rate = Double.parseDouble(p[1]);
                double hours = Double.parseDouble(p[2]);

                //calculating the weekly pay
                double pay;
                if (hours > 40) {
                    pay = 40 * rate + (hours - 40) * rate * 1.5;
                } else {
                    pay = hours * rate;
                }

                //Format the weekly pay by two decimal points
                String formatted = String.format("$%.2f", pay);

                //Write the data to the output
                bw.write(id + "," + rate + "," + hours + "," + formatted + "\n");
            }

            //Close the files
            br.close();
            bw.close();

            //catches and prints errors
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    

