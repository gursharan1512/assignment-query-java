package com.training.dbserver;
import java.util.regex.*;
import java.io.IOException;
import java.util.*;

public class MainClass {

	public static void main(String[] args) throws IOException {
        String str="select * from ipl.csv where season > 2016 and city= 'Bangalore' order by win_by_runs";
        QueryParameter query=new QueryParameter();
        query.tokenize(str);
        ArrayList<String> s=query.CSV(str);
        System.out.println(s);
        //query.str(str);
        query.operators(str);
        query.OperatorsWord(str);
        query.Feilds(str);
        //query.OrderBy(str);
        ReaderFile r=new ReaderFile();
        r.method();
        DateFind f=new DateFind();
        f.Date();
	}
}
