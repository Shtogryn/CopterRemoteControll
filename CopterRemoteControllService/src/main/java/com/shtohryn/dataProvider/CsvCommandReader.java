package com.shtohryn.dataProvider;
import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvCommandReader implements DataReader{

    private final static String COMMANDS = "src/main/resources/comands.csv";
   private BufferedReader br = null;
    private String line = "";
    private  String cvsSplitBy = ",";
    public CsvCommandReader() {
    }

    @Override
    public List<String> read() throws IOException {
        List <String>res=new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(COMMANDS));
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                res= Arrays.asList(country);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }
    }

