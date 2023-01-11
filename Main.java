
//Number of jobs causing error and the corresponding user

import java.io.*;

// Main class
class error {
    // Method
    // To read the file using File Reader
    private static void readUsingFileReader(String fileName)
            throws IOException
    {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        PrintWriter writer = new PrintWriter("C:\\Users\\User\\Documents\\WIX1002\\assignment\\error.txt");
        String line;
        String keyword = "error";
        String type1 = "Invalid qos", type2="permission denied", type3="Nodes not responding", type4="invalid node specified", type5="Registered pending", type6="";

        while ((line = br.readLine()) != null) {
            // process the line
            if(line.contains(keyword)){

                //br.skip(25);
                writer.println(br.readLine());
            }

        }
        br.close();
        fr.close();
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
            throws IOException
    {
        String fileName
                = "C:\\Users\\User\\Documents\\WIX1002\\assignment\\extracted_log";

        // read using FileReader, no encoding support, not
        // efficient
        readUsingFileReader(fileName);
    }
}